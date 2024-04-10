package com.demo.java.arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10, 2, 5, 18, 9};

	    // 1. Sorting: Sorts the array in ascending order
	    System.out.println("Original Array: " + Arrays.toString(numbers));
	    Arrays.sort(numbers);
	    System.out.println("Sorted Array: " + Arrays.toString(numbers));

	    // 2. Searching: Finds the index of the first occurrence of 18
	    int index = Arrays.binarySearch(numbers, 18);
	    if (index >= 0) {
	      System.out.println("Element 18 found at index: " + index);
	    } else {
	      System.out.println("Element 18 not found in the array");
	    }

	    // 3. Copying: Creates a copy of the original array
	    int[] copy = Arrays.copyOf(numbers, numbers.length);
	    System.out.println("Copied Array: " + Arrays.toString(copy));

	    // 4. Filling: Fills a portion of the array with a specific value (from index 1 to 3 with 7)
	    Arrays.fill(numbers, 1, 4, 7);
	    System.out.println("Array after filling: " + Arrays.toString(numbers));

	    // 5. Comparing: Checks if the original and copied arrays are equal
	    boolean areEqual = Arrays.equals(numbers, copy);
	    System.out.println("Are original and copied arrays equal? " + areEqual);

	    // 6. Converting to List: Creates a List from a portion of the array (from index 2 to the end)
	   List<Integer> list = Arrays.asList(1,2,3,4);
	  System.out.println("Sublist from array: " + list);
	
	}

}
