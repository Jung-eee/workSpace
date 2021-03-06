package com.varxyz.jv251.service;

import java.sql.DriverManager;
import java.util.List;

import com.varxyz.jv251.dao.CustomerDao;
import com.varxyz.jv251.domain.Customer;

public class CustomerService {
	private CustomerDao customerDao;
	public CustomerService(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	public Customer creatCustomer(String name, String ssn, String phone, String userId, String passwd) {
		return new Customer(name, ssn, phone, userId, passwd);
	}
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}
	public Customer getCustomerBySsn(String ssn) {
		return customerDao.findCustomerBySsn(ssn);
	}
	public List<Customer> getAllcustomer() {
		return customerDao.findAllCustomers();
	}
}

//만든 프로젝트 요구명세서 작성