package com.java.oop.Association;

//Engine class representing an engine
class Engine {
 private String type;

 public Engine(String type) {
     this.type = type;
 }

 public String getType() {
     return type;
 }
}

//Car class representing a car
class Car {
 private String model;
 private Engine engine; // Composition

 public Car(String model, String engineType) {
     this.model = model;
     this.engine = new Engine(engineType); // Creating engine object within the car constructor
 }

 public String getModel() {
     return model;
 }

 public Engine getEngine() {
     return engine;
 }
}

public class CompositionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // Create a car with an engine
        Car myCar = new Car("Toyota Camry", "V6");

        // Print information about the car
        System.out.println("Car Model: " + myCar.getModel());
        System.out.println("Engine Type: " + myCar.getEngine().getType());
	}

}
