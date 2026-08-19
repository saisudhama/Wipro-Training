package com.wipro.day5;

import java.util.Scanner;

public class LambdaExp {
	
	interface NumberChecker { public String evenOdd(int num); }
	
	interface ArmstrongChecker { public boolean armstrongNum(int num); }
	
	public static boolean checkArmstrong(int num) {
		
		int t = num, c = 0;
		while (t != 0) { //calculate number of digits
			c++;
			t/=10;
		}
		
		int s = 0, temp = num;
		while (temp != 0) {
			s+= Math.pow(temp%10, c);
			temp/=10;
		}
		
		return num == s;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		NumberChecker r1 = (num) -> num%2 == 0 ? "Even" : "Odd";
		System.out.println(r1.evenOdd(sc.nextInt()));
		
		ArmstrongChecker r2 = (num) -> checkArmstrong(num);
		System.out.println("Is Armstrong number or not " + r2.armstrongNum(sc.nextInt()));
		
		sc.close();
	}

}
