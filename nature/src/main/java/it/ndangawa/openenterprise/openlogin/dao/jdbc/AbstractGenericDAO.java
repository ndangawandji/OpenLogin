/**
 * Copyright (c) 2022 ndgwandji.it. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * https://ndgwandji.it/opensources/thedoor/LICENSE.txt
 */
package it.ndangawa.openenterprise.openlogin.dao.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

import it.ndangawa.openenterprise.openlogin.cloud.dca.DataCenter;
import oracle.jdbc.pool.OracleDataSource;
import oracle.jdbc.OracleConnection;
import java.sql.DatabaseMetaData;

/**
 * @author Ndanga Wandji
 *
 */
public abstract class AbstractGenericDAO<T, ID> {
	
	private Class<T> datasClass;
	private static OracleConnection connection;

	/**
	 * 
	 */
	public AbstractGenericDAO() {
		// TODO Auto-generated constructor stub
		connection = new DataCenter().getConnection();
	}
	
	
	public abstract boolean create(T object);
	
	public abstract void deleteById(ID id);
	
	public abstract List<T> readAll();
	
	public abstract T readById(ID id);

	/**
	 * @return the connection
	 */
	public static OracleConnection getConnection() {
		return connection;
	}

	

}
