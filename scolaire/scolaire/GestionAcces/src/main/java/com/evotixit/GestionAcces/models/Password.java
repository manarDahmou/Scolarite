package com.evotixit.GestionAcces.models;

import javax.persistence.Column;

public class Password {
	@Column
	private String password;

	@Column
	private String confirmPwd;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPwd() {
		return confirmPwd;
	}

	public void setConfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
	}
	
	
}
