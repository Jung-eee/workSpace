package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCExample {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
		String id = "jv250";
		String password = "jv250";
		ResultSet rs = null;
		Statement stmt    = null;
		Connection con = null;
		try {
			Class.forName(driver);
			System.out.println("LOADED DRIVER --->" + driver) ;
			
			con = DriverManager.getConnection(url, id, password);
			System.out.println("CONNECTED TO --->" + url);
			
			String sql = "SELECT * FROM Account WHERE aid=3001";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) { //데이터 있으면 true
				String accountNum = rs.getString("accountNum");
				double balnace = rs.getDouble("balance");
				double interestRate = rs.getDouble("interstRate");
				double overdraft = rs.getDouble("overdraft");
				String accountType = rs.getString("accountType");
				String customerId = rs.getString("customerId");
				long aid = rs.getLong("aid");
				System.out.println(aid);
				System.out.println(accountNum);
				System.out.println(balnace);
				System.out.println(interestRate);
				System.out.println(overdraft);
				System.out.println(accountType);
				System.out.println(customerId);
				System.out.println("--------------------");
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try {rs.close();} catch (SQLException e) {}	
			if(stmt != null) try {stmt.close();} catch (SQLException e) {}	
			if(con != null) try {con.close();} catch (SQLException e) {}	
		
			
			
		}
	}
}
