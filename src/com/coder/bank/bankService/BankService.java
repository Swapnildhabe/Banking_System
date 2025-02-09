package com.coder.bank.bankService;

import java.util.Scanner;

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
			
			openCurrentAccount();
		}
		case 3: {
			
			openLoanAccount();
		}
		case 4: {
			
			checkBalance();
		}
		case 5: {
			
			
		}
		case 6: {
	
	
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
