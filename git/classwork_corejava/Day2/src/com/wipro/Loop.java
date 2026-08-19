package com.wipro;

import java.util.Scanner;

public class Loop {
	
	public static double fact(double d) {
		if (d == 1 || d == 0) 
			return 1;
		return fact(d-1)*d;
	}
	
	public static int fib(int n) {

		if(n == 1)
			return 0;
		else if(n == 2)
			return 1;
		
		return fib(n-1) + fib(n-2);
	}
	
	public static void swap(int n1, int n2) {
		int t = n1;
		n1 = n2;
		n2 = t;
		System.out.println("Swapped");
	}
	
	public static void swapWithoutVar(int n1, int n2) {
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		System.out.println("Swapped without third variable");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

//		for (int i = 10; i >= 0; i--)
//			System.out.println(i);
//
//		System.out.println(3 >>> 2);
		
		
//		int num = 10;
//		double d = num; // implicit type casting
//		
//		double d1 = 15.29;
//		int n1 = (int) d1; // explicit type casting
//		
//		Integer i = new Integer(5);
//		Double d2 = new Double(10.24);
//		
//		int n2 = i.intValue();
		
		
//		for(int i = 1; i <= 10; i++) {
//			for(int j = i; j >= 1; j--) {
//				System.out.print("*" + " ");
//			}
//			System.out.println();
//		}
		
//		for(int i = 5; i >= 1; i--) {
//			for(int j = i; j >= 1; j--) {
//				System.out.print("*" + " ");
//			}
//			System.out.println();
//		}
		
//		System.out.println(fact(sc.nextDouble()));
		
//		System.out.println(fib(sc.nextInt()));
		
		int[] arr = {5, 4, 3, 2, 1};
		
		for(int i = 0; i < arr.length - 2; i++) {
			for(int j = i+1; j <= arr.length - 1; j++) {
				if( arr[i] > arr[j] ) {
					arr[i]+= arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i]=  arr[i] - arr[j];
				}
			}
		}
		
		for(int e: arr)
			System.out.println(e);
		
		sc.close();
	}

}
