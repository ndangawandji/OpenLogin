/**
 * Copyright (c) 2022 ndgwandji.it. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * https://ndgwandji.it/opensources/thedoor/LICENSE.txt
 */

package it.ndgwandji.thedoor.nature.mbeans;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.Calendar;

import javax.enterprise.context.RequestScoped;
import javax.imageio.stream.FileImageInputStream;
import javax.inject.Named;

import it.ndgwandji.thedoor.nature.dao.AccountDAO;
import it.ndgwandji.thedoor.nature.models.Account;

/**
 * @author Ndanga Wandji
 *
 */

@Named
@RequestScoped
public class RegisterBean implements Serializable {

    private String sex;
    private String firstName;
    private String lastName;
    private File picture;
    private Calendar birthDate;
    private String mobilePhone;
    private String email;
    private String password;
    private String password2; 

    public RegisterBean(){
        
    }

    public String applyForRegistration(){

        AccountDAO accountDAO = new AccountDAO();
        Account account = new Account(email, password);
        FileInputStream fileIS = null;
        try {
            fileIS = new FileInputStream(picture);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Account.PersInfos accountInfos = account.initializeInfos(firstName, lastName, fileIS, birthDate, sex, mobilePhone);
        account.setAccountInfos(accountInfos);
        accountDAO.create(account);
        return "/response.xhtml";
    }

    public String cancelApplication(){

        return "/index.xhtml";
    }

    public void checkPassword(){
        
    }

    /**
     * Set the value of sex
     *
     * @param sex new value of sex
     */
    public void setSex(String sex){
        this.sex = sex;
    }

    /**
     * Get the value of sex
     *
     * @return the value of sex
     */
    public String getSex(){
        return sex;
    }

    /**
     * Set the value of firstName
     *
     * @param firstName new value of first name
     */
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    /**
     * Get the value of firstName
     *
     * @return the value of first name
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * Set the value of lastName
     *
     * @param lastName new value of last name
     */
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    /**
     * Get the value of lastName
     *
     * @return the value of last name
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * Set the value of picture
     *
     * @param picture new value of picture
     */
    public void setPicture(File picture){
        this.picture = picture;
    }

    /**
     * Get the value of picture
     *
     * @return the value of picture
     */
    public File getPicture(){
        return picture;
    }

    /**
     * Set the value of birthDate
     *
     * @param birthDate new value of birth date
     */
    public void setBirthDate(Calendar birthDate){
        this.birthDate = birthDate;
    }

    /**
     * Get the value of birthDate
     *
     * @return the value of birth date
     */
    public Calendar getBirthDate(){
        return birthDate;
    }

    /**
     * Set the value of mobilePhone
     *
     * @param mobilePhone new value of mobile phone
     */
    public void setMobilePhone(String mobilePhone){
        this.mobilePhone = mobilePhone;
    }

    /**
     * Get the value of mobilePhone
     *
     * @return the value of mobile phone
     */
    public String getMobilePhone(){
        return mobilePhone;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of password
     *
     * @param password new value of password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get the value of password
     *
     * @return the value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the value of password2
     *
     * @param password2 new value of password2
     */
    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    /**
     * Get the value of password2
     *
     * @return the value of password2
     */
    public String getPassword2() {
        return password2;
    }

    
    
}
