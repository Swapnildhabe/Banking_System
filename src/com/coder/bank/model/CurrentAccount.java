package com.coder.bank.model;

public class CurrentAccount extends BankAccount {
		

		private String currentAccountNumber;
		
		private double overDraft;
		
		private double totalBalance;

		public CurrentAccount(String name, String emailId, String gender) {
			super(name, emailId, gender);
			// TODO Auto-generated constructor stub
		}

		public CurrentAccount(String name, String emailId, String gender, String currentAccountNumber, double overDraft,
				double totalBalance) {
			super(name, emailId, gender);
			this.currentAccountNumber = currentAccountNumber;
			this.overDraft = overDraft;
			this.totalBalance = totalBalance;
		}

		public String getCurrentAccountNumber() {
			return currentAccountNumber;
		}

		public void setCurrentAccountNumber(String currentAccountNumber) {
			this.currentAccountNumber = currentAccountNumber;
		}

		public double getOverDraft() {
			return overDraft;
		}

		public void setOverDraft(double overDraft) {
			this.overDraft = overDraft;
		}

		public double getTotalBalance() {
			return totalBalance;
		}

		public void setTotalBalance(double totalBalance) {
			this.totalBalance = totalBalance;
		}

		@Override
		public String toString() {
			return "CurrentAccount [currentAccountNumber=" + currentAccountNumber + ", overDraft=" + overDraft
					+ ", totalBalance=" + totalBalance + "]";
		}
		
		
		
		
		
}
