package com.wipro.day7;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private String role;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + "]";
	}

	public Employee(int id, String name, String role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}

	@Override
	public int compareTo(Employee o) {
		return Integer.compare(this.id, o.id);
	}

}
