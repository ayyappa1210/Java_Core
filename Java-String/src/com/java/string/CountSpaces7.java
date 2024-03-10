package com.java.string;

public class CountSpaces7 {
	public static void main(String[] args) {
		String name = "my name is  ayyappa";
		char[] char_arr = name.toCharArray();
		int count = 0;
		for (int i = 0; i < char_arr.length; i++) {
			if (char_arr[i] == ' ') {
				count = count + 1;
			}
		}
		System.out.println(count);
	}
}
