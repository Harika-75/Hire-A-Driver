package com.tmf.entity;

public class User {


	String userName;
	String userRole;
	String contactNo;
	String email;
	
	public User(String userName, String userRole, String contactNo, String email) {
		super();
		this.userName = userName;
		this.userRole = userRole;
		this.contactNo = contactNo;
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
