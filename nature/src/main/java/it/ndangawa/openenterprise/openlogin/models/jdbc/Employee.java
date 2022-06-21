/**
 * Copyright (c) 2022 ndangawa.it. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * https://www.ndangawa.it/opensources/openenterprise/LICENSE.txt
 */

package it.ndangawa.openenterprise.openlogin.models.jdbc;

import java.io.FileInputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

/**
 * @author Ndanga Wandji
 *
 */
public class Employee implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 5212882469102668059L;
    
    private int idEmployee;
    
    private String firstName;
    
    private String lastName;

    private Calendar birthdate;

    private String email;

    private String mobilePhone;

    private String homePhone;

    private String postalAdress;
	
	private String city;

    private String pobox;
	
	private String region;
	
	private String country;
    
    private FileInputStream picture;
    
    private String sex;

    private Login login;

    private List<BankAccount> bankAccounts;

    /**
     * Default contructor
     */
    private Employee() {
        super();
    }

    /**
     * @param idEmployee
     * @param firstName
     * @param lastName
     * @param birthdate
     * @param email
     * @param mobilePhone
     * @param homePhone
     * @param postalAdress
     * @param city
     * @param pobox
     * @param region
     * @param country
     * @param picture
     * @param sex
     */
    private Employee(int idEmployee, String firstName, String lastName, Calendar birthdate, String email,
                        String mobilePhone, String homePhone, String postalAdress, String city,
                        String pobox, String region, String country, FileInputStream picture, String sex) {
        
        super();
        this.idEmployee = idEmployee;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.email = email;
        this.mobilePhone = mobilePhone;
        this.homePhone = homePhone;
        this.postalAdress = postalAdress;
        this.city = city;
        this.pobox = pobox;
        this.region = region;
        this.country = country;
        this.picture = picture;
        this.sex = sex;
    }

     /**
     * @param firstName
     * @param lastName
     * @param birthdate
     * @param email
     * @param mobilePhone
     * @param homePhone
     * @param postalAdress
     * @param city
     * @param pobox
     * @param region
     * @param country
     * @param picture
     * @param sex
     */
    private Employee(String firstName, String lastName, Calendar birthdate, String email,
                        String mobilePhone, String homePhone, String postalAdress, String city,
                        String pobox, String region, String country, FileInputStream picture,
                        String sex) {
        
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.email = email;
        this.mobilePhone = mobilePhone;
        this.homePhone = homePhone;
        this.postalAdress = postalAdress;
        this.city = city;
        this.pobox = pobox;
        this.region = region;
        this.country = country;
        this.picture = picture;
        this.sex = sex;
    }

    /**
     * @return idEmployee
     */
    public int getIdEmployee() {
        return this.idEmployee;
    }

    /**
     * @param idEmployee the primary key idEmployee to set
     */
    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    /**
     * @return the first name of this employee
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * @param firstName the first name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the last name of this employee
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * @param lastName the last name to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the birth date of this employee
     */
    public Calendar getBirthdate() {
        return this.birthdate;
    }

    /**
     * @param birthdate the birth date to set
     */
    public void setBirthdate(Calendar birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * @return the electronic mail of this employee
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @param email the electronic mail to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the mobile phone of this employee
     */
    public String getMobilePhone() {
        return this.mobilePhone;
    }

    /**
     * @param mobilePhone the mobile phone to set
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * @return the home phone of this employee
     */
    public String getHomePhone() {
        return this.homePhone;
    }

    /**
     * @param homePhone the home phone to set
     */
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    /**
     * @return the postal adress of this employee
     */
    public String getPostalAdress() {
        return this.postalAdress;
    }

    /**
     * @param postalAdress the postal adress to set
     */
    public void setPostalAdress(String postalAdress) {
        this.postalAdress = postalAdress;
    }

    /**
     * @return the city home of this employee
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the home postal box of this employee
     */
    public String getPobox() {
        return this.pobox;
    }

    /**
     * @param pobox the Postal Box to set
     */
    public void setPobox(String pobox) {
        this.pobox = pobox;
    }

    /**
     * @return the home region of this employee
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @param region the home region of this employee to set
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * @return the home country of this employee
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the picture of this employee
     */
    public FileInputStream getPicture() {
        return this.picture;
    }

    /**
     * @param picture the picture to set
     */
    public void setPicture(FileInputStream picture) {
        this.picture = picture;
    }

    /**
     * @return the sex of employee
     */
    public String getSex() {
        return this.sex;
    }

    /**
     * @param sex the sex date to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
	 * @return the login of this employee
	 */
	public Login getLogin() {
		return this.login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(Login login) {
		this.login = login;
	}

    /**
	 * @return The bank accounts of this employee
	 */
	public List<BankAccount> getBankAccounts() {
		return this.bankAccounts;
	}

	/**
	 * @param bankAccounts the bank accounts of this employee to set
	 */
	public void setBankAccounts(List<BankAccount> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}
    

}
