package com.wipro.threads;

public class MyThread extends Thread {
	
	Runnable run = () -> System.out.println("Thread 2");
	//Runnable is a FunctionalInterface so we can use Lambda
	//but it is not overridden so to use above we need to override the above one

	public void run() {
		
		run.run();
		
	}
	
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		Thread t2 = new Thread(() -> System.out.println("Thread 1"));
		
		t1.start();
		t2.start();

	}

}
