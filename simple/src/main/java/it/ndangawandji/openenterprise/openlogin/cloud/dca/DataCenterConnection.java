/**
 * 
 */
package it.ndangawandji.openenterprise.openlogin.cloud.dca;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import oracle.jdbc.pool.OracleDataSource;
import oracle.jdbc.OracleConnection;
import java.sql.DatabaseMetaData;

/**
 * @author Ndanga Wandji
 *
 */
public class DataCenterConnection {

	final static String DB_URL="jdbc:oracle:thin:@dbopensm2018_high?TNS_ADMIN=C:\\Database\\Oracle\\Wallet_DBOpenSM2018";
	final static String DB_USER = "TRANSPAY";
	final static String DB_PASSWORD = "McrT20Tp18#db#";        
	static OracleConnection connectionx;
	/**
	 * 
	 */
	public DataCenterConnection() {
		// TODO Auto-generated constructor stub
	}

}
