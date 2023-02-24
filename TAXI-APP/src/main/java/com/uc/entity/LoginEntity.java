package com.uc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="logindetail")
public class LoginEntity {
	@Id
	@Column(name="usename")
	private String userName;
	@Column(name="password")
	private String passWord;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassword(String passWord) {
		this.passWord = passWord;
	}

}
