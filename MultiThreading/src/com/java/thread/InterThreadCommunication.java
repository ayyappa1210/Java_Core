package com.java.thread;

class SharedObject {
	private int data;
	private boolean isProduced=false;
	
	public synchronized void produce(int value) {
		 while (isProduced) {
	            try {
	                wait(); // Wait for the consumer to consume
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	            }
	        }

	        data = value;
	        System.out.println("Produced: " + value);
	        isProduced = true;
	        notify(); // Notify consumer that new data is available
	}
	
	 public synchronized void consume() {
	        while (!isProduced) {
	            try {
	                wait(); // Wait for the producer to produce
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	            }
	        }

	        System.out.println("Consumed: " + data);
	        isProduced = false;
	        notify(); // Notify producer that consumption is done
	    }
}
class ProducedThread extends Thread {
	private SharedObject sharedObject;

	public ProducedThread(SharedObject sharedObject) {
		// TODO Auto-generated constructor stub
		this.sharedObject=sharedObject;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	for(int i=0;i<5;i++) {
		sharedObject.produce(i);
	}
	}
	
}
class ConsumerThread extends Thread {
	private SharedObject sharedObject;
	
	public ConsumerThread(SharedObject sharedObject) {
		super();
		this.sharedObject = sharedObject;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			sharedObject.consume();;
		}
	}
	
}
public class InterThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final SharedObject sharedObject = new SharedObject();
		ProducedThread producedThread = new ProducedThread(sharedObject);
		ConsumerThread consumerThread = new ConsumerThread(sharedObject);
		producedThread.start();
		consumerThread.start();

	}

}
