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
public class CreditCard implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7624015660724755153L;
	
	private BigInteger CreditCardID;
	
	private String creditCardNumber;
	
	private String creditCardCrypto;
	
	private Date validityDate;
	
	private String owner;

	/**
	 * 
	 */
	public CreditCard() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the creditCardID
	 */
	public BigInteger getCreditCardID() {
		return CreditCardID;
	}

	/**
	 * @param creditCardID the creditCardID to set
	 */
	public void setCreditCardID(BigInteger creditCardID) {
		CreditCardID = creditCardID;
	}

	/**
	 * @return the creditCardNumber
	 */
	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	/**
	 * @param creditCardNumber the creditCardNumber to set
	 */
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	/**
	 * @return the creditCardCrypto
	 */
	public String getCreditCardCrypto() {
		return creditCardCrypto;
	}

	/**
	 * @param creditCardCrypto the creditCardCrypto to set
	 */
	public void setCreditCardCrypto(String creditCardCrypto) {
		this.creditCardCrypto = creditCardCrypto;
	}

	/**
	 * @return the validityDate
	 */
	public Date getValidityDate() {
		return validityDate;
	}

	/**
	 * @param validityDate the validityDate to set
	 */
	public void setValidityDate(Date validityDate) {
		this.validityDate = validityDate;
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

}
