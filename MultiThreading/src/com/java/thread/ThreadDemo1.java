package com.java.thread;

class MyThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}

	}

}

public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new MyThread();
		Thread t1 = new Thread(r);
		t1.setName("Thread1");
		t1.start();

		Thread t2 = new Thread(r);
		t2.setName("Thread2");
		t2.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}
	}

}
