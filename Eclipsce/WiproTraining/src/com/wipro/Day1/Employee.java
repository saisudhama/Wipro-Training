package com.wipro.Day1;

public class Employee {

	private int _id;
	private String _name;
	private double _salary;
	
	public Employee(int id, String  name, double salary) {
		this._id = id;
		this._name = name;
		this._salary = salary;
	}

	public Employee() {
	}

	@Override
	public String toString() {
		return "Employee's id is: " + _id + ", name is: " + _name + ", salary is: " + _salary;
	}

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.set_id(1);
		emp.set_name("Ram");
		emp.set_salary(50000);

		System.out.println(emp);

	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public double get_salary() {
		return _salary;
	}

	public void set_salary(double _salary) {
		this._salary = _salary;
	}

}
