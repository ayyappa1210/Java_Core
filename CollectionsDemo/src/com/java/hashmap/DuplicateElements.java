package com.java.hashmap;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 2, 3, 4, 2, 3, 5};

	        Map<Integer, Integer> frequencyMap = new HashMap<>();

	        for (int num : arr) {
	            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
	        }
	        System.out.println(frequencyMap);

	        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println("Duplicate Element: " + entry.getKey());
	            }
	        }
	}

}
