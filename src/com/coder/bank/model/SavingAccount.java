package com.coder.bank.model;

public class SavingAccount extends BankAccount {
		
	private String savingAccountNumber;
	
	private double initialBalance=1000;
	
	private double totalBalacne;

	
	
	public SavingAccount(String name, String emailId, String gender) {
		super(name, emailId, gender);
		// TODO Auto-generated constructor stub
	}

	

	public SavingAccount(String name, String emailId, String gender, String savingAccountNumber, double initialBalance,
			double totalBalacne) {
		super(name, emailId, gender);
		this.savingAccountNumber = savingAccountNumber;
		this.initialBalance = initialBalance;
		this.totalBalacne = totalBalacne;
	}



	public String getSavingAccountNumber() {
		return savingAccountNumber;
	}

	public void setSavingAccountNumber(String savingAccountNumber) {
		this.savingAccountNumber = savingAccountNumber;
	}

	public double getInitialBalance() {
		return initialBalance;
	}

	public void setInitialBalance(double initialBalance) {
		this.initialBalance = initialBalance;
	}

	public double getTotalBalacne() {
		return totalBalacne;
	}

	public void setTotalBalacne(double totalBalacne) {
		this.totalBalacne = totalBalacne;
	}

	@Override
	public String toString() {
		return "SavingAccount [savingAccountNumber=" + savingAccountNumber + ", initialBalance=" + initialBalance
				+ ", totalBalacne=" + totalBalacne + "]";
	}
	
	
}
