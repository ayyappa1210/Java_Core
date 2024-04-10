package com.demo.java.arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaring an array
		int[] arr;
		// instantiating an array
		arr = new int[5];
		System.out.println(arr.toString());

		// printing array elements
		// using for loop
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// initializing an array
		arr[0] = 10;
		arr[1] = 12;
		arr[2] = 13;
		arr[4] = 15;
		System.out.println();
		// printing array elements using advanced for loop
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		// length of the array
		System.out.println(arr.length);
	}

}
