package com.varxyz.jv251.exception;

public class InsufficientBlanceException extends RuntimeException {
	private double balance;
	
	public InsufficientBlanceException(String ms) {
		super(ms);
		
	}
	public InsufficientBlanceException(String ms,double balance) {
		super(ms);
		this.balance = balance;
		
	}
	public String getMessage() {
		return super.getMessage() + "현재잔고는" + balance + "입니다.";
	}
	
}
