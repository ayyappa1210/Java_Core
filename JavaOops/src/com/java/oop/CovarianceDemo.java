package com.java.oop;

class Animaly {
    Animaly reproduce() {
        System.out.println("Animal reproducing");
        return new Animaly();
    }
}

class Dogy extends Animaly {
    // Covariant return type: Dog is a subtype of Animal
    @Override
    Dogy reproduce() {
        System.out.println("Dog reproducing");
        return new Dogy();
    }
}

public class CovarianceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Animaly animal = new Animaly();
	        Animaly dog = new Dogy();

	        animal.reproduce(); // Calls Animal's reproduce method
	        dog.reproduce();    // Calls Dog's reproduce method
	}

}
