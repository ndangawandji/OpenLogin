/**
 * Copyright (c) 2022 ndgwandji.it. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * https://ndgwandji.it/opensources/thedoor/LICENSE.txt
 */
package it.ndgwandji.thedoor.nature.dao;

import java.math.BigInteger;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import oracle.jdbc.OracleConnection;
import oracle.sql.DATE;
import it.ndgwandji.thedoor.nature.models.Account;

/**
 * @author Ndanga Wandji
 *
 */
public class AccountDAO extends AbstractGenericDAO<Account, BigInteger> {

	public AccountDAO() {
		super();
	}

	@Override
	public boolean create(Account account) {
		Date d = new Date(account.getAccountInfos().getBirthdate().getTimeInMillis());
		String sql = "{call OPEN_ACCOUNT(?,?,?,?,?,?,?,?)}";
		boolean result = false;
		try {
			CallableStatement callSt = AccountDAO.getConnection().prepareCall(sql);
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
