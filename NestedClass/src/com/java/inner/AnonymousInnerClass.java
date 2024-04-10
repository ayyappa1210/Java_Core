package com.java.inner;

interface Greeting {
	void greet();
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeting greet = new Greeting() {

			@Override
			public void greet() {
				// TODO Auto-generated method stub
				System.out.println("Hello Ayyappa");
			}
		};
		greet.greet();
	}

}
