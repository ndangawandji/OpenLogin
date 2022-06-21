/**
 * Copyright (c) 2022 ndgwandji.it. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * https://ndgwandji.it/opensources/thedoor/LICENSE.txt
 */

package it.ndangawa.openenterprise.account.dao.jdbc;

import org.junit.Before;
import org.junit.Test;

import it.ndangawa.openenterprise.openlogin.dao.jdbc.AccountDAO;
import it.ndangawa.openenterprise.openlogin.models.jdbc.Account;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * @author Ndanga Wandji
 *
 */

public class LoginDAOTest {
    
    private AccountDAO accountDAO = new AccountDAO();
    private Account account;

    /*
    @Before
    public void setUp(){
        File picture = new File("C:\\Users\\ndang\\Downloads\\thumbnail_image001.png");
        FileInputStream fileIS = null;
        try {
            fileIS = new FileInputStream(picture);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Calendar birthdate = new GregorianCalendar(2005, Calendar.APRIL, 5);
        account = new Account("chloesamedjeu@gmail.com", "chloe");
        Account.PersInfos persInfos = account.initializeInfos("chloé", "samedjeu", fileIS, birthdate, "F", "0745508187");
        account.setAccountInfos(persInfos);
    }
    
    @Test
    public void createAccountDAOTest() throws Exception{
        assertFalse(accountDAO.create(account));
    }
    */

    @Test
    public void readAll(){
        List<Account> accounts = accountDAO.readAll();
        int i = 0;
        Calendar[] date = {new GregorianCalendar(1989, Calendar.MARCH, 10),
                            new GregorianCalendar(2005, Calendar.APRIL, 5)};
        for (Account account : accounts) {
            assertEquals(date[i], account.getAccountInfos().getBirthdate());
            i++;
        }
    }
    

}
