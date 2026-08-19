package com.wipro.day4;

public class Main implements InterfaceDemo {

	public static void main(String[] args) {
		
		Main m = new Main();
		
		m.one();
		m.two();
		m.three();
		InterfaceDemo.four();
		
		//static can be implemented in variable, method, class and block
		//where the memory allocation with static sends a copy of that to each and every member
		//no need to create a object when static is used
		//cannot access non static members of class
		//cannot be overridden but can be overloaded
		
		//similarily with final where we creates a constant when assigned to variable
		//can be implemented with variable, class, methods
		//final method cannot be overriden
		//final class cannot be inherited
		
		//super is used to call a super constructor
		//super is used to super class methods and variables
		//super cannot be used in static context
		//super should be first statement in constructor

	}

	@Override
	public void one() {
		System.out.println("This is implemented abstract method one");
	}

	@Override
	public void two() {
		System.out.println("This is implemented abstract method two");
	}

}
