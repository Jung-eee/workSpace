package com.varxyz.banking.domain;

public class CustomerServiceTest {
	public static void main(String[] args) {
		CustomerService custom = new CustomerServiceImpl();
		Customer park = new Customer("Park", "123456-123456", "010-1234-1234", "dhdp564", "tkdgns");
		custom.addCustomer(park);
		System.out.println(custom.getCustomerBySsn("123456-123456"));
	}
}
