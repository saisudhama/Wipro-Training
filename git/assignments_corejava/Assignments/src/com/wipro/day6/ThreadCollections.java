package com.wipro.day6;

import java.util.Set;
import java.util.TreeSet;

class MyThread1 extends Thread {
	
	Set<Integer> tS = new TreeSet<Integer>();
	
	public void run() {
		synchronized (this) {
			try {
				this.tS.add(1);
				this.tS.add(5);
				
				System.out.println("At Start of MyThread1 wait");
				System.out.println(this.tS.toString());
				
				System.out.println(Thread.currentThread().getName() + " Thread will wait");
				this.wait();
				
				System.out.println("At Start of MyThread1 after wait");
				System.out.println(this.tS.toString());
				
				this.tS.remove(1);
				
				System.out.println("At end of MyThread1");
				System.out.println(this.tS.toString());
			} catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
	
}

class MyThread2 extends Thread {
	
	MyThread1 t1;
	MyThread2 (MyThread1 t1) { this.t1 = t1; }
	
	public void run() {
		
		synchronized (this.t1) {
			try {
				System.out.println("At start of MyThread2");
				System.out.println(this.t1.tS.toString());
				
				this.t1.tS.add(10);
				
				System.out.println("At start of MyThread2 notify");
				System.out.println(this.t1.tS.toString());
				
				System.out.println(Thread.currentThread().getName() + " Thread is Notifyied");
				this.t1.notify();
//				MyThread2.sleep(3000);
				this.t1.join();

				System.out.println("At start of MyThread2 after notify");
				System.out.println(this.t1.tS.toString());
				
				this.t1.tS.add(99);
				this.t1.tS.add(0);
				this.t1.tS.add(2);
				
				System.out.println("At end of MyThread2");
				System.out.println(this.t1.tS.toString());
			} catch (InterruptedException e) { e.printStackTrace(); }
		}
		
	}
	
}

public class ThreadCollections {

	public static void main(String[] args) {
		
		MyThread1 obj1 = new MyThread1();
		MyThread2 obj2 = new MyThread2(obj1);
		
		Thread t1 = new Thread(obj1, "MyThread 1");
		Thread t2 = new Thread(obj2, "MyThread 2");
		
		t1.start();
//		Thread.sleep(2000);
		
		t2.start();

	}

}
