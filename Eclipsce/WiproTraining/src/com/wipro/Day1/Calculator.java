package com.wipro.Day1;

public class Calculator {
	
	public double add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int sub(int num1, int num2) {
		return Math.abs(num2 - num1);	
	}
	
	public double mul(int num1, int num2) {
		return num1*num2;
	}
	
	public float div(int num1, int num2) {
		if(num1 == 0 || num2 == 0) {
			return 0;
		}
		
		else if(num1 >= num2) {
			return num1/num2;
		}
		
		else {
			return num2/num1;
		}
	}

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		System.out.println("Add: " + cal.add(2,  3));
		System.out.println("Sub: " + cal.sub(10,  17));
		System.out.println("Multiplication: " + cal.mul(10,  23));
		System.out.println("Division: " + cal.div(36, 0));

	}

}
