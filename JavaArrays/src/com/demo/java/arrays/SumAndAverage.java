package com.demo.java.arrays;

public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 ,6};
		int sum = 0;
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of array elements:" + sum);
		float avg = sum / length;
		System.out.println("Average of given array:" + avg);
		float average = (float) sum / length;
		System.out.println(average);
	}

}
