package com.java.thread;

class Thread1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("Daemon thread is running...!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class ThreadDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Thread1());
		t1.setDaemon(true);
		t1.start();

		System.out.println("Main thread is running...!");

	}

}
