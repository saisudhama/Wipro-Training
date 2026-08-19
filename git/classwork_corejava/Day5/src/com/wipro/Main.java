package com.wipro;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(-2, 0, 4, 6, 8);

        // Using reduce to find the sum of all elements
        int sum = numbers.stream().reduce(0, (element1, element2) -> element1 + element2);
		Optional<Integer> sumOpt = numbers.stream().reduce((e1, e2) -> e1+e2);

        // Displaying the sum of all elements
        System.out.println("The sum of all elements is " + sum); 
		sumOpt.ifPresent(System.out::println);

	}

}
