package com.coder.bank.model;

public class BankAccount {
		
	private String name;
	
	private String emailId;
	
	private String gender;

	public BankAccount(String name, String emailId, String gender) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.gender = gender;
	}
	

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", emailId=" + emailId + ", gender=" + gender + "]";
	}

	
	
	
	
}
