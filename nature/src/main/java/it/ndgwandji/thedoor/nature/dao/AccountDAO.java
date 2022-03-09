/**
 * 
 */
package it.ndgwandji.thedoor.nature.dao;

import java.math.BigInteger;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import oracle.jdbc.OracleConnection;

import it.ndgwandji.thedoor.nature.models.Account;

/**
 * @author Ndanga Wandji
 *
 */
public class AccountDAO extends AbstractGenericDAO<Account, BigInteger> {

	public AccountDAO(Statement statement, OracleConnection connection) {
		super(statement, connection);
	}

	@Override
	public int create(Account account) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO user_account VALUES(C_ACCOUNT_ID.nextval, " +
						account.getElectronicMail() + ", " + account.getPassword() + ")";
		int result = -1;
		try {
			result = this.getStatement().executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int deleteById(BigInteger id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Account> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account readById(BigInteger id) {
		// TODO Auto-generated method stub
		return null;
	}

}
