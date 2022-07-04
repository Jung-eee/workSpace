package com.varxyz.jv250.jdbc.banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AccountJdbcTest {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
		String id = "jv250";
		String password = "jv250";
		
		try {
			Class.forName(driver);
			System.out.println("LOADED DRIVER --->" + driver) ;
			
			Connection con = DriverManager.getConnection(url, id, password);
			System.out.println("CONNECTED TO --->" + url);
			
			select(con);
			insert(con);
			select(con);
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void select(Connection con) {
	  String sql = "SELECT * FROM Account";
	  try {
		  PreparedStatement pstmt = con.prepareStatement(sql);
		  ResultSet rs = pstmt.executeQuery();
		  while (rs.next()) { //데이터 있으면 true
			  String accountNum = rs.getString("accountNum");
				double balnace = rs.getDouble("balance");
				double interestRate = rs.getDouble("interstRate");
				double overdraft = rs.getDouble("overdraft");
				char accountType = rs.getString("accountType").charAt(0);
				long aid = rs.getLong("aid");
				System.out.println(aid);
				System.out.println(accountNum);
				System.out.println(balnace);
				System.out.println(interestRate);
				System.out.println(overdraft);
				System.out.println(accountType);
				System.out.println("--------------------");
			}
		  pstmt.close();
		  System.out.println("SELECT COMPLETED...\n");
		} catch (Exception e) {
			e.printStackTrace();
	  }
	}
	public static void insert(Connection con) {
		String sql = "INSERT INTO Account(accountNum,balance,interstRate,customerId)" + 
						"VALUES(?,?,?,?)";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1,"789-892");
			pstmt.setDouble(2,125.00);
			pstmt.setDouble(3,1.25);
			pstmt.setLong(4,1004);
			
			pstmt.executeUpdate();
			pstmt.close();
			System.out.println("NEW ACCOUNT INSERTED...\n");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
