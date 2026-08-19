package com.wipro;

public record Laptop(int ram, String model) implements HardDisk { 
	
	public void carryAble() {
		System.out.println("Can carry easily");
	}

	@Override
	public void storage(int num) {
		System.out.println("Has 1 TB external storage");
	}
	
}