package com.wipro.threads;

public class NotifyDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread1 obj1 = new Thread1();
		Thread2 obj2 = new Thread2(obj1);
		
		Thread t1 = new Thread(obj1, "Thread 1");
		Thread t2 = new Thread(obj2, "Thread 2");
		
		t1.start();
		Thread.sleep(5000);
		
		t2.start();
		
	}

}
