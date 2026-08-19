package com.wipro;

public class Check {

	public static String checkAge(int age) {
		return age >= 18 ? "Eligible" : "Not Eligible";
	}

	public static String evenOrOdd(int num) {
		return num % 2 != 0 ? "Odd" : "Even";
	}

	public static boolean isVowel(char ch) {
		char t = Character.toLowerCase(ch);
		return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u';
	}

}
