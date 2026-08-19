package com.wipro.oops;

public class Jaguar extends Car { // Single level Inherentence
	
	// parent to child downcasting for objects
	// child to parent upcasting 
	
	public void overriding() {
		System.out.println("Child Class");
	}
	
	public static void main(String[] args) {
		
		Car car = new Car();
		car.overriding();
		
		Car c1 = new Jaguar(); // upcasting
		c1.overriding();
		
		Jaguar jaguar = new Jaguar();
		jaguar.overriding();
		
//		Jaguar j = (Jaguar) new Car(); // gives ClassCastException
//		Jaguar j = (Jaguar) car; // ClassCastException
		Jaguar j = (Jaguar) c1; // downcasting
		j.overriding();
		
	}

}
