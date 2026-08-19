package com.wipro.Day9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
	
	static Connection connection = null; 
	static Statement statement = null;
	static PreparedStatement ps = null;
	static ResultSet rs = null;
	
	public static void create(Scanner scCreate, Connection connection, Statement statement, ResultSet rs, PreparedStatement ps) throws SQLException {
//		Scanner scCreate = new Scanner(System.in);
		
		//Insert / Create
		ps = connection.prepareStatement("INSERT INTO Employee(Id, Name, Address) VALUES (?, ?, ?)");
		
		System.out.println("Enter the values in order for Employee table to insert");
		
		System.out.println("Enter id: ");
		ps.setInt(1, scCreate.nextInt());
		
		System.out.println("Enter name: ");
		ps.setString(2, scCreate.next());
		
		System.out.println("Enter address: ");
		ps.setString(3, scCreate.next());
		
		ps.executeUpdate();
		
//		scCreate.close();
		ps.close();
		show(connection, statement, rs);
	}
	
	public static void show(Connection connection, Statement statement, ResultSet rs) throws SQLException {
		
		System.out.println("Employee Data");
		
		statement = connection.createStatement();
		rs = statement.executeQuery("SELECT * FROM Employee");
		
		while (rs.next()) {
			System.out.println("Id: " + rs.getInt(1) + ", " + "Name: " + rs.getString(2) + ", " +
		"Address: " + rs.getString(3));
		}
		
		statement.close();
		rs.close();
		
	}
	
	public static void update(Scanner scUpdate, Connection connection, Statement statement, ResultSet rs, PreparedStatement ps) throws SQLException {
//		Scanner scUpdate = new Scanner(System.in);
		
		System.out.println("What do you want to update 1. Name or 2. Address?");
		int choice = scUpdate.nextInt();
		
		if(choice == 2) {
			ps = connection.prepareStatement("UPDATE Employee SET address = ? WHERE id = ?");
			System.out.println("Enter the updated address");
		}
		else {
			ps = connection.prepareStatement("UPDATE Employee SET name = ? WHERE id = ?");
			System.out.println("Enter the updated name");
		}
		
		ps.setString(1, scUpdate.next());
		
		System.out.println("Enter the id of the person to modify");
		ps.setInt(2, scUpdate.nextInt());
		ps.executeUpdate();
		
//		scUpdate.close();
		ps.close();
		show(connection, statement, rs);
		
	}
	
	public static void delete(Scanner scDelete, Connection connection, Statement statement, ResultSet rs, PreparedStatement ps) throws SQLException {
//		Scanner scDelete = new Scanner(System.in);
		
		ps = connection.prepareStatement("DELETE FROM Employee WHERE id = ?");
		
		System.out.println("Enter the id of the employee for deletion: ");
		ps.setInt(1, scDelete.nextInt());
		
		ps.executeUpdate();
		
//		scDelete.close();
		ps.close();
		show(connection, statement, rs);
	}

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver"); //Load the driver
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","rps@123");
		//Create connection with the database
		
		int choice = 1;
		
		do {
			System.out.println("Enter the choice for below options");
			System.out.println("1. Exit");
			System.out.println("2. Insert");
			System.out.println("3. Update");
			System.out.println("4. Delete");
			System.out.println("5. Show");
			
			choice = sc.nextInt();
			
			if(choice == 2)
				create(sc, connection, statement, rs, ps);
			else if(choice == 3)
				update(sc, connection, statement, rs, ps);
			else if(choice == 4)
				delete(sc, connection, statement, rs, ps);
			else if(choice == 5)
				show(connection, statement, rs);
		} while (choice != 1);
		
		sc.close();
		connection.close();

	}

}
