package com.java.hashmap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        treeMap.put("Bob", 30);
        treeMap.put("Alice", 25);
        treeMap.put("Charlie", 35);

        // Display the TreeMap (sorted order)
        System.out.println("TreeMap: " + treeMap);

        // Accessing values using keys
        int ageOfAlice = treeMap.get("Alice");
        System.out.println("Age of Alice: " + ageOfAlice);

        // Checking if the map contains a specific key
        boolean containsKey = treeMap.containsKey("Charlie");
        System.out.println("Contains key 'Charlie': " + containsKey);

        // Removing a key-value pair
        Integer removedValue = treeMap.remove("Bob");
        System.out.println("Removed value associated with 'Bob': " + removedValue);

        // Size of the map
        int size = treeMap.size();
        System.out.println("Size of the TreeMap: " + size);

        // Iterating over the map
        System.out.println("Iterating over the TreeMap:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Clear the map
        treeMap.clear();
        System.out.println("TreeMap cleared: " + treeMap);

        // Check if the map is empty
        boolean isEmpty = treeMap.isEmpty();
        System.out.println("Is TreeMap empty? " + isEmpty);
	}

}
