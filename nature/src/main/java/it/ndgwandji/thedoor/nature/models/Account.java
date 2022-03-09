/**
 * 
 */
package it.ndgwandji.thedoor.nature.models;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;

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
	
	private PersInfos accountInfos;

	/**
	 * 
	 */
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param accountID
	 * @param electronicMail
	 * @param password
	 * @param accountInfos
	 */
	public Account(BigInteger accountID, String electronicMail, String password, PersInfos accountInfos) {
		super();
		AccountID = accountID;
		this.electronicMail = electronicMail;
		this.password = password;
		this.accountInfos = accountInfos;
	}

	public PersInfos initializeInfos(String firstName, String lastName, Byte picture, Date birthdate,
			int sex, String mobilePhone) {
		
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

	
	private class PersInfos implements Serializable{

		/**
		 * 
		 */
		private static final long serialVersionUID = 5212882469102668059L;
		
		private BigInteger PersInfosID;
		
		private String firstName;
		
		private String lastName;
		
		private Byte picture;
		
		private Date birthdate;
		
		private int sex;
		
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
		private PersInfos(String firstName, String lastName, Byte picture, Date birthdate, int sex, String mobilePhone) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.picture = picture;
			this.birthdate = birthdate;
			this.sex = sex;
			this.mobilePhone = mobilePhone;
		}
		
	}	

}


