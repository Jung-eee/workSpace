package com.varxyz.banking.domain;

public class CheckingAccount extends Account {
	private double overdraftAmount;
	
	public CheckingAccount(String accountNum, double balance, double overdaraftAmount) {
		super(accountNum, balance);
		this.overdraftAmount = overdaraftAmount;
	}
	public void SetOvedraftAmount(double overdraftAmount) {
		this.overdraftAmount = overdraftAmount;
	}
	public double getOverdfaftAmount() {
		return overdraftAmount;
	}
	
	public void withdraw(double amount) {
		if (balance < amount ) {
			//잔고 부족시 overdrafAmount 금액 한도 내에서 추가 출금을 승인
			try {
				if((amount - balance) > amount) {
					throw new OverBalanaceException("한도초과");	
					//OverBalanaceException() 예외객체 발생 
				}else {
					overdraftAmount  -= amount - balance;
				}
		    }catch(OverBalanaceException e){
		    	System.out.println(e.getMessage());
		    	//throw new OverBalanaceException("한도초과") 출력;	
		    }
		}
		else {
			balance = balance - amount;
		}
	}
}
