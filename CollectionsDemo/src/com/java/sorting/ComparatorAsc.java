package com.java.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Personx {
    private String name;
    private int age;

    public Personx(String name, int age) {
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

class PersonAgeComparator implements Comparator<Personx> {
    @Override
    public int compare(Personx p1, Personx p2) {
        // Compare by age
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}
public class ComparatorAsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Personx> people = new ArrayList<>();
	        people.add(new Personx("Alice", 25));
	        people.add(new Personx("Bob", 30));
	        people.add(new Personx("Charlie", 20));

	        // Print the list before sorting
	        System.out.println("Before sorting:");
	        for (Personx person : people) {
	            System.out.println(person);
	        }

	        // Sort the list using a custom comparator
	        Collections.sort(people, new PersonAgeComparator());

	        // Print the list after sorting
	        System.out.println("\nAfter sorting by age:");
	        for (Personx person : people) {
	            System.out.println(person);
	        }
	}

}
