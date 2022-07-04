package com.varxyz.banking.domain;
import java.util.*;

public class CustomerServiceImpl implements CustomerService {
	private static CustomerService service = new CustomerServiceImpl();
	private Map<String, Customer > map = new HashMap<String, Customer>(); 
	
	private CustomerServiceImpl() {
		
	}
	
	public static CustomerService getInstance() {
		return service;
	}
	
	public void addCustomer(Customer customer) {
		if (!map.containsKey(customer.getSsn())) {
			map.put(customer.getSsn(), customer);
			System.out.println("성공");
		}
	}
	public Customer getCustomerBySsn(String ssn) {
		// TODO Auto-generated method stub
		if (map.containsKey(ssn)) {
			return map.get(ssn);
		}
		return null;
	}
	public Collection<Customer> getAllCustomesr() {
		return map.values();
	}
	
	public int getNumOfCustomer() {
		return map.size();
	}
}
