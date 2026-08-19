package com.wipro;

public class IntDemo {

	public static void main(String[] args) {
		
		Integer i = 15;
		System.out.println(i);
		
		System.out.println(i.toString() instanceof String);
		
		System.out.println(Integer.toHexString(i));
		
		System.out.println(Integer.toBinaryString(i));
		
		System.out.println(Integer.toOctalString(i));
		
		System.out.println(Integer.valueOf("a", 16));
		
		System.out.println(Integer.parseInt("199"));
		
		System.out.println(i.getClass().getName());

		System.out.println(i.hashCode());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

	}

}
