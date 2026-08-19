package com.wipro.oops;

public class Snake extends Amphibian implements Animal, Fish {

	public static void main(String[] args) {
		
		Snake s = new Snake();
		
		s.swim();
		s.walk();
		s.type();
		s.sound();
		
	}
	
	public void swim() {
		System.out.println("It can Swim");
		super.walk();
	}

	public void type() {
		System.out.println("Carnivorous");
	}

	public void sound() {
		System.out.println("Snake");
	}

	public void walk() {
		System.out.println("It can crawl");
	}

}
