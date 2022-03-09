/**
 * 
 */
package it.ndgwandji.thedoor.nature.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import oracle.jdbc.pool.OracleDataSource;
import oracle.jdbc.OracleConnection;
import java.sql.DatabaseMetaData;

import java.util.List;

/**
 * @author Ndanga Wandji
 *
 */
public interface GenericDAO<T, ID> {
	
	void create(T instance, Statement statement);
	
	void deleteById(ID id, Statement statement);
	
	List<T> readAll(Statement statement);
	
	List<T> readByColumn(String column, Statement statement);
	
	T readByID(ID id, Statement statement);

}
