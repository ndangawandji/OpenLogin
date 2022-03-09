/**
 * 
 */
package it.ndgwandji.thedoor.nature.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

import oracle.jdbc.pool.OracleDataSource;
import oracle.jdbc.OracleConnection;
import java.sql.DatabaseMetaData;

/**
 * @author Ndanga Wandji
 *
 */
public abstract class AbstractGenericDAO<T, ID> {
	
	private Class<T> datasClass;
	private Statement statement;
	private OracleConnection connection;

	/**
	 * 
	 */
	public AbstractGenericDAO(Statement statement, OracleConnection connection) {
		// TODO Auto-generated constructor stub
		this.statement = statement;
		this.connection = connection;
	}
	
	
	public abstract int create(T object);
	
	public abstract int deleteById(ID id);
	
	public abstract List<T> readAll();
	
	public abstract T readById(ID id);


	/**
	 * @return the statement
	 */
	public Statement getStatement() {
		return statement;
	}


	/**
	 * @param statement the statement to set
	 */
	public void setStatement(Statement statement) {
		this.statement = statement;
	}

	/**
	 * @return the connection
	 */
	public OracleConnection getConnection() {
		return connection;
	}

	

}
