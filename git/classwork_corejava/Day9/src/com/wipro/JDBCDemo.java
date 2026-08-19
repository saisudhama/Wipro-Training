package com.wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		
		Connection connection = null; 
		Statement statement = null;
		PreparedStatement ps = null, ps1 = null, ps2 = null;
		ResultSet rs = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver"); //Load the driver
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","rps@123");
			//Create connection with the database
			
			//Insert / Create
			ps = connection.prepareStatement("INSERT INTO Employee(Id, Name, Address) VALUES (?, ?, ?)");
			ps.setInt(1, 2);
			ps.setString(2, "Shiva");
			ps.setString(3, "addrs2");
			ps.executeUpdate();
			
			//Update / Modify / Change Data
			ps1 = connection.prepareStatement("UPDATE Employee SET address = ? WHERE id = ?");
			ps1.setString(1, "Banglore");
			ps1.setInt(2, 2);
			ps1.executeUpdate();
			
			//Delete Data
			ps2 = connection.prepareStatement("DELETE FROM Employee WHERE id = ?");
			ps2.setInt(1, 2);
			ps2.executeUpdate();
			
			//Read /View / Select data
			statement = connection.createStatement();
			rs = statement.executeQuery("SELECT * FROM Employee");
			
			while (rs.next()) {
				System.out.println("Id: " + rs.getInt(1) + ", " + "Name: " + rs.getString(2) + ", " +
			"Address: " + rs.getString(3));
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				ps1.close();
				ps2.close();
				statement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
