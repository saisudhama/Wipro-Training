package com.wipro.Day10;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableMenuDriven {

	public static void delete(Connection c, CallableStatement cs, ResultSet rs, Scanner sc) throws SQLException {

		cs = c.prepareCall("Call delete_data(?)");

		System.out.println("Enter Id for deletion");
		cs.setInt(1, sc.nextInt());

		rs = cs.executeQuery();

		while (rs.next())
			System.out.println(
					"Id: " + rs.getInt(1) + ", " + "Name: " + rs.getString(2) + ", " + "Address: " + rs.getString(3));

		cs.close();
		rs.close();
	}

	public static void update_address(Connection c, CallableStatement cs, ResultSet rs, Scanner sc) throws SQLException {

		cs = c.prepareCall("Call update_address(?, ?)");

		System.out.println("Enter Id and address for updation");
		cs.setInt(1, sc.nextInt());
		cs.setString(2, sc.next());

		rs = cs.executeQuery();

		while (rs.next())
			System.out.println(
					"Id: " + rs.getInt(1) + ", " + "Name: " + rs.getString(2) + ", " + "Address: " + rs.getString(3));

		cs.close();
		rs.close();
	}

	public static void update_name(Connection c, CallableStatement cs, ResultSet rs, Scanner sc) throws SQLException {

		cs = c.prepareCall("Call update_name(?, ?)");

		System.out.println("Enter Id and name for updation");
		cs.setInt(1, sc.nextInt());
		cs.setString(2, sc.next());

		rs = cs.executeQuery();

		while (rs.next())
			System.out.println(
					"Id: " + rs.getInt(1) + ", " + "Name: " + rs.getString(2) + ", " + "Address: " + rs.getString(3));

		cs.close();
		rs.close();
	}

	public static void insert(Connection c, CallableStatement cs, ResultSet rs, Scanner sc) throws SQLException {

		cs = c.prepareCall("Call insert_demo(?, ?, ?)");

		System.out.println("Enter insert Data");
		cs.setInt(1, sc.nextInt());
		cs.setString(2, sc.next());
		cs.setString(3, sc.next());

		rs = cs.executeQuery();

		while (rs.next())
			System.out.println(
					"Id: " + rs.getInt(1) + ", " + "Name: " + rs.getString(2) + ", " + "Address: " + rs.getString(3));

		cs.close();
		rs.close();
	}

	public static void show(Connection c, CallableStatement cs, ResultSet rs) throws SQLException {

		cs = c.prepareCall("Call show_data()");
		rs = cs.executeQuery();

		while (rs.next())
			System.out.println(
					"Id: " + rs.getInt(1) + ", " + "Name: " + rs.getString(2) + ", " + "Address: " + rs.getString(3));

		cs.close();
		rs.close();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection c = null;
		CallableStatement cs = null;
		ResultSet rs = null;

		Class.forName("com.mysql.cj.jdbc.Driver");
		c = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing", "root", "rps@123");

		Scanner sc = new Scanner(System.in);
		
		int choice = 1;

		do {
			System.out.println("Enter the choice for below options");
			System.out.println("1. Exit");
			System.out.println("2. Insert");
			System.out.println("3. Update Name");
			System.out.println("4. Update Address");
			System.out.println("5. Show");
			System.out.println("6. Delete");

			choice = sc.nextInt();

			if (choice == 2)
				insert(c, cs, rs, sc);
			else if (choice == 3)
				update_name(c, cs, rs, sc);
			else if (choice == 4)
				update_address(c, cs, rs, sc);
			else if (choice == 5)
				show(c, cs, rs);
			else if(choice == 6)
				delete(c, cs, rs, sc);
		} while (choice != 1);
		
		c.close();
		sc.close();

	}

}
