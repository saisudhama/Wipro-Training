package com.wipro;

import java.util.Scanner;

public class PrimeException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PrimeException(String str) {
		super(str);
	}
	
	public static boolean isPrime(int num) {
		
		if(num == 0 || num == 1)
			return false;
		
		for(int i = 2; i <= Math.sqrt(num); i++)
			if(num%i == 0)
				return false;
		return true;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number to check Prime or not: ");
		int num = sc.nextInt();
		
		try {
			if(isPrime(num)) {
				sc.close();
				throw new PrimeException("The number is Prime");
			}
			else
				System.out.println("Number is not Prime");
		} catch(PrimeException p) {
			p.printStackTrace();
		}
		
		sc.close();

	}

}
