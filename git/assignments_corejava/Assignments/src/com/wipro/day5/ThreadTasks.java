package com.wipro.day5;

class Thread1 extends Thread {
	public void run() {
		System.out.println("Extends Thread");
	}
}

class Thread2 implements Runnable {
	public void run() {
		System.out.println("Implements Runnable");
	}
}

public class ThreadTasks {

	public static void main(String[] args) throws InterruptedException {

		Thread2 rt = new Thread2(); //Doing multi threading
		Thread t1 = new Thread(rt, "Thread Naming"); //naming thread
		
		t1.setPriority(3); //setting priority to threads
		
		t1.start();
		
		Thread.sleep(3000); //sleep in threads
		
		Thread1 t = new Thread1();
		t.start();

	}

}
