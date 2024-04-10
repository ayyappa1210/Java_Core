package com.java.eight;

@FunctionalInterface
interface Calculator {
	int calculate(int x, int y);
}

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator addition = (x, y) -> x + y;
		Calculator subtraction = (x, y) -> x - y;
		Calculator multiplication = (x, y) -> x * y;

		System.out.println("Addition: " + addition.calculate(10, 10));
		System.out.println("Subtraction: " + subtraction.calculate(11, 5));
		System.out.println("Multiplication: " + multiplication.calculate(10, 10));

	}

}
