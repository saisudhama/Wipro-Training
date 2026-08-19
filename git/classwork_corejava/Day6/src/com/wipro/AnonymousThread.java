package com.wipro;

public class AnonymousThread {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {
			public void run() { System.out.println("First Way creation"); }
		});

		Thread t2 = new Thread(() -> { System.out.println("Second Way creation"); });
		
		t1.start();
		t2.start();

	}
}
