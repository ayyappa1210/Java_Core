package com.demo.java.arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch_arr = new char[] { 'a', 'y', 'y', 'a', 'p', 'p', 'a' };

		// we must specify suffix as f or F for float otherwise it will be double by
		// default
		float[] fl_arr = { 11.1f, 12.1f, 13.4f, 14.5f };

		int[] in_arr = { 1, 2, 3, 4, 5 };

		// printing array elements

		// printing characters
		for (int i = 0; i < ch_arr.length; i++) {
			System.out.print(ch_arr[i] + " ");
		}

		System.out.println();
		// printing floats
		for (float f : fl_arr) {
			System.out.print(f + " ");
		}

		System.out.println();
		// printing integers
		for (int i : in_arr) {
			System.out.print(i + " ");
		}

	}
}
