package com.java.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Display the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Add elements at specific positions
        linkedList.addFirst("Mango"); // Add at the beginning
        linkedList.addLast("Grapes"); // Add at the end
        linkedList.add(2, "Pineapple"); // Add at index 2

        // Display the LinkedList after adding elements
        System.out.println("LinkedList after adding elements: " + linkedList);

        // Access elements by index
        System.out.println("Element at index 3: " + linkedList.get(3));

        // Update an element
        linkedList.set(1, "Strawberry");
        System.out.println("LinkedList after updating: " + linkedList);

        // Remove elements
        linkedList.remove(); // Remove the first element
        linkedList.remove(3); // Remove element at index 3
        linkedList.removeLast(); // Remove the last element
        System.out.println("LinkedList after removal: " + linkedList);

        // Check if an element exists
        System.out.println("Does 'Banana' exist? " + linkedList.contains("Banana"));

        // Get the size of the LinkedList
        System.out.println("Size of the LinkedList: " + linkedList.size());

        // Clear the LinkedList
        linkedList.clear();
        System.out.println("LinkedList after clearing: " + linkedList);

        // Add elements again
        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");

        // Create a ListIterator and perform bidirectional iteration
        ListIterator<String> iterator = linkedList.listIterator();
        System.out.println("Bidirectional iteration:");
        while (iterator.hasNext()) {
            System.out.println("Next: " + iterator.next());
        }
        while (iterator.hasPrevious()) {
            System.out.println("Previous: " + iterator.previous());
        }
	}

}
