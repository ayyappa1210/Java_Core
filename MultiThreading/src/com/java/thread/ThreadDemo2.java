package com.java.thread;

class MyThread_1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getPriority());

	}

}

class MyThread_2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println("-------------------------");
	}

}

class MyThread_3 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println("-------------------------");
	}

}

public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new MyThread_1();
		Thread t1 = new Thread(r);
		t1.setName("Thread1");
		t1.start();

		Thread t2 = new Thread(r);
		t2.setName("Thread2");
		t2.start();

		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println("---------------------");

		Runnable r1 = new MyThread_2();
		Thread t3 = new Thread(r1);
		t3.setName("Thread3");
		t3.setPriority(9);
		t3.start();

		Runnable r2 = new MyThread_3();
		Thread t4 = new Thread(r2);
		t4.setName("Thread4");
		t4.setPriority(10);
		t4.start();
	}

}
