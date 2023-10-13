package com.tap.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeBO {
	 private static final String url = "jdbc:mysql://localhost:3306/projemployee";
     private static final String username = "root";
     private static final String password = "root";
     private Connection connection;
     private PreparedStatement pstmt;
     private static final String Query = "INSERT INTO emp(name,id,email,salary,dept)values(?,?,?,?,?)";
	
	
	
	public EmployeeBO(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url,username,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	boolean save(Employee e)
	{
		try {
			pstmt = connection.prepareStatement(Query);
			pstmt.setString(1,e.getName());
			pstmt.setInt(2, e.getId());
			pstmt.setString(3, e.getEmail());
			pstmt.setInt(4, e.getSalary());
			pstmt.setString(5, e.getDept());
			
			
			int i = pstmt.executeUpdate();
			
			return i>0;
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return false;
	}

}
