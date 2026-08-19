package com.wipro.oops;

public class Dog implements Animal {
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		
		d.type();
		d.sound();
		
	}

	public void type() {
		System.out.println("Carnivorous");
	}

	public void sound() {
		System.out.println("Dog");
	}
	
	public void walk() {
		System.out.println("Walking");
	}
	
}
