package com.wipro.oops;

public class OverloadAdd { // Compile-time polymorphism/ Static polymorphism/ Early binding
	
	//late binding / run time polymorphism for Overriding

	public static int add(int a, int b) {
		return a +b;
	}
	
	public static int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public static double add(double a, double b, double c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		
		System.out.println(add(1,2));
		System.out.println(add(3, 4, 5));
		System.out.println(add(10.0, 10.0, 10.0));

	}

}
