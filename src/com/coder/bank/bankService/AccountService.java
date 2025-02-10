package com.coder.bank.bankService;

import java.util.Scanner;

import com.coder.bank.model.CurrentAccount;
import com.coder.bank.model.SavingAccount;

public class AccountService {
	Scanner sc = new Scanner(System.in);
	
//	SavingAccount savingAccount = new SavingAccount();
//	CurrentAccount currentAccount = new CurrentAccount();
	
	private SavingAccount[] listSavingAccount = new SavingAccount[50];
	private CurrentAccount [] listCurrentAccount = new CurrentAccount[50];
	
	private static int savingAccountIndex = 0;
	private static int currentAccountIndex = 0;
	
	
	
	private static int accountNumberCounterSaving = 123;
	private static int accountNumberCounterCurrent = 501;

	public SavingAccount[] openSavingAccount() {
		System.out.println("Enter Your Name:- ");
		String name = sc.next();
		System.out.println("Enter Your Email:- ");
		String email = sc.next();
		System.out.println("Enter your Gender:- ");
		String gender = sc.next();

		double balance;
		do {
			System.out.println("Deposit Initial Amount of Rs 1000/-");
			balance = sc.nextDouble();
			if (balance < 1000) {
				System.err.println("Please deposit Rs 1000 or more to open a Saving Account.");
			}
		} while (balance < 1000);

		String accountNumber = "sav" + accountNumberCounterSaving;
		accountNumberCounterSaving++;

		SavingAccount savingAccount = new SavingAccount();
		savingAccount.setName(name);
		savingAccount.setEmailId(email);
		savingAccount.setGender(gender);
		savingAccount.setSavingAccountNumber(accountNumber);
		savingAccount.setTotalBalance(balance);
		
		
		listSavingAccount[savingAccountIndex] = savingAccount;
		savingAccountIndex++;
		System.out.println("\u001B[32m" + "Congratulations! You have successfully opened a savings account." + "\u001B[0m");
		getAccountDetails(accountNumber);
		return listSavingAccount;

	}
	
	

	public CurrentAccount[] openCurrentAccount() {

		System.out.println("Enter Your Name:- ");
		String name = sc.next();
		System.out.println("Enter Your Email:- ");
		String email = sc.next();
		System.out.println("Enter your Gender:- ");
		String gender = sc.next();
		
		System.out.println("Deposit Some Amount:-");
		double balance = sc.nextDouble();
		String accountNumber = "cur" + accountNumberCounterCurrent;
		accountNumberCounterCurrent++;
		
		CurrentAccount currentAccount = new CurrentAccount();
		currentAccount.setName(name);
		currentAccount.setEmailId(email);
		currentAccount.setGender(gender);
		currentAccount.setCurrentAccountNumber(accountNumber);
		currentAccount.setTotalBalance(balance);
		
		
		listCurrentAccount[currentAccountIndex] = currentAccount;
		currentAccountIndex++;
		
		System.out.println("\u001B[32m" + "Congratulations! You have successfully opened a Current account." + "\u001B[0m");
		getAccountDetails(accountNumber);
		return listCurrentAccount;
	}

	public void openLoanAccount() {

	}

	public void checkBalance(String accountNumber) {
		 for (int i = 0; i < savingAccountIndex; i++) {
	            if (listSavingAccount[i] != null && 
	                listSavingAccount[i].getSavingAccountNumber().equals(accountNumber)) {
	            	System.out.println("\tSaving Account Number: " +"\u001B[31m"+ listSavingAccount[i].getSavingAccountNumber()+"\u001B[0m");
	            	System.out.println("\tName: " + listSavingAccount[i].getName());
	            	System.out.println("\tBalance: Rs " + listSavingAccount[i].getTotalBalance()+"\n");
	            	return;
	            }
		 }
		 for (int i = 0; i < currentAccountIndex; i++) {
	            if (listCurrentAccount[i] != null && 
	            		listCurrentAccount[i].getCurrentAccountNumber().equals(accountNumber)) {
	            	 System.out.println("\tCurrent Account Number: " + "\u001B[31m"+ listCurrentAccount[i].getCurrentAccountNumber()+"\u001B[0m");
	            	 System.out.println("\tName: " + listCurrentAccount[i].getName());
	            	 System.out.println("\tBalance: Rs " + listCurrentAccount[i].getTotalBalance()+"\n");
	            	 return;
	            }
		 }
		 System.err.println(" No account found with Account Number: " + accountNumber);

	}
	
