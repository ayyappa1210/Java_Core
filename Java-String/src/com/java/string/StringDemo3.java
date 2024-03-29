package com.java.string;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "My name is ayyappa";
		String s2 = "MY NAME IS AYYAPPA";

		// Returns a character based a specific index
		System.out.println(s1.charAt(9));

		System.out.println("----------------");
		// printing character by character
		for (int i = 0; i < s1.length(); i++) {
			System.out.print(s1.charAt(i));
		}
		System.out.println("\n-------------------");
		// Returns index of a specified character
		System.out.println(s1.indexOf('a'));
		System.out.println("----------------");
		// length of the string
		System.out.println(s1.length());
		System.out.println("----------------");
		// to upper case
		System.out.println(s1.toUpperCase());
		System.out.println("----------------");
		// to lower case
		System.out.println(s2.toLowerCase());
		
		System.out.println("----------------");
		
		//to check if string is starts with specified string
		System.out.println(s1.startsWith("My"));
		System.out.println(s1.startsWith("my"));
		System.out.println("----------------");
		
		//to check if string ends with specified string
		System.out.println(s1.endsWith("ayyappa"));
		System.out.println(s1.endsWith("Ayyappa"));
		
		System.out.println("----------------");
		String s3="    my name is teja    ";
		System.out.println(s3.trim());
		System.out.println(s3.trim().substring(3));
		System.out.println(s3.trim().substring(4, 9).toUpperCase().length());
		System.out.println("------------------------");
		
		String s4="";
		System.out.println(s4);
		System.out.println(s4.length());
		System.out.println(s4.isEmpty());
		System.out.println(s3);
		System.out.println(s3.isEmpty());
		System.out.println("-----------------");
		
		byte[] byte_arr=s1.getBytes();
		for(int i=0;i<byte_arr.length;i++) {
			System.out.print(byte_arr[i]+" ");
		}
		
		System.out.println("-----------------------");
		char[] char_arr=s2.toCharArray();
		for(int i=0;i<char_arr.length;i++) {
			System.out.print(char_arr[i]+"|");
		}
		System.out.println();
		System.out.println("--------------------");
		String s5="HELLO";
		String s6="hello";
		String s7="hi";
		System.out.println(s5.equalsIgnoreCase(s6));
		System.out.println(s6.equalsIgnoreCase(s7));
		
		System.out.println("--------------------------");
		System.out.println(s1.contains("name"));
		System.out.println(s1.contains("teja"));
		
		System.out.println("---------------------");
		System.out.println(s1.replace("ayyappa", "teja"));
		System.out.println(s1.replace('a', 't'));
		System.out.println("-------------------");
		int value1=20;
		int value2=30;
		System.out.println(value1+value2);
		//valueOf convert different type of values into string
		System.out.println(String.valueOf(value1)+value2);
		System.out.println("----------------------");
		System.out.println(	s1.concat(s2));

	
	}

}
