package com.java.string;

public class ReverseString4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Teja Ayyappa";
		char[] name_arr = name.toCharArray();
		String reversed_String = "";
		for (int i = name_arr.length - 1; i >= 0; i--) {
			reversed_String = reversed_String + name.charAt(i);
		}
		System.out.println("Reversed String:" + reversed_String);
		System.out.println("--------------------------");
		StringBuffer buffer = new StringBuffer();
		buffer.append("my name is ayyappa");
		System.out.println(buffer.reverse());
	}

}
