/**
 * Copyright (c) 2022 ndgwandji.it. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * https://ndangawa.it/opensources/openenterprise/LICENSE.txt
 */


package it.ndangawandji.openenterprise.openlogin.models.jdbc;

import java.io.Serializable;

/**
 * @author Ndanga Wandji
 *
 */
public class Role implements Serializable {

    /**
	 * 
	 */
	
	private int idRole;
	
	private String userrole;
	
	private Login login;

	/**
	 * Default constructor
	 */
	public Role() {

	}

    /**
	 * @param idRole
     * @param userrole
	 */
	public Role( int idRole, String userrole) {
        this.idRole = idRole;
        this.userrole = userrole;
	}

    /**
	 * @param userrole
	 */
	public Role(String userrole) {
        this.userrole = userrole;
	}

    /**
	 * @return idRole
	 */
	public int getIdRole() {
		return this.idRole;
	}

	/**
	 * @param idRole the primary key idRole to set
	 */
	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

    /**
	 * @return userrole
	 */
	public String getUserrole() {
		return this.userrole;
	}

	/**
	 * @param userrole the user role to set
	 */
	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}

    /**
	 * @return login
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
    
}
