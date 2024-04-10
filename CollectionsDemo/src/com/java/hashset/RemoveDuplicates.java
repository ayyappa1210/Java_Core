package com.java.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] arr = {1, 2, 3, 4, 2, 3, 5};
	        Set<Integer> uniqueElements = new HashSet<>();
	        List<Integer> result = new ArrayList<>();

	        for (int num : arr) {
	            if (!uniqueElements.contains(num)) {
	               uniqueElements.add(num);
	                result.add(num);
	            }
	        }

	        System.out.println("Array without duplicates: " + result);
	}

}
