package com.wipro.day5;

class MyThread1 extends Thread {
	
	int a = 1, b = 2, c;

	public void run() {
		synchronized (this) {
			try {

				System.out.println(this.a++ + ++this.b);

				System.out.println(Thread.currentThread().getName() + " Thread will wait");
				this.wait();

				this.c = this.a + this.b;
				System.out.println(this.c + " c value");

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread2 extends Thread {

	MyThread1 t1;
	MyThread2 (MyThread1 t1) { this.t1 = t1; }
	
	int d = 3, e = 4;

	public void run() {
		synchronized (this.t1) {
			
			System.out.println(++this.d + this.e++);

			System.out.println(Thread.currentThread().getName() + " Thread is Notifyied");
			this.t1.notify();
			
			try { this.t1.join(); Thread.sleep(3000); } catch(InterruptedException e1) { e1.printStackTrace(); }
			
			System.out.println(t1.a + " 'a' value from MyThread1");
			System.out.println(t1.b + " 'b' value from MyThread1");
			System.out.println(t1.c + " 'c' value from MyThread1");
			
			System.out.println(t1.c + this.d + this.e);

		}
	}
}

public class ThreadWaitRun {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread1 obj1 = new MyThread1();
		MyThread2 obj2 = new MyThread2(obj1);
		
		Thread t1 = new Thread(obj1, "MyThread 1");
		Thread t2 = new Thread(obj2, "MyThread 2");
		
		t1.start();
//		Thread.sleep(2000);
		
		t2.start();
		t1.join();

	}

}
