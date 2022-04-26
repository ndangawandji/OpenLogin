/**
 * 
 */
package it.ndgwandji.thedoor.nature.dca;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.ini4j.Ini;

import oracle.jdbc.pool.OracleDataSource;
import oracle.jdbc.OracleConnection;

/**
 * @author Ndanga Wandji
 *
 */
public class DataCenter {

	private static OracleConnection connection;
	
	/**
	 * @throws  
	 * @throws URISyntaxException 
	 * 
	 */
	public DataCenter() {
		// TODO Auto-generated constructor stub
		Ini.Section section;
		String username;
		String password;
		String databaseURL;
		Properties info = new Properties();
		try {
			section = loadConfig();
			username = section.get("odc_username");
			password = section.get("odc_password");
			databaseURL = "jdbc:oracle:thin:" + section.get("odc_tnsalias") + "?TNS_ADMIN=" + section.get("odc_oraclewallet");
			info = new Properties();
			info.put(OracleConnection.CONNECTION_PROPERTY_USER_NAME, username);
		    info.put(OracleConnection.CONNECTION_PROPERTY_PASSWORD, password);         
		    info.put(OracleConnection.CONNECTION_PROPERTY_DEFAULT_ROW_PREFETCH, "20");
		    OracleDataSource ods = new OracleDataSource();
		    ods.setURL(databaseURL);    
		    ods.setConnectionProperties(info);
		    OracleConnection connection = (OracleConnection) ods.getConnection();
		    DataCenter.connection = connection;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
     * Set the value of connection
     *
     * @param connection new value of connection
     */
	public static OracleConnection getConnection(){
		return connection;
	}
	
	/**
	 * @throws URISyntaxException 
	 * 
	 */
	private Ini.Section loadConfig() throws IOException, URISyntaxException {
		
		File file = new File("C:\\Users\\ndang\\Workspaces\\sources\\ndgwandji.it\\TheDoor\\nature\\src\\main\\resources\\META-INF\\config.ini");
		FileReader fileReader = new FileReader(file);
		Ini ini = new Ini();
		ini.load(fileReader);
		Ini.Section section = ini.get("OracleDataCenter");
		
		return section;
	}

}
