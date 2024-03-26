package com.java.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Vector<String> vector = new Vector<>();

	        // Add elements to the Vector
	        vector.add("Apple");
	        vector.add("Banana");
	        vector.add("Orange");

	        // Display the Vector
	        System.out.println("Vector: " + vector);

	        // Add an element at a specific index
	        vector.add(1, "Mango");
	        System.out.println("Vector after adding at index 1: " + vector);

	        // Remove an element by index
	        vector.remove(2);
	        System.out.println("Vector after removing at index 2: " + vector);

	        // Remove an element by value
	        vector.remove("Apple");
	        System.out.println("Vector after removing 'Apple': " + vector);

	        // Get the size of the Vector
	        System.out.println("Size of the Vector: " + vector.size());

	        // Get an element by index
	        System.out.println("Element at index 1: " + vector.get(1));

	        // Check if the Vector contains an element
	        System.out.println("Does Vector contain 'Banana'? " + vector.contains("Banana"));

	        // Clear the Vector
	        vector.clear();
	        System.out.println("Vector after clearing: " + vector);

	        // Check if the Vector is empty
	        System.out.println("Is the Vector empty? " + vector.isEmpty());

	        // Add elements again
	        vector.add("One");
	        vector.add("Two");
	        vector.add("Three");

	        // Get an enumeration of the elements
	        Enumeration<String> enumeration = vector.elements();
	        System.out.println("Enumeration of Vector:");
	        while (enumeration.hasMoreElements()) {
	            System.out.println(enumeration.nextElement());
	        }
	}

}
