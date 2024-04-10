package com.java.eight;

@FunctionalInterface
interface MyFunctionalInterface {
	void myFunction();
}

class MyFunctionImpl implements MyFunctionalInterface {

	@Override
	public void myFunction() {
		// TODO Auto-generated method stub
		System.out.println("Implementation of my function");
	}

}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInterface obj = new MyFunctionImpl();
		obj.myFunction();
		
		
	}

}
