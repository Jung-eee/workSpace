package com.varxyz.jv250.jdbc.banking;

public class InsufficientBlanceException extends Exception {
	public InsufficientBlanceException(String ms) {
		super(ms);
		
	}
}
