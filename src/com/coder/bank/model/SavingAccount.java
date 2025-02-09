package com.coder.bank.model;

public class SavingAccount extends BankAccount {
		
	private String savingAccountNumber;
	
	private double initialBalance=1000;
	
	private double totalBalance;

//	private BankAccount bankAccount;
	
	
	

	
	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
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

	public double getTotalBalance() {
		return totalBalance;
	}

	public void setTotalBalance(double totalBalacne) {
		this.totalBalance = totalBalacne;
	}



	@Override
	public String toString() {
		return "SavingAccount [savingAccountNumber=" + savingAccountNumber + ", initialBalance=" + initialBalance
				+ ", totalBalacne=" + totalBalance + super.toString() + "]";
	}
	
	

	

//	@Override
//	public String toString() {
//		return "SavingAccount [savingAccountNumber=" + savingAccountNumber + ", initialBalance=" + initialBalance
//				+ ", totalBalacne=" + totalBalacne + "]";
//	}
	
	
}
