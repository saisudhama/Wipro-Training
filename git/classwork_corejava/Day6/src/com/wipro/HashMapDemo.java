package com.wipro;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> hM = new HashMap<Integer, String>();
		hM.put(1, "Value 1");
		hM.put(2, "Value 2");
		hM.put(3, "Value 3");
		
		System.out.println(hM);
		
		for(Map.Entry<Integer, String> e: hM.entrySet()) {
			System.out.println("Key is " + e.getKey() + ", Value is " + e.getValue());
		}
		
	}

}
