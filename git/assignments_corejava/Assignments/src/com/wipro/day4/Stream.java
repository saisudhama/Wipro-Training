package com.wipro.day4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Stream {

	public static void main(String[] args) {
		
		List<List<String>> listofLists = Arrays.asList(
				Arrays.asList("NoStorage", "Lazy"),
				Arrays.asList("Pipeline", "NoStorage"),
				Arrays.asList("Infinite", "Parallelized")
				);
		
		System.out.println("Original Two dimension List of List");
		listofLists.forEach(list -> list.forEach(System.out::println));
		
		Set<String> intermediateResults = new HashSet<>();
		//Set stores only distinct elements inside
		
		List<String> result = listofLists.stream().flatMap(List::stream).map(String::toUpperCase).peek(s -> intermediateResults.add(s)).distinct().sorted().toList();
		
		System.out.println();
		System.out.println("Result output");
		result.forEach(s -> System.out.println(s));
		
		System.out.println();
		System.out.println("Intermediate Results output");
		intermediateResults.forEach(System.out::println);
		
	}

}