	public void depositAmount(String accountNumber, double value) {
		for (int i = 0; i < savingAccountIndex; i++) {
            if (listSavingAccount[i] != null && 
                listSavingAccount[i].getSavingAccountNumber().equals(accountNumber)) {
            	double lastBlance = listSavingAccount[i].getTotalBalance();
            	listSavingAccount[i].setTotalBalance( listSavingAccount[i].getTotalBalance()+value);
            	
           System.out.println("\tSaving Account Number: " + "\u001B[31m"+ listSavingAccount[i].getSavingAccountNumber()+"\u001B[0m");
            	System.out.println("\t\u001B[90m"+"Last Balance Your Account: "+lastBlance +"\u001B[0m");
            	System.out.println("\tDeposit value is: "+value);
            	System.out.println("\t\u001B[32m"+"Total Balance is: "+listSavingAccount[i].getTotalBalance()+"\u001B[0m");
            }
		}
		 for (int i = 0; i < currentAccountIndex; i++) {
	            if (listCurrentAccount[i] != null && 
	            		listCurrentAccount[i].getCurrentAccountNumber().equals(accountNumber)) {
	            	double lastBalance = listCurrentAccount[i].getTotalBalance();
	            	listCurrentAccount[i].setTotalBalance(listCurrentAccount[i].getTotalBalance()+value);
	            
	            	System.out.println("\tCurrent Account Number: " + "\u001B[31m"+ listCurrentAccount[i].getCurrentAccountNumber()+"\u001B[0m");
	            	System.out.println("\u001B[90m"+"Last Balance Your Account: "+lastBalance +"\u001B[0m");
	            	System.out.println("Deposit value is: "+value);
	            	System.out.println("\u001B[32m"+"Total Balance is: "+listCurrentAccount[i].getTotalBalance()+"\u001B[0m");
	            }
		 }
	}
	
	public void withdrawalValue(String accountNumber,double value) {
		for (int i = 0; i < savingAccountIndex; i++) {
            if (listSavingAccount[i] != null && 
                listSavingAccount[i].getSavingAccountNumber().equals(accountNumber)) {
            	if(listSavingAccount[i].getTotalBalance()<value) {
            		System.err.println("Please enter an amount greater than your current balance.");
            		return;
            	}else {
            		double lastBalance = listSavingAccount[i].getTotalBalance();
            		listSavingAccount[i].setTotalBalance(listSavingAccount[i].getTotalBalance()-value);
            		
            		System.out.println("\tSaving Account Number: " + "\u001B[31m"+ listSavingAccount[i].getSavingAccountNumber()+"\u001B[0m");
            		System.out.println("\u001B[90m"+"Last Balance Your Account: "+lastBalance +"\u001B[0m");
            		System.out.println("Withdrawal value is: "+value);
            		System.out.println("\t\u001B[32m"+"Total Balance is: "+listSavingAccount[i].getTotalBalance()+"\u001B[0m");
            	}
            }
		}
		for (int i = 0; i < currentAccountIndex; i++) {
            if (listCurrentAccount[i] != null && 
            		listCurrentAccount[i].getCurrentAccountNumber().equals(accountNumber)) {
            	double lastBalance = listCurrentAccount[i].getTotalBalance();
            	System.out.println("You Have Facility of Overdraft Up Rs 500/-");
            	if(lastBalance - value >= 500) {
            		listCurrentAccount[i].setTotalBalance(lastBalance - value);
            		System.out.println("\u001B[32mWithdrawal successful!\u001B[0m");
            		System.out.println("\tCurrent Account Number: " + "\u001B[31m"+ listCurrentAccount[i].getCurrentAccountNumber()+"\u001B[0m");
            		System.out.println("\u001B[90m"+"Last Balance Your Account: "+lastBalance +"\u001B[0m");
            		System.out.println("Withdrawal value is: "+value);
            		System.out.println("\u001B[32m"+"Total Balance is: "+listCurrentAccount[i].getTotalBalance()+"\u001B[0m");
            	}} else {
                    System.err.println("Overdraft limit exceeded! Maximum overdraft allowed is Rs 500.");
                }
                return;
            	
            }
			System.err.println("No current account found with Account Number: " + accountNumber);
		}
	
	
	
	
	
	
	
	
	
	public void getAccountDetails(String accountNumber) {
        for (int i = 0; i < savingAccountIndex; i++) {
            if (listSavingAccount[i] != null && 
                listSavingAccount[i].getSavingAccountNumber().equals(accountNumber)) {
                
                System.out.println("\tAccount Found!");
                System.out.println("\tSaving Account Number: " + "\u001B[31m"+ listSavingAccount[i].getSavingAccountNumber()+"\u001B[0m");
                System.out.println("\tName: " + listSavingAccount[i].getName());
                System.out.println("\tEmail: " + listSavingAccount[i].getEmailId());
                System.out.println("\tGender: " + listSavingAccount[i].getGender());
                System.out.println("\tBalance: Rs " + listSavingAccount[i].getTotalBalance()+"\n");
                return;
            }
        }
        for (int i = 0; i < currentAccountIndex; i++) {
            if (listCurrentAccount[i] != null && 
            		listCurrentAccount[i].getCurrentAccountNumber().equals(accountNumber)) {
                
                System.out.println("\tAccount Found!");
                System.out.println("\tCurrent Account Number: " + "\u001B[31m"+listCurrentAccount[i].getCurrentAccountNumber()+"\u001B[0m");
                System.out.println("\tName: " + listCurrentAccount[i].getName());
                System.out.println("\tEmail: " + listCurrentAccount[i].getEmailId());
                System.out.println("\tGender: " + listCurrentAccount[i].getGender());
                System.out.println("\tBalance: Rs " + listCurrentAccount[i].getTotalBalance()+"\n");
                return;
            }
        }
        
        System.out.println(" No account found with Account Number: " + accountNumber);
    }
	
	
}


























