package com.java.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getter and setter methods

	@Override
	public int compareTo(Person other) {
		// Compare based on age
		return Integer.compare(this.age, other.age);
	}

	@Override
	public String toString() {
		return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
	}
}

public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people = new ArrayList<>();
		people.add(new Person("Alice", 30));
		people.add(new Person("Bob", 25));
		people.add(new Person("Charlie", 35));

		System.out.println("Before sorting:");
		for (Person person : people) {
			System.out.println(person);
		}

		Collections.sort(people);

		System.out.println("\nAfter sorting by age:");
		for (Person person : people) {
			System.out.println(person);
		}
	}

}
