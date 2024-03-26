package com.java.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Persony {
    private String name;
    private int age;

    public Persony(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class PersonAgeComparatory implements Comparator<Persony> {
    @Override
    public int compare(Persony p1, Persony p2) {
        // Compare by age in descending order
        return Integer.compare(p2.getAge(), p1.getAge());
    }
}
public class ComparatorDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Persony> people = new ArrayList<>();
	        people.add(new Persony("Alice", 25));
	        people.add(new Persony("Bob", 30));
	        people.add(new Persony("Charlie", 20));

	        // Print the list before sorting
	        System.out.println("Before sorting:");
	        for (Persony person : people) {
	            System.out.println(person);
	        }

	        // Sort the list using a custom comparator
	        Collections.sort(people, new PersonAgeComparatory());

	        // Print the list after sorting
	        System.out.println("\nAfter sorting by age in descending order:");
	        for (Persony person : people) {
	            System.out.println(person);
	        }
	}

}
