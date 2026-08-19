package com.wipro;

public class DaemonDemo extends Thread {
	
public void run() {
		
		System.out.println("Current Thread");
		System.out.println(Thread.currentThread().getName() + 
				" is Daemon Thread: " + Thread.currentThread().isDaemon());
		
	}

	public static void main(String[] args) {
		
		//Daemon threads are not user thread
		//These threads are like helpers for the user thread
		//there life is dependent on the user threads
		//so without user threads there is no daemon thread even if we create a thread as daemon

		DaemonDemo d = new DaemonDemo();
		d.setDaemon(true);
		d.start();
		
		DaemonDemo d1 = new DaemonDemo();
		d1.start();

	}

}
