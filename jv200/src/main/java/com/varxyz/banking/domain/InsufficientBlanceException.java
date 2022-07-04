package com.varxyz.banking.domain;

public class InsufficientBlanceException extends Exception {
	public InsufficientBlanceException(String ms) {
		super(ms);
		
	}
}
