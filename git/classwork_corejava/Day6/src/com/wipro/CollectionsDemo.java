package com.wipro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		List<Integer> aL = new ArrayList<Integer>();
		aL.add(2);
		aL.add(3);
		aL.add(1);
		aL.add(1, 4); //adding element at index 1
		aL.remove(1);
		aL.addLast(5);
		aL.removeLast();
		
		Iterator<Integer> itr = aL.iterator();
		System.out.println("Array List");
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println();
		
		List<Integer> lL = new LinkedList<Integer>(aL);
		System.out.println("Linked List");
		lL.forEach(System.out::println);
		System.out.println();
		
		List<Employee> eL = new LinkedList<Employee>();
		Employee e1 = new Employee(1, "a", "Developer");
		Employee e2 = new Employee(2, "b", "Tester");
		Employee e3 = new Employee(3, "c", "TeamLead");
		
		eL.add(e1);
		eL.add(e2);
		eL.add(e3);
		
		eL.forEach(System.out::println);
		System.out.println();
		
		Set<Employee> eS = new HashSet<Employee>(eL);
		eS.add(e3);
		eS.add(e1);
		eS.forEach(System.out::println);
		System.out.println();
		
		TreeSet<Integer> tS = new TreeSet<Integer>(aL); //TreeSet sorts the data when added
		tS.forEach(System.out::println);
		System.out.println(tS.descendingSet());
		System.out.println();
		
		TreeSet<Employee> eTS = new TreeSet<Employee>(eL); //need to add comparable method to compare
		// Employee objects inside TreeSet to sort them
		eTS.forEach(System.out::println);
		System.out.println(eTS.descendingSet()); //descending only works with TreeSet on LHS and RHS
		System.out.println(eTS.toString());
		
	}

}
