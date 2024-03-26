package com.java.enumuration;

enum TrafficLight {
	RED("Stop"), YELLOW("Proceed with caution"), GREEN("Go");

	private final String action;

	// Constructor
	TrafficLight(String action) {
		this.action = action;
	}

	// Method to get the action associated with the traffic light
	public String getAction() {
		return action;
	}
	
	
}

public class EnumDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficLight redLight = TrafficLight.RED;
		System.out.println("When the light is " + redLight + ", " + redLight.getAction());
	}

}
