package com.wipro;

public class DoubleDemo {
	
	public static void main(String[] args) {
		
		Double d = 10e19, d1 = 23.5;
		
		System.out.println(d.intValue());
		System.out.println(d.floatValue());
		
		System.out.println(d.isNaN());
		
		System.out.println(d1.isInfinite());

		System.out.println(Double.POSITIVE_INFINITY);

		System.out.println(Double.MIN_VALUE);

		System.out.println(Double.MAX_VALUE);
		
		
		System.out.println(Long.MAX_VALUE);

		System.out.println(Long.MIN_VALUE);
		
	}

}
