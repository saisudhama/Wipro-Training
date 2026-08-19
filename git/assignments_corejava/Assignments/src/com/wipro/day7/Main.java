package com.wipro.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(2, "s3", "Developer");
		Employee e2 = new Employee(1, "s1", "Tester");
		Employee e3 = new Employee(3, "s2", "HR");
		
		List<Employee> eL = new ArrayList<Employee>(Arrays.asList(e1, e2, e3));
		
		Collections.sort(eL);
		System.out.println(eL);
		
		eL.sort((Employee o1, Employee o2) -> o1.getName().compareTo(o2.getName()));
		System.out.println(eL);

	}

}
