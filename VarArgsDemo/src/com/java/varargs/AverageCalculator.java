package com.java.varargs;

public class AverageCalculator {

	 public static double calculateAverage(double... numbers) {
	        double sum = 0;
	        for (double num : numbers) {
	            sum += num;
	        }
	        return numbers.length == 0 ? 0 : sum / numbers.length;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Average: " + calculateAverage(4.5, 3.2, 6.7));
        System.out.println("Average: " + calculateAverage(10, 20, 30, 40, 50));
        System.out.println("Average: " + calculateAverage());
	}

}
