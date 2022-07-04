package com.varxyz.jv251.service;

public class DuplicatedEntityException extends RuntimeException {
	public DuplicatedEntityException(String msg) {
		super(msg);
	}
}
