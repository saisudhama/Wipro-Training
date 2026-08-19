package com.wipro.threads;

public class ThreadDemo extends Thread {

	public void run() {
		System.out.println("The Thread Id is " + Thread.currentThread().threadId());
		System.out.println("The Thread priority of " + Thread.currentThread().getName() + " is " + Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		
		ThreadDemo td1 = new ThreadDemo();
		ThreadDemo td2 = new ThreadDemo();

		td1.setPriority(3);
		td2.setPriority(7);

		td1.start();
		td2.start();

	}

}
