package com.wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetDMLDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection c = null;
		ResultSet rs = null;
		Statement s = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver"); //Load the driver
		c = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","rps@123");
		
		s = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		rs = s.executeQuery("SELECT * FROM Student");
		
//		rs.moveToInsertRow();
//		rs.updateInt(1, 10);
//		rs.updateString(2, "Ram");
//		rs.updateString(3, "Goa");
//		rs.insertRow();
		
		rs.absolute(6);
		rs.updateString(3, "Ayodhya");
		rs.updateRow();
		
		rs = s.executeQuery("SELECT * FROM Student");
		while(rs.next())
			System.out.println("Id: " + rs.getInt(1) + ", " + "Name: " + rs.getString(2) + ", " +
					"Address: " + rs.getString(3));
		
//		
//		rs.absolute(1);
//		rs.deleteRow();
//		while(rs.next())
//			System.out.println("Id: " + rs.getInt(1) + ", " + "Name: " + rs.getString(2) + ", " +
//					"Address: " + rs.getString(3));
//		
		
		
//		s = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//		rs = s.executeQuery("Select * from Student");
//		
//		rs.first();
//		System.out.println("Id: " + rs.getInt(1) + ", " + "Name: " + rs.getString(2) + ", " +
//				"Address: " + rs.getString(3));
//		
//		rs.last();
//		System.out.println("Id: " + rs.getInt(1) + ", " + "Name: " + rs.getString(2) + ", " +
//				"Address: " + rs.getString(3));
//		
//		rs.absolute(2);
//		System.out.println("Id: " + rs.getInt(1) + ", " + "Name: " + rs.getString(2) + ", " +
//				"Address: " + rs.getString(3));
		
		

	}

}
