package com.demo.java.arrays;

class Student {
	private long id;
	private String name;
	private String email;
	private int age;

	public Student(long id, String name, String email, int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + "]";
	}

}

public class ArrayDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(101, "Ayyappa", "ayyappa7434@gmail.com", 24);
		Student s2 = new Student(102, "Teja_Ayyappa", "teja7434@gmail.com", 23);
		Student s3 =new Student(103,"yalamandha","yalamandha@gmail.com",25);
		System.out.println(s1.toString());
		System.out.println(s2);
		System.out.println(s3);
		
		Student[] students = {s1,s2,s3};
		System.out.println(students);
		
		for(Student s:students) {
			System.out.println(s);
		}

	}

}
