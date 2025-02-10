package com.coder.bank.bankService;

import java.util.Scanner;

import com.coder.bank.model.CurrentAccount;
import com.coder.bank.model.SavingAccount;

public class BankService extends AccountService {
	boolean getExit=true;
	
	public BankService() {
		super();
		System.out.println("\n\t***$ Welcome to New GenTech Bank $***");
		System.out.println("\t   Your Trusted Financial Partner!\n" );
		
		serviceList();
	}

	private void serviceList() {
		
		
		while(getExit) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("1) Open Saving Account");
		System.out.println("2) Open Current Account");
		System.out.println("3) Open Loan Account");
		System.out.println("4) Check Balance");
		System.out.println("5) Deposit Amount");
		System.out.println("6) Withdrawal Amount");
		System.out.println("7) Exit");
		System.out.println("Enter The Number You Want Service...");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: {
			SavingAccount[] openSavingAccount = openSavingAccount();
			break;
		}
		case 2: {
			
			CurrentAccount[] openCurrentAccount = openCurrentAccount();
			break;
		}
		case 3: {
			
			openLoanAccount();
		}
		case 4: {
			System.out.println("\u001B[34m"+"Enter Your Account Number For Saving 'sav' and '111' uniq number For Current 'cur' and '111' uniq number Follows"+ "\u001B[0m");
				String accountNumber = sc.next();
			checkBalance(accountNumber);
			break;
		}
		case 5: {
			System.out.println("\u001B[34m"+"Enter Your Account Number For Saving 'sav' and '111' uniq number For Current 'cur' and '111' uniq number Follows"+ "\u001B[0m");
			String accountNumber = sc.next();
			System.out.println("Enter The Amount You Want To Deposit In Your Account :-");
			double value = sc.nextDouble();
			depositAmount(accountNumber, value);
			break;
		}
		case 6: {
			System.out.println("\u001B[34m"+"Enter Your Account Number For Saving 'sav' and '111' uniq number For Current 'cur' and '111' uniq number Follows"+ "\u001B[0m");
			String accountNumber = sc.next();
			System.out.println("Enter The Amount You Want To Withdrawal From Your Account :-");
			double value = sc.nextDouble();
			
				withdrawalValue(accountNumber,value);
				break;
		}
		case 7: {
			System.out.println("Thank you for banking with us! We look forward to welcoming you again.");
			getExit=false;
			break;
		}
		
		default:
			System.err.println("\n\tChoose Between Given Option (1 To 7) ");
		}
	}
		
	}
	
}
