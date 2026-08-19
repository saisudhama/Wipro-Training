package com.wipro;

public class ByteDemo {

	public static void main(String[] args) {
		
		Byte b = 10, b2 = 127;
		
		System.out.println(b.intValue());
		
		System.out.println(b.doubleValue());
		
		System.out.println(b.hashCode());

		System.out.println(b.shortValue());

		System.out.println("Max Value for Byte is " + Byte.MAX_VALUE);

		System.out.println("Min value for Byte is " + Byte.MIN_VALUE);

		System.out.println(Byte.compare(b, b2));

		System.out.println(Byte.decode("#f"));

	}

}
