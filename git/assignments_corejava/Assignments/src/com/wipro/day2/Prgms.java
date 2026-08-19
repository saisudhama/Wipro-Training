package com.wipro.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Prgms {
	
	public static boolean isPalindrome(int num) {
		
		return (num + "").equals(new StringBuilder(num + "").reverse().toString());
//		return (num + "").compareTo(new StringBuilder(num + "").reverse().toString()) == 0;
		
	}
	
	public static int sumArr(int[] arr) {
		return Arrays.stream(arr).sum();
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input to check is palindrome or not: ");
		
		System.out.println(isPalindrome(sc.nextInt()));
		
		System.out.println(sumArr(ArrayMethods.defArr(sc)));
		
		sc.close();

	}

}
