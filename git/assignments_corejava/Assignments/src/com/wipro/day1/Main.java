package com.wipro.day1;

import java.util.Scanner;

public class Main {

	public float farenheitToCelsius(float f) {
		return (f - 32) * (5/9);
	}
	
	public float incomeTax(float salary) {
		return salary * 0.1f;
	}
	
	public int areaRect(int l, int b) {
		return l * b;
	}
	
	public double areaCir(int r) {
		return Math.PI * r * r;
	}
	
	public static void main(String[] args) {
		
		Main m = new Main();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Convert Faranheit to Celcius: ");
		System.out.println(m.farenheitToCelsius(sc.nextFloat()));
		
		System.out.print("Calculate Income Tax for the given Salary: ");
		System.out.println(m.incomeTax(sc.nextFloat()));
		
		System.out.print("Calculate Area of Rectangle: ");
		System.out.println(m.areaRect(sc.nextInt(), sc.nextInt()));
		
		System.out.print("Calculate Area of Circle: ");
		System.out.println(m.areaCir(sc.nextInt()));
		
		sc.close();
		
	}

}
