package com.java.arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Create an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Displaying the ArrayList
        System.out.println("ArrayList: " + numbers);

        // Accessing elements by index
        System.out.println("Element at index 2: " + numbers.get(2));

        // Updating an element at a specific index
        numbers.set(3, 45);
        System.out.println("ArrayList after updating: " + numbers);

        // Removing an element by value
        numbers.remove(Integer.valueOf(20));
        System.out.println("ArrayList after removing value 20: " + numbers);

        // Removing an element by index
        numbers.remove(1);
        System.out.println("ArrayList after removing element at index 1: " + numbers);

        // Checking if an element exists
        System.out.println("Does 30 exist in the ArrayList? " + numbers.contains(30));

        // Sorting the ArrayList
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);

        // Reversing the order of elements
        Collections.reverse(numbers);
        System.out.println("Reversed ArrayList: " + numbers);

        // Clearing the ArrayList
        numbers.clear();
        System.out.println("ArrayList after clearing: " + numbers);

        // Checking if the ArrayList is empty
        System.out.println("Is the ArrayList empty? " + numbers.isEmpty());

        // Adding elements from another collection
        List<Integer> moreNumbers = new ArrayList<>();
        moreNumbers.add(100);
        moreNumbers.add(200);
        moreNumbers.add(300);
        numbers.addAll(moreNumbers);
        System.out.println("ArrayList after adding more elements: " + numbers);

        // Iterating over the ArrayList using an iterator
        Iterator<Integer> iterator = numbers.iterator();
        System.out.print("Elements in the ArrayList (using iterator): ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Getting the size of the ArrayList
        System.out.println("Size of the ArrayList: " + numbers.size());
	}

}
