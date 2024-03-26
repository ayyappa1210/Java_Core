package com.java.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BiDirectionalListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> list = new ArrayList<>();

	        // Add elements to the ArrayList
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Orange");
	        list.add("Grapes");

	        // Obtain a ListIterator from the ArrayList
	        ListIterator<String> iterator = list.listIterator();

	        // Forward iteration
	        System.out.println("Forward Iteration:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	        // Backward iteration
	        System.out.println("\nBackward Iteration:");
	        while (iterator.hasPrevious()) {
	            System.out.println(iterator.previous());
	        }
	}

}
