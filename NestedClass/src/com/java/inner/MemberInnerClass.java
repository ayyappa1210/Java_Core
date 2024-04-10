package com.java.inner;

class School {
	private String name;

	public School(String name) {
		this.name = name;
	}

	class Student {
		private String studentName;

		public Student(String name) {
			this.studentName = name;
		}

		public void display() {
			System.out.println("School name: " + name);
			System.out.println("Student name: " + studentName);
		}

	}

}

public class MemberInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School schoolObj = new School("Sri Vidyanikethan School");
		School.Student studentObj = schoolObj.new Student("Ponnapoola Ayyappa");
		studentObj.display();
	}

}
