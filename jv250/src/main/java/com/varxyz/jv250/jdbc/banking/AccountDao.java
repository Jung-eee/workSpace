package com.varxyz.jv250.jdbc.banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountDao {
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
	private static final String JDBC_ID = "jv250";
	private static final String JDBC_PASSWORD = "jv250";
	   public AccountDao() {
	      try {
	         Class.forName(JDBC_DRIVER);
	         System.out.println("LOADED DRIVER ---> " + JDBC_DRIVER);         
	      } catch (ClassNotFoundException e) {
	         e.printStackTrace();
	      }
	   }
	   
	   
	   public void addAccount(Account account) {
	      String sql = "INSERT INTO Account(accountNum, balance, interestRate, "
	            + " overdraft, accountType, customerId) "
	            + " VALUES (?, ?, ?, ?, ?, ?)";
	      
	      try {
	         Connection con = null;
	         PreparedStatement pstmt = null;
	         try {
	            con = DriverManager.getConnection(JDBC_URL, JDBC_ID, JDBC_PASSWORD);
	            pstmt = con.prepareStatement(sql);
	            pstmt.setString(1, account.getAccountNum());
	            pstmt.setDouble(2, account.getBalance());
	            if(account instanceof SavingAccount) {
	               SavingAccount sa = (SavingAccount) account;
	               pstmt.setDouble(3, sa.getInterestRate());
	               pstmt.setDouble(4, 0.0);
	               pstmt.setString(5, String.valueOf(sa.getAccountType()));
	               System.out.println("INSERTED...");
	            } else if(account instanceof CheckingAccount) {
	               CheckingAccount ca = (CheckingAccount) account;
	               pstmt.setDouble(3, 0.0);
	               pstmt.setDouble(4, ca.getOverdraftAmount());
	               pstmt.setString(5, String.valueOf(ca.getAccountType()));
	               pstmt.executeUpdate();
	               System.out.println("INSERTED...");
	            }      
	            pstmt.setLong(6, account.getCustomer().getCid());
	            pstmt.executeUpdate();
	         } finally {
	            con.close();
	            pstmt.close();
	         }
	      }catch (SQLException e) {
	         e.printStackTrace();
	      	}
		  }
		  
		  public List<Account> findAccountsBySsn(String ssn){
	      String sql = "SELECT a.aid, a.accountNum, a.balance, a.interstRate, "
	            + "a.overdraft, a.accountType, c.name, c.ssn, c.phone, a.regDate "
	            + " FROM Account a INNER JOIN CUSTOMER c ON a.customerId = c.cid "
	            + " WHERE c.ssn = ?";
	      List<Account> list = new ArrayList<>();
	      
	      try {
	         Connection con = null;
	         PreparedStatement pstmt = null;
	         ResultSet rs = null;
	         try {
	            con = DriverManager.getConnection(JDBC_URL, JDBC_ID, JDBC_PASSWORD);
	            pstmt = con.prepareStatement(sql);
	            pstmt.setString(1, ssn);
	            rs = pstmt.executeQuery();
	            Account account = null;
	            while(rs.next()) {
	               if(rs.getString("accountType").charAt(0) == 's') {
	                  account = new SavingAccount(sql, 0);
	                  ((SavingAccount)account).setInterestRate(
	                        rs.getDouble("interstRate"));
	                  account.setAccountType(rs.getString("accountType").charAt(0));
	               } else {
	                  account = new CheckingAccount();
	                  ((CheckingAccount)account).setOverdraftAmount(
	                        rs.getDouble("overdraft"));
	                  account.setAccountType(rs.getString("accountType").charAt(0));
	               }
	               account.setAid(rs.getLong("aid"));
	               account.setAccountNum(rs.getString("accountNum"));
	               account.setBalance(rs.getDouble("balance"));
	               account.setCustomer(new Customer(rs.getString("name"), 
	                     rs.getString("ssn"), rs.getString("phone")));
	               account.setRegDate(rs.getTimestamp("regDate"));
	               list.add(account);
	            }
	         } finally {
	        	rs.close();
	            con.close();
	            pstmt.close();
	         }
	      }catch (SQLException e) {
	         e.printStackTrace();
	      }
	      return list;
	   }
	   
	   public List<Account> findAllAccount(){
	      String sql = "SELECT * FROM Account";
	      List<Account> AccountList = new ArrayList();
	      
	      try {
	         Connection con = null;
	         PreparedStatement pstmt = null;
	         ResultSet rs = null;
	         try {
	            con = DriverManager.getConnection(JDBC_URL, JDBC_ID, JDBC_PASSWORD);
	            pstmt = con.prepareStatement(sql);
	            rs = pstmt.executeQuery();
	            Account a = null;
	            while(rs.next()) {
	               if(rs.getString("accountType").charAt(0) == 'S') {
	                  a = new SavingAccount();
	                  a.setAid(rs.getLong("aid"));
	                  a.setAccountNum(rs.getString("accountNum"));
	                  a.setBalance(rs.getDouble("balance"));
	                  ((SavingAccount)a).setInterestRate(rs.getDouble("interestRate"));
	                  AccountList.add(a);
	               } else {
                  a = new CheckingAccount();
	                  a.setAid(rs.getLong("aid"));
	                  a.setAccountNum(rs.getString("accountNum"));
	                  a.setBalance(rs.getDouble("balance"));
	                  ((CheckingAccount)a).setOverdraftAmount(rs.getDouble("balance"));
	                  AccountList.add(a);
	               }
	            }
	            
	         } finally {
	            con.close();
	            pstmt.close();
	            rs.close();
	         }
	      }catch (SQLException e) {
	         e.printStackTrace();
	      }
	      return AccountList;
	   }
	}