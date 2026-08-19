package com.wipro.day3.oops.bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Which Bank do you prefer");
		System.out.println("1. SBI");
		System.out.println("2. HDFC");
		
		int choice = sc.nextInt();
		
		if( choice == 1 ) {
			Sbi obj = new Sbi();
			obj.ROI();
			obj.EMI();
		}
		else {
			Hdfc obj = new Hdfc();
			obj.EMI();
			obj.ROI();
		}
		
		sc.close();

	}

}
