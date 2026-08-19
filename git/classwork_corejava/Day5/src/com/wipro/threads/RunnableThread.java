package com.wipro.threads;

public class RunnableThread implements Runnable {

	public static void main(String[] args) {
		
		RunnableThread rt = new RunnableThread();
		
		Thread t = new Thread(rt);
		
		t.start();

	}

	@Override
	public void run() {
		
		System.out.println("This is Runnable Thread");
		
	}

}
