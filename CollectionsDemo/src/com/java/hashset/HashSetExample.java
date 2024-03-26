package com.java.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("apple");
        set.add("banana");
        set.add("orange");

        // Display the HashSet
        System.out.println("HashSet: " + set);

        // Adding a duplicate element (will not be added)
        boolean isAdded = set.add("apple");
        System.out.println("Element 'apple' added? " + isAdded);

        // Adding null
        isAdded = set.add(null);
        System.out.println("Null added? " + isAdded);

        // Display the HashSet after adding duplicates and null
        System.out.println("HashSet after adding duplicates and null: " + set);

        // Checking if a specific element exists
        System.out.println("Contains 'banana': " + set.contains("banana"));

        // Removing an element
        boolean isRemoved = set.remove("orange");
        System.out.println("Element 'orange' removed? " + isRemoved);

        // Display the HashSet after removal
        System.out.println("HashSet after removing 'orange': " + set);

        // Iterating over the elements
        System.out.println("Iterating over the elements:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Clearing the HashSet
        set.clear();
        System.out.println("HashSet cleared: " + set);
        
        // Checking if HashSet is empty
        System.out.println("Is HashSet empty? " + set.isEmpty());
	}

}
