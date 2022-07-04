package com.varxyz.banking.domain;
import java.util.*;
public class CustomerServiceImpl2 implements CustomerService{
	private List<Customer> customerList = new ArrayList<Customer>();
	
	public void addCustomer(Customer customer) {
		if (getCustomerBySsn(customer.getSsn()) == null) {
			customerList.add(customer);
		}
		
	}
	
	public Customer getCustomerBySsn(String ssn) {
		for (Customer customer : customerList) {
			if (ssn.equals(customer.getSsn())) {
				return customer;
			}
		}
		return null;
	}

	public int getNumOfCustomer() {
		return customerList.size();
	}
	public Collection<Customer> getAllCustomesr() {
		return customerList;
	}
	
	
	
}
