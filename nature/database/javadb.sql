CREATE TABLE login(
    idlogin INTEGER,
    username VARCHAR(45) UNIQUE,
	password VARCHAR(45),
    CONSTRAINT PK_LOGIN PRIMARY KEY(idlogin)
);

CREATE TABLE role(
	idrole INTEGER,
	userrole VARCHAR(45) NOT NULL,
	idlogin INTEGER,
	CONSTRAINT PK_ROLE PRIMARY KEY(idrole),
	CONSTRAINT CK_USERROLE CHECK(userrole IN ('Admin', 'Manager', 'Team member')),
	CONSTRAINT FK_ROLE_LOGIN FOREIGN KEY(idlogin) REFERENCES login(idlogin)
);

CREATE TABLE employee(
    idemployee INTEGER,
    first_name VARCHAR(45) NOT NULL,
	last_name VARCHAR(45) NOT NULL,
	birthdate DATE,
	email VARCHAR(45),
	mobile_phone VARCHAR(45),
	home_phone VARCHAR(45),
	postal_adress VARCHAR(45),
	city VARCHAR(45),
	pobox VARCHAR(45),
	region VARCHAR(45),
	country VARCHAR(45),
	idlogin INTEGER NOT NULL,
    CONSTRAINT PK_EMPLOYEE PRIMARY KEY(idemployee),
	CONSTRAINT FK_EMPLOYEE_LOGIN FOREIGN KEY(idlogin) REFERENCES login(idlogin)
);