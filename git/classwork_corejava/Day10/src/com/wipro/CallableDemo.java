package com.wipro;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableDemo {

	public static void main(String[] args) {
		
		Connection c = null;
		CallableStatement cs = null;
		ResultSet rs = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing", "root", "rps@123");
			
			cs = c.prepareCall("Call insert_demo(?, ?, ?)");
			cs.setInt(1, 4);
			cs.setString(2, "Govind");
			cs.setString(3, "addrs5");
			
			rs = cs.executeQuery();
			while(rs.next()) //this gives error because there is no data in the result has 
				//the procedure does not return output
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			
//			cs = c.prepareCall("Call show_data()");
//			
//			rs = cs.executeQuery();
//			while(rs.next())
//				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				c.close();
				rs.close();
				cs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}

	}

}
