package com.varxyz.banking.domain;
import java.util.*;

public class BankTest {

	public static void main(String[] args) {
		Account a = new SavingAccount();
		a.balance = 2000.0;
		System.out.println(a.balance);
		SavingAccount a1 = (SavingAccount)a;
		a1.withdraw(3000.0);
		
		List<String>list = new ArrayList<String>();
		
	}

}
