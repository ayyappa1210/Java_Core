package com.java.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Create a HashMap
		        Map<String, Integer> map = new HashMap<>();

		        // Add key-value pairs to the map
		        map.put("Alice", 25);
		        map.put("Bob", 30);
		        map.put("Charlie", 35);
		        map.put(null, 50);
		        map.put(null, 50);//only one null key will be allowed
		        map.put("xxx", null);
		        map.put("yyy", null);

		        // Display the map
		        System.out.println("HashMap: " + map.toString());

		        // Get value associated with a key
		        int ageOfBob = map.get("Bob");
		        System.out.println("Age of Bob: " + ageOfBob);

		        // Check if the map contains a specific key
		        boolean containsKey = map.containsKey("Alice");
		        System.out.println("Contains key 'Alice': " + containsKey);

		        // Check if the map contains a specific value
		        boolean containsValue = map.containsValue(40);
		        System.out.println("Contains value 40: " + containsValue);

		        // Remove a key-value pair
		        Integer removedValue = map.remove("Charlie");
		        System.out.println("Removed value associated with 'Charlie': " + removedValue);

		        // Size of the map
		        int size = map.size();
		        System.out.println("Size of the map: " + size);

		        // Iterating over the map
		        System.out.println("Iterating over the map:");
		        for (Map.Entry<String, Integer> entry : map.entrySet()) {
		            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		        }

		        // Replace the value associated with a key
		        Integer replacedValue = map.replace("Bob", 32);
		        System.out.println("Replaced value associated with 'Bob': " + replacedValue);

		        // Clear the map
		        map.clear();
		        System.out.println("Map cleared: " + map);

		        // Check if the map is empty
		        boolean isEmpty = map.isEmpty();
		        System.out.println("Is map empty? " + isEmpty);
	}

}
