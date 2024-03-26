package com.java.oop;

interface Animal {
	void sound();

	void eat();
}

class Dog implements Animal {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Woof!");

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog is eating.");
	}

}

class Cat implements Animal {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Meow!");

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cat is eating.");

	}

}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Cat();
		Animal dog = new Dog();

		cat.sound();
		cat.eat();

		dog.sound();
		dog.eat();

	}

}
