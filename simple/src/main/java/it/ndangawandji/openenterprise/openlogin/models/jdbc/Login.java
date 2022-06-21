/**
 * Copyright (c) 2022 ndangawa.it. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * https://ndangawa.it/opensources/openenterprise/LICENSE.txt
 */


package it.ndangawandji.openenterprise.openlogin.models.jdbc;

import java.io.Serializable;
import java.util.List;

/**
 * @author Ndanga Wandji
 *
 */
public class Login implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6728978388487408822L;
	
	private int idLogin;
	
	private String username;
	
	private String password;

	private List<Role> roles;

	/**
	 * Default constructor
	 */
	public Login() {

	}

	/**
	 * @param idLogin
	 * @param username
	 * @param password
	 */
	public Login(int idLogin, String username, String password) {
		super();
		this.idLogin = idLogin;
		this.username = username;
		this.password = password;
	}

	/**
	 * @param username
	 * @param password
	 */
	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	/**
	 * @return the idLogin
	 */
	public int getIdLogin() {
		return this.idLogin;
	}

	/**
	 * @param idLogin the primary key idLogin to set
	 */
	public void setIdLogin(int idLogin) {
		this.idLogin = idLogin;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 * @param username the user name to set
	 */
	public void setUsername(String username) {
		this.username = username;
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
	 * @return roles
	 */
	public List<Role> getRoles() {
		return this.roles;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}


}


