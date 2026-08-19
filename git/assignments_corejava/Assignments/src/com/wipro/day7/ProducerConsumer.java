package com.wipro.day7;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {

	static class PC {

		List<Integer> aL = new ArrayList<>();
		int capacity = 4;

		void produce() throws InterruptedException {
			int value = 0;
			while (true) {
				synchronized (this) {
					if (aL.size() == capacity)
						wait();

					aL.add(value++);
					System.out.println("Added value " + (value - 1) + " Capacity: " + aL.size());

					notify();
					Thread.sleep(1000);
				}
			}
		}

		void consume() throws InterruptedException {
			while (true) {
				synchronized (this) {
					if (aL.size() == 0)
						wait();

					System.out.println("Removed value is: " + aL.removeFirst() + " Capacity: " + aL.size());

					notify();
					Thread.sleep(1000);
				}
			}
		}
		
	}

	public static void main(String[] args) throws InterruptedException {

		PC pc = new PC();

		Thread p = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread c = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		p.start();
		c.start();

		p.join();
		c.join();

	}
	
}