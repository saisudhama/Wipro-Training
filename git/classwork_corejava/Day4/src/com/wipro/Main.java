package com.wipro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			// System.out.println("Enter three digit number: ");
			//
			// System.out.println(sc.nextInt()%10);

			// System.out.println("Enter the size of array: ");
			//
			// int[] arr = new int[sc.nextInt()];
			//
			// System.out.println("Enter array elements: ");
			//
			// int sum = 0;
			// for(int i = 0; i < arr.length; i++) {
			// arr[i] = sc.nextInt();
			// sum+= arr[i];
			// }
			//
			// System.out.println("Array sum is: " + sum);

			// Computer comp = new Computer(sc.nextInt(), sc.next());
			// System.out.println(comp);

			// Laptop lap = new Laptop(sc.nextInt(), sc.next());
			//
			// System.out.println(lap);
			// lap.carryAble();
			// lap.storage();

			// HardDisk hd = () -> System.out.println("This is from functional interface
			// abstract method using lambda");
			// above one is using no arguments

			HardDisk hd = (int num) -> System.out.println("The Value is " + num);

			hd.storage(sc.nextInt());
			hd.show();
			HardDisk.info();

		}
		
		catch(Exception e) {
			System.out.println("Exception" + e);
			System.out.println("Exception Message " + e.getMessage());
			e.printStackTrace();
			System.out.println("Enter required input");
		}
	}

}
