package com.wipro;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		String[] arr = new String[5];
		
		arr[0] = "First";
		
		Optional<String> check = Optional.ofNullable(arr[1]);
		
		if(check.isPresent())
			System.out.println(arr[1]);
		System.out.println("It is null");

	}

}