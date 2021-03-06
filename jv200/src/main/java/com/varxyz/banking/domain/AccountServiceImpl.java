package com.varxyz.banking.domain;
import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService{
	private static AccountService service = new AccountServiceImpl();
	private List<Account>accountList = new ArrayList<Account>();
	private CustomerService customerService;
	
	private AccountServiceImpl() {
		customerService = CustomerServiceImpl.getInstance();
	}
	public static AccountService getInstance() {
		return service;
	}
	
	public Account createSavingAccount(String accountNum, double balance, double interestRate) {
		return new SavingAccount(accountNum, balance, interestRate);
	}
	public Account createCheckingAccount(String accountNum, double balance, double overdraftAmount) {
		return new CheckingAccount(accountNum, balance, overdraftAmount);
	}
	/*
	 * 신규 계좌 등록 
	 * 계좌정보와 고객정보 전체를 캡슐화*/
	public void addAccount(Account account) {
		accountList.add(account);
	}
	/*
	 * 전달한 ssn을 통해 고객을 조회한 후 신규 계좌 등록
	 * */
	public void addAccount(Account account, String ssn) {
		Customer customer = customerService.getCustomerBySsn(ssn);
		account.setCustomer(customer);
	}
	public List<Account> getAccountBySsn(String ssn){
		return null;
	}
	public Account getAccountByAccountNum(String accountNum) {
		return null;
	}
	
}
