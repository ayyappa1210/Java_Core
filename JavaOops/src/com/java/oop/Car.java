package com.java.oop;
//Encapsulation Demo
public class Car {
	 private String make;
	    private String model;
	    private int year;
	    private boolean isEngineOn;

	    // Constructor
	    public Car(String make, String model, int year) {
	        this.make = make;
	        this.model = model;
	        this.year = year;
	        this.isEngineOn = false;
	    }

	    // Getter methods
	    public String getMake() {
	        return make;
	    }

	    public String getModel() {
	        return model;
	    }

	    public int getYear() {
	        return year;
	    }

	    // Method to start the engine
	    public void startEngine() {
	        if (!isEngineOn) {
	            System.out.println("Starting the engine.");
	            isEngineOn = true;
	        } else {
	            System.out.println("Engine is already running.");
	        }
	    }

	    // Method to stop the engine
	    public void stopEngine() {
	        if (isEngineOn) {
	            System.out.println("Stopping the engine.");
	            isEngineOn = false;
	        } else {
	            System.out.println("Engine is already off.");
	        }
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car myCar = new Car("Toyota", "Camry", 2020);

	        // Accessing attributes using getter methods
	        System.out.println("Make: " + myCar.getMake());
	        System.out.println("Model: " + myCar.getModel());
	        System.out.println("Year: " + myCar.getYear());

	        // Starting the engine
	        myCar.startEngine();
	        myCar.startEngine(); // Attempting to start the engine again

	        // Stopping the engine
	        myCar.stopEngine();
	        myCar.stopEngine(); // Attempting to stop the engine again
	}

}
