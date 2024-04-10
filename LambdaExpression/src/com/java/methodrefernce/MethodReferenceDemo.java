package com.java.methodrefernce;

@FunctionalInterface
interface MyInterface {
	void myFunction();
}

@FunctionalInterface
interface Interface1 {
	void m1();
}
@FunctionalInterface
interface Interface2 {
	void m2();
}
class MyClass {
	public MyClass() {
		System.out.println("Implementation for m2()");
	}
}
class A {
	public void print() {
		System.out.println("Implementation for m1()");
	}
}
class Test {
	static public void test() {
		System.out.println("Implementation for myFunction()");
	}
}

public class MethodReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static method reference
		MyInterface i = Test::test;
		i.myFunction();
		
		//Non-static method reference
		Interface1 obj = new A()::print;
		obj.m1();
		
		//Constructor method reference
		Interface2 c = MyClass::new;
		c.m2();
	}

}
