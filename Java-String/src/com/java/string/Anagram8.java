package com.java.string;

import java.util.Arrays;

public class Anagram8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Brag";
		String s2 = "Grab";
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		if (s1.length() != s2.length()) {
			System.out.println("Strings are not anagram");
		} else {
			char[] arr1 = s1.toCharArray();
			char[] arr2 = s2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2) == true) {
				System.out.println("Strings are anagram");
			}else {
				System.out.println("Strings are not anagram");
			}
		}
	}

}
