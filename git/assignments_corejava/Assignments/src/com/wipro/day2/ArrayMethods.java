package com.wipro.day2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethods {

	public static void printArr(int[] arr) {

		for (int e : arr)
			System.out.print(e + " ");

	}

	public static void printArr2d(int[][] arr) {

		for (int[] row : arr) {
			for (int e : row)
				System.out.print(e + " ");
			System.out.println();
		}

	}

	public static int[] defArr(Scanner sc) {
//		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of the array: ");
		int[] arr = new int[sc.nextInt()];

		System.out.println("Enter array values:");
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();

		for (int e : arr)
			System.out.print(e + " ");

//		sc.close();

		return arr;
	}

	public static int[][] def2dArray(Scanner sc) {
//		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2d array dimensions: ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr2d = new int[n][m];

		System.out.println("Enter array elemets (row by row)");

		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				arr2d[i][j] = sc.nextInt();

		for (int[] row : arr2d) {
			for (int e : row)
				System.out.print(e + " ");
			System.out.println();
		}

//		sc.close();

		return arr2d;
	}

	public static int[][] sum(int[][] arr1, int[][] arr2) {

		if (arr1.length != arr2.length || arr1[0].length != arr2[0].length)
			return null;

		int rows = arr1.length;
		int cols = arr1[0].length;

		int[][] sum = new int[rows][cols];

		for (int i = 0; i < rows; i++)
			for (int j = 0; j < cols; j++)
				sum[i][j] = arr1[i][j] + arr2[i][j];

		return sum;
	}
	
	public static int[] max_min_array(int[] arr) {
		
//		Arrays.sort(arr);
//		
//		return new int[] { arr[arr.length-1], arr[0] };
		
		return new int[] { Arrays.stream(arr).max().getAsInt(), Arrays.stream(arr).min().getAsInt() };

	}
	
	

}
