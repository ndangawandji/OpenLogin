/**
 * Copyright (c) 2022 ndgwandji.it. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * https://ndgwandji.it/opensources/thedoor/LICENSE.txt
 */

package it.ndangawa.openenterprise.account.cloud;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;

import org.ini4j.Ini;
import org.junit.Before;
import org.junit.Test;

import it.ndangawa.openenterprise.openlogin.cloud.dca.DataCenter;

/**
 * @author Ndanga Wandji
 *
 */

public class DataCenterTest {

    private DataCenter dataCenter;
    private String username;
    private String password;
    
    /*
    @Before
    public void setUp() throws IOException {
        dataCenter = new DataCenter();
        username = new String("ndanga");
        password = new String("jUGUZDzvCvZX6p3");
    }

    @Test
    public void dataCenterConnectionTest() throws SQLException {
        String username = new String("ndanga");
        assertEquals(username, DataCenter.getConnection().getUserName());
    }

    @Test
    public void loadConfigTest() throws IOException, URISyntaxException{
        assertEquals(username, dataCenter.loadConfig().get("odc_username"));
        assertEquals(password, dataCenter.loadConfig().get("odc_password"));
    }
    */
    
}
