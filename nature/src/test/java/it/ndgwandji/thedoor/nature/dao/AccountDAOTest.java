/**
 * Copyright (c) 2022 ndgwandji.it. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * https://ndgwandji.it/opensources/thedoor/LICENSE.txt
 */

package it.ndgwandji.thedoor.nature.dao;

import org.junit.Before;
import org.junit.Test;

import it.ndgwandji.thedoor.nature.models.Account;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Ndanga Wandji
 *
 */

public class AccountDAOTest {
    
    private AccountDAO accountDAO = new AccountDAO();
    private Account account;
    
    @Before
    public void setUp(){
        File picture = new File("C:\\Users\\ndang\\Downloads\\thumbnail_image001.png");
        FileInputStream fileIS = null;
        try {
            fileIS = new FileInputStream(picture);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Calendar birthdate = new GregorianCalendar(1989, Calendar.MARCH, 10);
        account = new Account("cedric.ndanga.wandji@gmail.com", "virgile");
        Account.PersInfos persInfos = account.initializeInfos("ndanga", "wandji", fileIS, birthdate, "M", "0617311125");
        account.setAccountInfos(persInfos);
    }
    
    @Test
    public void createAccountDAOTest() throws Exception{
        assertFalse(accountDAO.create(account));
    }
    

}
