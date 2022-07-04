package com.varxyz.jv250.jdbc.banking;

public class OverBalanaceException extends Exception {
	public OverBalanaceException(String ov) {
		super(ov);
		
	}
}
