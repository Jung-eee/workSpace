package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample2 {
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
			
			String sql = "SELECT * FROM Customer WHERE name = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, "후니");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) { //데이터 있으면 true
				String cusid = rs.getString("id");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				long cid = rs.getLong("cid");
				System.out.println(cid);
				System.out.println(name);
				System.out.println(cusid);
				System.out.println(phone);
				System.out.println("--------------------");
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
	}
}
