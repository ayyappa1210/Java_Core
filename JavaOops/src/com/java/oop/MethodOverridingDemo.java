package com.java.oop;

//Superclass
class Animalx {
	public void makeSound() {
		System.out.println("Some generic sound");
	}
}

//Subclass
class Dogx extends Animalx {
	// Overriding the makeSound method of the superclass
	@Override
	public void makeSound() {
		System.out.println("Woof");
	}
}

//Subclass
class Catx extends Animalx {
	// Overriding the makeSound method of the superclass
	@Override
	public void makeSound() {
		System.out.println("Meow");
	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animalx animal1 = new Dogx(); // Creating an instance of Dog
		Animalx animal2 = new Catx(); // Creating an instance of Cat

		animal1.makeSound(); // Calls Dog's implementation of makeSound
		animal2.makeSound(); // Calls Cat's implementation of makeSound
	}

}
