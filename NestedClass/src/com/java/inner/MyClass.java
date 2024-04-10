package com.java.inner;

class Animal {
	class Dog {
		int legs = 4;

		public void makeSound() {
			System.out.println("How a dog sound: Bark Bark");
		}
	}
}

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animalObj = new Animal();
		Animal.Dog dogObj = animalObj.new Dog();
		System.out.println("How many legs can a dog have: "+dogObj.legs);
		dogObj.makeSound();

	}

}
