package com.wipro;

@FunctionalInterface // annotation used to indicate it is functional interface
public interface HardDisk {
	
	//In functional Interface we can have now one abstract methods and default methods 
	//Can now also have static method inside a interface
	//Can only have one abstract method else we can't use lambda expression
	//It is not fully abstract from Java 8
	
//	public void storage(); // abstract method without parameters
	
	public void storage(int num); //abstract method with parameters
	
	default void show() { // default method 
		System.out.println("This is default method");
	}
	
	static void info() {
		System.out.println("This is static method");
	}

}
