package com.wipro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareDemo {

	public static void main(String[] args) {

		Student s1 = new Student(1, "s2", 15);
		Student s2 = new Student(2, "s3", 14);
		Student s3 = new Student(3, "s1", 17);

		List<Student> lS = new ArrayList<Student>(Arrays.asList(s1, s2, s3));
		
		System.out.println(lS.get(1));

		System.out.println("Students before sorting: ");
		System.out.println(lS);

		Collections.sort(lS);
		System.out.println("Students after sorting");
		System.out.println(lS);

//		Comparator<Student> c = new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//		};
		
		Comparator<Student> cName = (Student o1, Student o2) ->  o1.getName().compareTo(o2.getName());
		
		lS.sort(cName);
		System.out.println("Student name sorting using Comparator");
		System.out.println(lS);
		
		Collections.sort(lS, (Student obj1, Student obj2) -> s1.getName().compareTo(s2.getName()));
		System.out.println(lS);
		lS.sort(Comparator.comparing(Student::getName));
		System.out.println(lS);
		
	}

}
