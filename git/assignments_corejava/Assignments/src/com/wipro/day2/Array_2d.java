package com.wipro.day2;

import java.util.Scanner;

public class Array_2d extends ArrayMethods {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sum is ");
		printArr2d(sum(def2dArray(sc), def2dArray(sc)));
		
		sc.close();
		
	}
}
