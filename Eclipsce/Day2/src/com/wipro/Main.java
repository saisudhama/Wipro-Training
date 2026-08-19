package com.wipro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			GradeAllocation s1 = new GradeAllocation();

			do {
				int input = sc.nextInt();
				
				switch(input) {
				case 0:
					System.out.println(s1.gradeCheck(input));
					break;
				case 1:
					System.out.println(Check.checkAge(sc.nextInt()));
					break;
				case 2:
					System.out.println(Check.evenOrOdd(sc.nextInt()));
					break;
				case 3:
					System.out.println(Check.isVowel(sc.next().charAt(0)));
					break;
				default:
					System.out.println("Enter correct output");
				}
			} while (sc.nextInt() == 1);
			
			s1 = null;
		}
		System.gc();
	}

}
