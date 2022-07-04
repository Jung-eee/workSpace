package com.varxyz.banking.domain;

public class OverBalanaceException extends Exception {
	public OverBalanaceException(String ov) {
		super(ov);
		
	}
}
