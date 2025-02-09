package com.coder.bank.bankService;

import java.util.Scanner;

import com.coder.bank.model.CurrentAccount;
import com.coder.bank.model.SavingAccount;

public class AccountService {
	Scanner sc = new Scanner(System.in);
	SavingAccount savingAccount = new SavingAccount();
	CurrentAccount currentAccount = new CurrentAccount();
	CurrentAccount [] listCurrentAccount;
	SavingAccount[] listSavingAccount;
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
				System.out.println("Please deposit Rs 1000 or more to open a Saving Account.");
			}
		} while (balance < 1000);

		String accountNumber = "sav" + accountNumberCounterSaving;
		accountNumberCounterSaving++;

		
		savingAccount.setName(name);
		savingAccount.setEmailId(email);
		savingAccount.setGender(gender);
		savingAccount.setSavingAccountNumber(accountNumber);
		savingAccount.setTotalBalance(balance);
		
		listSavingAccount = new SavingAccount[10];
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
		
		currentAccount.setName(name);
		currentAccount.setEmailId(email);
		currentAccount.setGender(gender);
		currentAccount.setCurrentAccountNumber(accountNumber);
		currentAccount.setTotalBalance(balance);
		
		listCurrentAccount = new CurrentAccount[10];
		listCurrentAccount[currentAccountIndex] = currentAccount;
		currentAccountIndex++;
		
		System.out.println("\u001B[32m" + "Congratulations! You have successfully opened a Current account." + "\u001B[0m");
		getAccountDetails(accountNumber);
		return listCurrentAccount;
	}

	public void openLoanAccount() {

	}

	public void checkBalance() {

	}
	
	public void getAccountDetails(String accountNumber) {
        for (int i = 0; i < savingAccountIndex; i++) {
            if (listSavingAccount[i] != null && 
                listSavingAccount[i].getSavingAccountNumber().equals(accountNumber)) {
                
                System.out.println("\tAccount Found!");
                System.out.println("\tSaving Account Number: " + listSavingAccount[i].getSavingAccountNumber());
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
                System.out.println("\tCurrent Account Number: " + listCurrentAccount[i].getCurrentAccountNumber());
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


























