package com.wipro.day4;

public interface InterfaceDemo {
	
	public void one();
	
	public void two();
	
	default public void three() {
		System.out.println("This is using default");
	}
	
	public static void four() {
		System.out.println("This is Static method");
	}

}
