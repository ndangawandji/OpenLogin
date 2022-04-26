/**
 * Copyright (c) 2022 ndgwandji.it. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * https://ndgwandji.it/opensources/thedoor/LICENSE.txt
 */


package it.ndgwandji.thedoor.nature.models;

import java.io.File;
import java.io.FileInputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Calendar;

/**
 * @author Ndanga Wandji
 *
 */
public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6728978388487408822L;
	
	private BigInteger AccountID;
	
	private String electronicMail;
	
	private String password;

	private String role;
	
	private PersInfos accountInfos;

	/**
	 * 
	 */
	public Account() {

	}

	/**
	 * @param electronicMail
	 * @param password
	 * @param role
	 */
	public Account(String electronicMail, String password, String role) {
		super();
		this.electronicMail = electronicMail;
		this.password = password;
		this.role = role;
	}

	/**
	 * @param electronicMail
	 * @param password
	 */
	public Account(String electronicMail, String password) {
		super();
		this.electronicMail = electronicMail;
		this.password = password;
	}
	
	/**
	 * @param accountID
	 * @param electronicMail
	 * @param password
	 * @param role
	 * @param accountInfos
	 */
	public Account(BigInteger accountID, String electronicMail, String password, String role, PersInfos accountInfos) {
		super();
		AccountID = accountID;
		this.electronicMail = electronicMail;
		this.password = password;
		this.role = role;
		this.accountInfos = accountInfos;
	}

	public PersInfos initializeInfos(String firstName, String lastName, FileInputStream picture, Calendar birthdate,
			String sex, String mobilePhone) {
		
		return new PersInfos(firstName, lastName, picture, birthdate, sex, mobilePhone);
	}

	/**
	 * @return the accountID
	 */
	public BigInteger getAccountID() {
		return AccountID;
	}

	/**
	 * @param accountID the accountID to set
	 */
	public void setAccountID(BigInteger accountID) {
		AccountID = accountID;
	}

	/**
	 * @return the eMail
	 */
	public String getElectronicMail() {
		return electronicMail;
	}

	/**
	 * @param eMail the eMail to set
	 */
	public void setElectronicMail(String eMail) {
		this.electronicMail = eMail;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the password to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	
	/**
	 * @return the accountInfos
	 */
	public PersInfos getAccountInfos() {
		return accountInfos;
	}

	/**
	 * @param accountInfos the accountInfos to set
	 */
	public void setAccountInfos(PersInfos accountInfos) {
		this.accountInfos = accountInfos;
	}

	
	public class PersInfos implements Serializable{

		/**
		 * 
		 */
		private static final long serialVersionUID = 5212882469102668059L;
		
		private BigInteger PersInfosID;
		
		private String firstName;
		
		private String lastName;
		
		private FileInputStream picture;
		
		private Calendar birthdate;
		
		private String sex;
		
		private String mobilePhone;

		/**
		 * 
		 */
		private PersInfos() {
			super();
			// TODO Auto-generated constructor stub
		}

		/**
		 * @param firstName
		 * @param lastName
		 * @param picture
		 * @param birthdate
		 * @param sex
		 * @param mobilePhone
		 */
		private PersInfos(String firstName, String lastName, FileInputStream picture, Calendar birthdate, String sex, String mobilePhone) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.picture = picture;
			this.birthdate = birthdate;
			this.sex = sex;
			this.mobilePhone = mobilePhone;
		}

		/**
		 * @return the first name
		 */
		public String getFirstName() {
			return firstName;
		}

		/**
		 * @param firstName the first name to set
		 */
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		/**
		 * @return the last name
		 */
		public String getLastName() {
			return lastName;
		}

		/**
		 * @param lastName the last name to set
		 */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		/**
		 * @return the picture
		 */
		public FileInputStream getPicture() {
			return picture;
		}

		/**
		 * @param picture the picture to set
		 */
		public void setPicture(FileInputStream picture) {
			this.picture = picture;
		}

		/**
		 * @return the birth data
		 */
		public Calendar getBirthdate() {
			return birthdate;
		}

		/**
		 * @param birthdate the birth date to set
		 */
		public void setBirthdate(Calendar birthdate) {
			this.birthdate = birthdate;
		}

		/**
		 * @return the sex
		 */
		public String getSex() {
			return sex;
		}

		/**
		 * @param sex the sex date to set
		 */
		public void setSex(String sex) {
			this.sex = sex;
		}

		/**
		 * @return the mobile phone
		 */
		public String getMobilePhone() {
			return mobilePhone;
		}

		/**
		 * @param mobilePhone the mobile phone date to set
		 */
		public void setMobilePhone(String mobilePhone) {
			this.mobilePhone = mobilePhone;
		}
		
	}	

}


