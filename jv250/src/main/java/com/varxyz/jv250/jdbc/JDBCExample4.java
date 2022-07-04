package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample4 {
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
			
			String sql = "UPDATE Customer SET id=? ,password=? WHERE cid=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, "jh012525"); 
			stmt.setString(2, "987456");
			stmt.setLong(3, 1004);
			stmt.executeUpdate();
			System.out.println("UPDATED ...>");
			stmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
