package com.varxyz.banking.domain;

import java.util.Collection;

public interface CustomerService {
	void addCustomer(Customer customer);
	Customer getCustomerBySsn(String ssn);
	Collection<Customer> getAllCustomesr();
	int getNumOfCustomer();
	
}
