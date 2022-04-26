/**
 * Copyright (c) 2022 ndgwandji.it. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * https://ndgwandji.it/opensources/thedoor/LICENSE.txt
 */
package it.ndgwandji.thedoor.nature.models;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * @author ndang
 *
 */
public class Adress implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9201235090477680175L;
	
	private BigInteger AdressID;
	
	private String adressName;
	
	private String pobox;
	
	private String city;
	
	private String region;
	
	private String country;
	
	private String homePhone;
	

	/**
	 * 
	 */
	public Adress() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the adressID
	 */
	public BigInteger getAdressID() {
		return AdressID;
	}


	/**
	 * @param adressID the adressID to set
	 */
	public void setAdressID(BigInteger adressID) {
		AdressID = adressID;
	}


	/**
	 * @return the adressName
	 */
	public String getAdressName() {
		return adressName;
	}


	/**
	 * @param adressName the adressName to set
	 */
	public void setAdressName(String adressName) {
		this.adressName = adressName;
	}


	/**
	 * @return the pobox
	 */
	public String getPobox() {
		return pobox;
	}


	/**
	 * @param pobox the pobox to set
	 */
	public void setPobox(String pobox) {
		this.pobox = pobox;
	}


	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}


	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}


	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}


	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}


	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}


	/**
	 * @return the homePhone
	 */
	public String getHomePhone() {
		return homePhone;
	}


	/**
	 * @param homePhone the homePhone to set
	 */
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

}
