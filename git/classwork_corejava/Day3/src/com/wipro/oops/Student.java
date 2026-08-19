package com.wipro.oops;

public class Student {

	private int _id;
	private String _name;
	private String _school = "ABC";
	private int _standard;

	public int get_id() {
		return _id;
	}

	public Student set_id(int id) {
		this._id = id;
		return this;
	}

	public String get_name() {
		return _name;
	}

	public Student set_name(String name) {
		this._name = name;
		return this;
	}

	public String get_school() {
		return _school;
	}

	public Student set_school(String school) {
		this._school = school;
		return this;
	}

	public int get_standard() {
		return _standard;
	}

	public Student set_standard(int standard) {
		this._standard = standard;
		return this;
	}

	@Override
	public String toString() {
		return "Student [id=" + _id + ", name=" + _name + ", school=" + _school + ", standard=" + _standard + "]";
	}

	public Student(int id, String name, int standard) {
		this._id = id;
		this._name = name;
		this._standard = standard;
	}

	public Student(int id, String name, String school, int standard) {
		this._id = id;
		this._name = name;
		this._school = school;
		this._standard = standard;
	}

	public Student() {
	}

}
