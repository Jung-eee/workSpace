package com.varxyz.banking.domain;

public class SavingAccount extends Account {
	private double interestRate;
	
	public SavingAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public void withdraw(double amount) {
		try {
			if(balance - amount < 0) {
				//예외발생 
				throw new InsufficientBlanceException("잔고부족");
				//InsufficientBlanceException() 예외객체 생성
			}
		} catch(InsufficientBlanceException e) {
			System.out.println(e.getMessage());
			//throw new InsufficientBlanceException("잔고부족"); 출력
		}
		super.balance -= amount;
		
	}
	
}
