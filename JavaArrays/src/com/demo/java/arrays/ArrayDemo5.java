package com.demo.java.arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in_arr = { 1, 5, 6, 3, 10, 8 };

		List<Integer> list = Arrays.asList(11, 13, 29, 15, 17);
		list.forEach(System.out::println);
		System.out.println("--------------------");

		Arrays.sort(in_arr);
		for (int i : in_arr) {
			System.out.println(i);
		}
		System.out.println("--------------------");
		int[] arr = Arrays.copyOf(in_arr, 4);
		for (int j : arr)
			System.out.println(j);

	}

}
