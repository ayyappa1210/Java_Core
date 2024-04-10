package com.java.hashset;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 2, 3, 5 };
		Set<Integer> uniqueElements = new HashSet<>();
		Set<Integer> duplicateElements = new HashSet<>();

		for (int num : arr) {
			if (!uniqueElements.add(num)) {
				duplicateElements.add(num);
			}
		}

		System.out.println("Duplicate Elements: " + duplicateElements);
	}

}
