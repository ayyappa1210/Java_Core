package com.java.string;

public class NumberOfCharacters5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Teja Ayyappa";
		System.out.println(name.length());
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != ' ') {//excluding spaces
				count = count + 1;
			}
		}
		System.out.println(count);
	}

}
