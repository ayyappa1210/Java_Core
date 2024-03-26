package com.java.arraylist;

import java.util.ArrayList;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Override toString method for better printing
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class ArrayListPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create an ArrayList to store Person objects
        ArrayList<Person> people = new ArrayList<>();

        // Create some Person objects and add them to the ArrayList
        Person person1 = new Person("John", 30);
        Person person2 = new Person("Alice", 25);
        Person person3 = new Person("Bob", 35);

        people.add(person1);
        people.add(person2);
        people.add(person3);

        // Display the contents of the ArrayList
        System.out.println("People in the ArrayList:");
        for (Person person : people) {
            System.out.println(person);
        }

        // Accessing elements by index
        System.out.println("Person at index 1: " + people.get(1));

        // Removing an element by index
        people.remove(0);
        System.out.println("ArrayList after removing element at index 0:");
        for (Person person : people) {
            System.out.println(person);
        }
	}

}
