package com.wipro.oops;

public class Amphibian implements Animal, Fish {
	
	public static void main(String[] args) {
		
		Amphibian a = new Amphibian();
		
		a.walk();
		a.swim();
		a.type();
		a.sound();
		
	}

	public void swim() {
		System.out.println("It can Swim");
	}

	public void type() {
		System.out.println("Carnivorous");
	}

	public void sound() {
		System.out.println("Snake or Tortoise");
	}

	public void walk() {
		System.out.println("It can walk");
	}

}
