package com.wipro;

public class Employee implements Comparable<Employee> {

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	private int id;
	private String name;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

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

	@Override
	public int compareTo(Employee o) {
		return Integer.compare(this.id, o.id);
	}

}
