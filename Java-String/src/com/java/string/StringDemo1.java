package com.java.string;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Ayyappa";
		String s2 = "teja";
		String s3 = "Ayyappa";
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s3 == s1);
		System.out.println("----------------");
		String t1 = new String("Ayyappa");
		String t2 = new String("Teja");
		String t3 = new String("Ayyappa");
		System.out.println(t1 == t2);
		System.out.println(t2 == t3);
		System.out.println(t3 == t1);
		System.out.println("------------------");
		System.out.println(s1 == t1);
		System.out.println(s3 == t3);
		System.out.println("---------------");
		// creating string object using character array
		char[] ch_arr = { 't', 'e', 'j', 'a' };
		String t4 = new String(ch_arr);
		System.out.println(t4);
		System.out.println(t4.toString());
	}

}
