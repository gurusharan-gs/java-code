package com._5_fifty;

public class BankAccount {
	
	private String accountNumber;
	private double balance;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance < 0) {
			System.out.println("balance cannot be negative");
            return;
		}
		this.balance = balance;
	}
	
	
	public static void main(String[] args) {
	    BankAccount bank = new BankAccount();
	    bank.setAccountNumber("12345679012");
	    
	    
	    bank.setBalance(50.45);
	    bank.getBalance();
	    
	    System.out.println(bank.getAccountNumber());
	    System.out.println(bank.getBalance());
	}
	

}
