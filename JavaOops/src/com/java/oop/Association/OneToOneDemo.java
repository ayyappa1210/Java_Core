package com.java.oop.Association;

//Class representing a Student
class Student {
 private String name;
 private int id;

 public Student(String name, int id) {
     this.name = name;
     this.id = id;
 }

 public String getName() {
     return name;
 }

 public int getId() {
     return id;
 }
}

//Class representing a Course
class Course {
 private String title;
 private int courseId;

 public Course(String title, int courseId) {
     this.title = title;
     this.courseId = courseId;
 }

 public String getTitle() {
     return title;
 }

 public int getCourseId() {
     return courseId;
 }
}

//Class representing Association between Student and Course
class StudentCourseAssociation {
 private Student student;
 private Course course;

 public StudentCourseAssociation(Student student, Course course) {
     this.student = student;
     this.course = course;
 }

 public Student getStudent() {
     return student;
 }

 public Course getCourse() {
     return course;
 }
}

public class OneToOneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student student1 = new Student("Alice", 101);
	        Course course1 = new Course("Java Programming", 1);
	        
	        // Creating association between Student and Course
	        StudentCourseAssociation association1 = new StudentCourseAssociation(student1, course1);
	        
	        // Accessing information through association
	        System.out.println("Student " + association1.getStudent().getName() + " is enrolled in course: " + association1.getCourse().getTitle());
	}

}
