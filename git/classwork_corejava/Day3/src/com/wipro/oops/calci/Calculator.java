package com.wipro.oops.calci;

import java.util.Scanner;

public class Calculator implements Add, Sub, Mult, Div {
	
	static int a = 5;

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter b: ");
		
//		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Enter choice");
		int c = sc.nextInt();
		
		switch(c) {
		
		case 0:
			break;
			
		case 1:
			System.out.println(cal.add(a, b));
			break;
			
		case 2:
			System.out.println(cal.diff(a, b));
			break;
			
		case 3:
			System.out.println(cal.mult(a, b));
			break;
			
		case 4:
			System.out.println(cal.div(a, b));
			break;
			
		default:
			System.out.println("Enter correct choice");
			
		}
		
		sc.close();
	}

	public int div(int a, int b) {
		if(a == 0 || b == 0)
			return 0;
		return (a>=b) ? a/b : b/a;
	}

	public int mult(int a, int b) {
		return a*b;
	}

	public int diff(int a, int b) {
		return Math.abs(a-b);
	}

	public int add(int a, int b) {
		return a+b;
	}
	
	

}
