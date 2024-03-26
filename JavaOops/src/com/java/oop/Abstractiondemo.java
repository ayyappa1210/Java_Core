package com.java.oop;

abstract class Shape {
	
	abstract double calculateArea();
	
	void display() {
		System.out.println("This is a shape");
	}
}
class Circle extends Shape {
	double radius;
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}


	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}
	
}
class Rectangle extends Shape {
	double length;
	double width;
	
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}


	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return length*width;
	}
	
}
public class Abstractiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape circle = new Circle(10);
		Shape rectangle = new Rectangle(7, 8);
		
		circle.display();
		System.out.println("Area of circle:"+circle.calculateArea());
		
		rectangle.display();
		System.out.println("Area of Rectangle:"+rectangle.calculateArea());

	}

}
