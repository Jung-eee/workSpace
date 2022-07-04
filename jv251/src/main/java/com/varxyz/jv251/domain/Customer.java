package com.varxyz.jv251.domain;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private long cid;
	private String name;
	private String ssn;
	private String phone;
	private String userId;
	private String password;
	private List<Account> account = new ArrayList<Account>();
	
	public Customer() {
		
	}
	public Customer(String name, String ssn, String phone) {
		this.name = name;
		this.ssn = ssn;
		this.phone = phone;
	}

	public Customer(long cid) {
		this.cid = cid;
	}
		
	public Customer(String name, String ssn, String phone, String userId, String password) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.phone = phone;
		this.userId = userId;
		this.password = password;
	}
	public long getCid() {
		return cid;
	}

	public void setCid(long cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}

	@Override
	public String toString() {		
		return name + ", " + ssn +  ", " + phone;
	}
	 
	 
}
