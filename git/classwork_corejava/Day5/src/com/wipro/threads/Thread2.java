package com.wipro.threads;

public class Thread2 extends Thread {
	
	Thread t1;
	
	Thread2 (Thread t1) {
		this.t1 = t1;
	}

	public void run() {
		synchronized (this.t1) {
			
			for(int j = 100; j < 200; j++) {
				
				if(j == 150) {
					this.t1.notify();
					System.out.println(Thread.currentThread().getName() + " Thread is Notifyied");
				}
				
				System.out.println("Thread 2: " + j);
				
			}
			
		}
	}
	
}
