package com.java.oop.Association;

import java.util.ArrayList;
import java.util.List;

// Student class representing a student
class Student1 {
    private String name;
    private List<Course1> courses;

    public Student1(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enroll(Course1 course) {
        courses.add(course);
        course.addStudent(this);
    }

    public List<Course1> getCourses() {
        return courses;
    }
}

// Course class representing a course
class Course1 {
    private String title;
    private List<Student1> students;

    public Course1(String title) {
        this.title = title;
        this.students = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void addStudent(Student1 student) {
        students.add(student);
    }

    public List<Student1> getStudents() {
        return students;
    }
}

public class ManyToManyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Create students
        Student1 student1 = new Student1("Alice");
        Student1 student2 = new Student1("Bob");

        // Create courses
        Course1 course1 = new Course1("Java Programming");
        Course1 course2 = new Course1("Database Management");

        // Enroll students in courses
        student1.enroll(course1);
        student1.enroll(course2);
        student2.enroll(course1);

        // Print information
        System.out.println("Courses enrolled by " + student1.getName() + ":");
        List<Course1> coursesOfStudent1 = student1.getCourses();
        for (Course1 course : coursesOfStudent1) {
            System.out.println("Title: " + course.getTitle());
        }

        System.out.println("\nStudents enrolled in " + course1.getTitle() + ":");
        List<Student1> studentsInCourse1 = course1.getStudents();
        for (Student1 student : studentsInCourse1) {
            System.out.println("Name: " + student.getName());
        }
	}

}
