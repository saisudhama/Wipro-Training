package com.wipro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleRead {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader bw = new BufferedReader(isr);
		
		System.out.print("Enter your name: ");
		
		System.out.println(bw.readLine());
		
	}

}
