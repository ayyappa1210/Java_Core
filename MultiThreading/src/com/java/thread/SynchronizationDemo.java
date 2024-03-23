package com.java.thread;

class IncrementThread extends Thread {
	private Counter counter;

	public IncrementThread(Counter counter) {
		super();
		this.counter = counter;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			counter.increment();
			System.out.println("Incremented. Current count:" + counter.getCount());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class DecrementThread extends Thread {
	private Counter counter;

	public DecrementThread(Counter counter) {
		super();
		this.counter = counter;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		counter.decrement();
		;
		System.out.println("Decremented. Current count:" + counter.getCount());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Counter {
	private int count = 0;

	public synchronized void increment() {
		count++;
	}

	public synchronized void decrement() {
		count--;
	}

	public synchronized int getCount() {
		return count;
	}

}

public class SynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = new Counter();
		IncrementThread incrementThread = new IncrementThread(counter);
		DecrementThread decrementThread = new DecrementThread(counter);

		incrementThread.start();
		decrementThread.start();

		try {
			incrementThread.join();
			decrementThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Final Count:" + counter.getCount());

	}

}
