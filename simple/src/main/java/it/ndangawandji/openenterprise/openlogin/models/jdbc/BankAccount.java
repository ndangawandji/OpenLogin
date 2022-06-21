/**
 * Copyright (c) 2022 ndangawandji.it. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * https://www.ndangawandji.it/opensources/openentreprise/LICENSE.txt
 */
package it.ndangawandji.openenterprise.openlogin.models.jdbc;

import java.io.Serializable;

/**
 * @author Ndanga Wandji
 *
 */
public class BankAccount implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7624015660724755153L;
	
	private int idBankAccount;
	
	private String iban;
	
	private String bic;
	
	private String owner;

	private Employee employee;

	/**
	 * Default constructor
	 */
	public BankAccount() {
		super();
	}

	/**
	 * @param iban
	 * @param bic
	 * @param owner
	 */
	public BankAccount(String iban, String bic, String owner) {
		super();
		this.iban = iban;
		this.bic = bic;
		this.owner = owner;
	}

	/**
	 * @param idBankAccount
	 * @param iban
	 * @param bic
	 * @param owner
	 */
	public BankAccount(int idBankAccount, String iban, String bic, String owner) {
		super();
		this.idBankAccount = idBankAccount;
		this.iban = iban;
		this.bic = bic;
		this.owner = owner;
	}

	/**
	 * @return idBankAccount
	 */
	public int getIdBankAccount() {
		return this.idBankAccount;
	}

	/**
	 * @param idBankAccount the idBankAccount to set
	 */
	public void setIdBankAccount(int idBankAccount) {
		this.idBankAccount = idBankAccount;
	}

	/**
	 * @return iban
	 */
	public String getIBAN() {
		return this.iban;
	}

	/**
	 * @param iban the IBAN to set
	 */
	public void setIBAN(String iban) {
		this.iban = iban;
	}

	/**
	 * @return bic
	 */
	public String getBIC() {
		return this.bic;
	}

	/**
	 * @param bic the BIC to set
	 */
	public void setBIC(String bic) {
		this.bic = bic;
	}

	/**
	 * @return owner
	 */
	public String getOwner() {
		return this.owner;
	}

	/**
	 * @param owner the owner of the account to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * @return employee
	 */
	public Employee getEmployee() {
		return this.employee;
	}

	/**
	 * @param employee the employee providing this bank account
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
