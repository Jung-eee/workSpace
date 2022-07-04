package com.varxyz.banking.domain;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private long cid;
	private String name;
	private String ssn;
	private String phone;
	private String customerId;
	private String password;
	List<Account> account = new ArrayList<Account>();
	
	public Customer(String name, String ssn, String phone, String customerId, String password) {
		this.name = name ;
		this.ssn = ssn;
		this.phone = phone;
		this.customerId = customerId;
		this.password = password;
	}

	public Customer(long cid) {
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

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
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
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	
	 
	 
}
