package com.varxyz.jv251.exception;

public class OverdraftAmountException extends InsufficientBlanceException {
	private double overdraftAvail;
	public OverdraftAmountException(String msg, double balance, double overdraftAvail) {
		super(msg);
		this.overdraftAvail = overdraftAvail;
	}
	
	@Override
	public String getMessage() {
		return super.getMessage() + ", 사용 가능한 대월액은 " + overdraftAvail + " 입니다.";
	}
}
