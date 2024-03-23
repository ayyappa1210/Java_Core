package com.java.thread;



class MyThreadx implements Runnable {
	int num;
	public MyThreadx(int num) {
		// TODO Auto-generated constructor stub
		this.num=num;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <10; i++) {
			System.out.println(num+" * "+i+" ="+(num*i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class MyThready implements Runnable {
	int num;
	public MyThready(int i) {
		// TODO Auto-generated constructor stub
		num=i;
	}

	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <10; i++) {
			System.out.println(num+" * "+i+" ="+(num*i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class ThreadDemo4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Runnable m = new MyThreadx(5);
		Thread t = new Thread(m);
		t.start();
		t.join();
		
		Runnable r = new MyThready(6);
		Thread s = new Thread(r);
		s.start();

	}

}
