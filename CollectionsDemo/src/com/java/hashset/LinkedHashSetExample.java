package com.java.hashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a LinkedHashSet
		LinkedHashSet<String> set = new LinkedHashSet<>();

		// Adding elements to the LinkedHashSet
		set.add("apple");
		set.add("banana");
		set.add("orange");

		// Display the LinkedHashSet
		System.out.println("LinkedHashSet: " + set);

		// Adding a duplicate element (will not be added)
		boolean isAdded = set.add("apple");
		System.out.println("Element 'apple' added? " + isAdded);

		// Adding null
		isAdded = set.add(null);
		System.out.println("Null added? " + isAdded);

		// Display the LinkedHashSet after adding duplicates and null
		System.out.println("LinkedHashSet after adding duplicates and null: " + set);

		// Checking if a specific element exists
		System.out.println("Contains 'banana': " + set.contains("banana"));

		// Removing an element
		boolean isRemoved = set.remove("orange");
		System.out.println("Element 'orange' removed? " + isRemoved);

		// Display the LinkedHashSet after removal
		System.out.println("LinkedHashSet after removing 'orange': " + set);

		// Iterating over the elements
		System.out.println("Iterating over the elements:");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}

		// Clearing the LinkedHashSet
		set.clear();
		System.out.println("LinkedHashSet cleared: " + set);

		// Checking if LinkedHashSet is empty
		System.out.println("Is LinkedHashSet empty? " + set.isEmpty());
	}

}
