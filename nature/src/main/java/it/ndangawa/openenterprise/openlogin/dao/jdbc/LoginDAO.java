/**
 * Copyright (c) 2022 ndgwandji.it. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * https://ndangawa.it/opensources/thedoor/LICENSE.txt
 */
package it.ndangawa.openenterprise.openlogin.dao.jdbc;

import java.io.FileInputStream;
import java.math.BigInteger;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import it.ndangawa.openenterprise.openlogin.models.jdbc.Login;

/**
 * @author Ndanga Wandji
 *
 */
public class LoginDAO extends AbstractGenericDAO<Login, BigInteger> {

	public LoginDAO() {
		super();
	}

	@Override
	public boolean create(Login account) {
		Date d = new Date(account.getAccountInfos().getBirthdate().getTimeInMillis());
		String sql = "{call OPEN_ACCOUNT(?,?,?,?,?,?,?,?)}";
		boolean result = false;
		try {
			CallableStatement callSt = LoginDAO.getConnection().prepareCall(sql);
			callSt.setString(1, account.getElectronicMail());
			callSt.setString(2, account.getPassword());
			callSt.setString(3, account.getAccountInfos().getFirstName());
			callSt.setString(4, account.getAccountInfos().getLastName());
			callSt.setBlob(5, account.getAccountInfos().getPicture());
			callSt.setDate(6, d);
			callSt.setString(7, account.getAccountInfos().getSex());
			callSt.setString(8, account.getAccountInfos().getMobilePhone());
			result = callSt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public void deleteById(BigInteger id) {

		int accountID = id.intValue();
		String sql = "delete from user_account where account_id = ?";
		try {
			boolean result;
			PreparedStatement st = AccountDAO.getConnection().prepareStatement(sql);
			st.setInt(1, accountID);
			result = st.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Account> readAll() {
		List<Account> accounts = new ArrayList<>();
		ResultSet rs;
		String sql = "select * from user_account, account_infos " +
						"where account_id = account_infos_id";
		try {
			Statement st = AccountDAO.getConnection().createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				Calendar birthdate = new GregorianCalendar();
				birthdate.setTimeInMillis(rs.getDate("birthdate").getTime());
				Account account = new Account(rs.getInt("account_id"),
									rs.getString("electronic_mail"),
									rs.getString("account_password"),
									rs.getString("user_role"));
				
				Account.PersInfos infos = account.initializeInfos(rs.getString("firstname"),
											rs.getString("lastname"),
											(FileInputStream) rs.getBlob("picture").getBinaryStream(),
											birthdate,
											rs.getString("sexe"),
											rs.getString("phone"));
				account.setAccountInfos(infos);
				accounts.add(account);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return accounts;
	}

	@Override
	public Account readById(BigInteger id) {
		// TODO Auto-generated method stub
		return null;
	}

}
