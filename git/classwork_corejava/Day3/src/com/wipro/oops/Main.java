package com.wipro.oops;

public class Main {

	public static void main(String[] args) {
		
		Car benz = new Car();
		
		benz.set_color("Blue");
		benz.set_engineCapacity(3000);
		benz.set_model("Benz");
//		benz.set_seats(4);
		
		System.out.println(benz);
		
		Car bmw = new Car("Blue", 3000, "BMW");
		
		System.out.println(bmw);
		
		
		Student s1 = new Student(1, "s1", "xyz", 10);
		Student s2 = new Student(2, "s2", 9);
		Student s3 = new Student().set_id(3).set_name("s3").set_standard(10);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
	}

}
