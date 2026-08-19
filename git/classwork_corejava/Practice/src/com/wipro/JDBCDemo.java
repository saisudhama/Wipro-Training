package com.wipro;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection c = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Statement s = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		c = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing", "root", "rps@123");
		
		s = c.createStatement();
		rs = s.executeQuery("Select * From Employee");
		
		ps = c.prepareStatement("Insert into Employee values (?, ?, ?)");
		ps.setInt(1, 1);
		ps.setString(2, "E1");
		ps.setString(3, "addrs1");
		ps.executeUpdate();
		
		
		
		CallableStatement cs = null;
		
		cs = c.prepareCall("Call insert_demo(?, ?, ?)");
		cs.setInt(1, 2);
		cs.setString(2, "E2");
		cs.setString(3, "addrs2");
		rs = cs.executeQuery();

	}

}
