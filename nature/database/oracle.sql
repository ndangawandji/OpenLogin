/**
 * Copyright (c) 2022 ndangawandji.it. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * https://www.ndangawandji.it/opensources/openentreprise/LICENSE.txt
 */



/****************************************************************************
 *************** Data table creations of the Oracle data base ***************
 ****************************************************************************
 */

CREATE TABLE login (
    id_login NUMBER(38),
    username VARCHAR2(45),
    password VARCHAR2(45),
    CONSTRAINT PK_LOGIN PRIMARY KEY(id_login),
);

CREATE TABLE role (
    id_role NUMBER(38),
    userrole VARCHAR2(45),
    id_login NUMBER(38),
    CONSTRAINT PK_ACCOUNT PRIMARY KEY(id_role),
	CONSTRAINT CK_USERROLE CHECK(userrole IN ('Admin', 'Manager', 'Team member')),
    CONSTRAINT FK_ROLE_LOGIN FOREIGN KEY(id_login) REFERENCES login(id_login)
);

CREATE TABLE employee(
    id_employee NUMBER(38),
    first_name VARCHAR2(45) NOT NULL,
    last_name VARCHAR2(45) NOT NULL,
    birthdate DATE NOT NULL,
    sex CHAR(1) NOT NULL,
    email VARCHAR2(45) NOT NULL,
    mobile_phone VARCHAR2(45) NOT NULL,
    home_phone VARCHAR2(45) NOT NULL,
    postal_address VARCHAR2(100) NOT NULL,
    city VARCHAR2(45) NOT NULL,
    pobox VARCHAR2(45) NOT NULL,
    region VARCHAR2(45) NOT NULL,
    country VARCHAR2(45) NOT NULL,
    id_login NUMBER(38) NOT NULL,
    CONSTRAINT PK_EMPLOYEE PRIMARY KEY(id_employee),
    CONSTRAINT CK_SEX CHECK(sex IN ('M', 'F')),
    CONSTRAINT FK_EMPLOYEE_LOGIN FOREIGN KEY(id_login)REFERENCES login(id_login) ON DELETE CASCADE
);

CREATE TABLE bank_account(
    id_bank_account NUMBER(38),
    iban VARCHAR2(45) NOT NULL,
    bic VARCHAR2(45) NOT NULL,
    owner VARCHAR2(100) NOT NULL,
    id_employee NUMBER(38) NOT NULL,
    CONSTRAINT PK_BANK_ACCOUNT PRIMARY KEY(id_bank_account),
    CONSTRAINT FK_BANK_ACCOUNT_EMPLOYEE FOREIGN KEY(id_employee) REFERENCES employee(id_employee)
        ON DELETE CASCADE
);

/****************************************************************************
 *************** Sequences for autogeneration of primary keys ***************
 ****************************************************************************
 */

CREATE SEQUENCE count_id_login START WITH 1 NOMAXVALUE; /* Auto increment id_login */

CREATE SEQUENCE Count_id_role START WITH 1 NOMAXVALUE; /* Auto increment id_role */

CREATE SEQUENCE count_id_employee START WITH 1 NOMAXVALUE; /* Auto increment id_employee */

CREATE SEQUENCE count_id_bank_account START WITH 1 NOMAXVALUE; /* Auto increment id_bank_account */


/***********************************************************
 *************** operations on the data base ***************
 ***********************************************************
 */

CREATE OR REPLACE TRIGGER BEF_INS_TABLE_ACCOUNT_INFOS
BEFORE INSERT ON employee FOR EACH ROW
DECLARE
    firstChar CHAR;
    firstName employee.firstname%TYPE;
    lastName employee.lastname%TYPE;
BEGIN
    firstName := :NEW.first_name;
    firstChar := SUBSTR(firstName, 1, 1);
    :NEW.first_name := CONCAT(UPPER(firstChar), SUBSTR(firstName, 2, 64));
    lastName := :NEW.last_name;
    firstChar := SUBSTR(lastName, 1, 1);
    :NEW.last_name := CONCAT(UPPER(firstChar), SUBSTR(lastName, 2, 64));
END;

CREATE OR REPLACE PROCEDURE create_account(username IN VARCHAR2, password IN VARCHAR2, userrole IN VARCHAR2,
    firstname IN VARCHAR2, lastname IN VARCHAR2, birthdate IN DATE, sex IN CHAR, email IN VARCHAR2,
    mobile_phone IN VARCHAR2, home_phone IN VARCHAR2, postal_address IN VARCHAR2, city IN VARCHAR2,
    pobox IN VARCHAR2, region IN VARCHAR2, country IN VARCHAR2
) IS
id login.id_login%type;
user_role CHAR;
numberOfUsers NUMBER;
BEGIN
    SELECT COUNT(*) INTO numberOfUsers FROM user_account;
    IF numberofusers = 0 & userrole = 'Admin' THEN
        RETURN -1;
        user_role := 'U';
    ELSE
        user_role := 'S';
    END IF;   
    id := count_id_login.nextval; 
    INSERT INTO login VALUES(id, username, password);
    /* SELECT id_login INTO id FROM login WHERE username = username; */
    INSERT INTO role VALUES(count_id_role.nextval, userrole, id);
    INSERT INTO employee VALUES(count_id_employee, firstname, lastname, birthdate, sex, email,
        mobile_phone, home_phone, postal_address, city, pobox, region, country, id);
END;
/

CREATE OR REPLACE PROCEDURE create_first_account(username IN VARCHAR2, password IN VARCHAR2,
    firstname IN VARCHAR2, lastname IN VARCHAR2, birthdate IN DATE, sex IN CHAR, email IN VARCHAR2,
    mobile_phone IN VARCHAR2, home_phone IN VARCHAR2, postal_address IN VARCHAR2, city IN VARCHAR2,
    pobox IN VARCHAR2, region IN VARCHAR2, country IN VARCHAR2
) IS
id login.idlogin%type;
BEGIN
    id := count_id_login.nextval;
    INSERT INTO login VALUES(id, username, password);
    /* SELECT id_login INTO id FROM user_account WHERE username = username; */
    INSERT INTO login VALUES(count_id_role.nextval, userrole, id);
    INSERT INTO employee VALUES(count_id_employee, firstname, lastname, birthdate, sex, email,
        mobile_phone, home_phone, postal_address, city, pobox, region, country, id);
END;
/