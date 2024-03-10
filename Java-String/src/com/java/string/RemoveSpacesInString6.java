package com.java.string;

public class RemoveSpacesInString6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1st
		String s = "My name is   ayyappa";
		String removed_Spaces = s.replaceAll("\\s+", "");
		System.out.println(removed_Spaces);
		// 2nd
		String[] trimmedString = s.split(" ");
		String remove_spces_string = "";
		for (int i = 0; i < trimmedString.length; i++) {
			remove_spces_string = remove_spces_string + trimmedString[i];
		}
		System.out.println(remove_spces_string);
	}

}
