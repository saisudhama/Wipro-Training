package com.wipro.threads;

public class Thread1 extends Thread {
	
	public void run() {
		
		synchronized (this) {
			
			try {
				
				for(int i = 0; i < 100; i++) {
					
					if(i == 50) {
						this.wait();
						System.out.println(Thread.currentThread().getName() + " Thread will wait");
					}
					
					System.out.println("Thread 1: " + i);
				}
				
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
