package com.varxyz.jv251.service;

import java.util.List;

import com.varxyz.jv251.dao.AccountDao;
import com.varxyz.jv251.domain.Account;

public class Accountservice {
	private AccountDao accountDao;
	
	public Accountservice(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	public void addAccount(Account account) {
		accountDao.addAccount(account);
	}
	
	public static void main(String[] args) {
		Accountservice service = new Accountservice(null);
		System.out.println(service.generateAccountNum());
	}
	
	public String generateAccountNum() {
		String numStr = String.valueOf((int)(Math.random() * 100000000));
		StringBuilder sb = new StringBuilder();
		sb.append(numStr.substring(0,3));
		sb.append("-");
		sb.append(numStr.substring(3,5));
		sb.append("-");
		sb.append(numStr.substring(5));
		return sb.toString();
	}
	public List<Account> getAllAccount() {
		return accountDao.findAllAccount();
	}
	public List<Account> getAllAccountBySsn(String ssn) {
		return accountDao.findAccountsBySsn(ssn);
	}
	
	
	
}
