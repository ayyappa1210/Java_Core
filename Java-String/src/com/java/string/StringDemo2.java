package com.java.string;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Ayyappa";
		String s2 = "teja";
		String s3 = "Ayyappa";

		// equals() method of String class has its own implementation, Used for content
		// comparison.
		// equals() method of Object class Used for reference comparison.
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s1));
		System.out.println("------------------");
		String t1 = new String("Ayyappa");
		String t2 = new String("Teja");
		String t3 = new String("Ayyappa");
		System.out.println(t1.equals(t2));
		System.out.println(t2.equals(t3));
		System.out.println(t3.equals(t1));
		System.out.println("-----------------");
		// it takes ASCII value of character for comparison
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s2.compareTo(s3));
		System.out.println(s3.compareTo(s1));
		System.out.println("-------------------");
		// string concatenation
		String x1 = "Hello" + "Ayyappa";
		System.out.println(x1);
		System.out.println(x1.length());
	}

}
