package com.java.hashset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a TreeSet
		TreeSet<Integer> set = new TreeSet<>();

		// Adding elements to the TreeSet
		set.add(3);
		set.add(1);
		set.add(5);

		// Display the TreeSet (sorted order)
		System.out.println("TreeSet: " + set);

		// Attempting to add a duplicate element (will not be added)
		boolean isAdded = set.add(3);
		System.out.println("Element '3' added? " + isAdded);

		// Checking the size of the TreeSet
		System.out.println("Size of TreeSet: " + set.size());

		// Checking if a specific element exists
		System.out.println("Contains '1': " + set.contains(1));

		// Removing an element
		boolean isRemoved = set.remove(5);
		System.out.println("Element '5' removed? " + isRemoved);

		// Display the TreeSet after removal
		System.out.println("TreeSet after removing '5': " + set);

		// Iterating over the elements
		System.out.println("Iterating over the elements:");
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			int element = iterator.next();
			System.out.println(element);
		}

		// Getting the first element
		System.out.println("First element: " + set.first());

		// Getting the last element
		System.out.println("Last element: " + set.last());

		// Clearing the TreeSet
		set.clear();
		System.out.println("TreeSet cleared: " + set);

		// Checking if TreeSet is empty
		System.out.println("Is TreeSet empty? " + set.isEmpty());
	}

}
