package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
	public static void main(String[] args) {
		//1st way
		Pattern pattern = Pattern.compile(".s");// (dot)represents a single character
		Matcher matcher=pattern.matcher("as");
		boolean b1=matcher.matches();
		System.out.println(b1);
		
		//2nd way
		boolean b2=Pattern.compile(".a").matcher("ba").matches();
		System.out.println(b2);
		
		//3rd way
		boolean b3=Pattern.matches(".s","bs");
		System.out.println(b3);
		
		System.out.println(Pattern.matches(".b","ba"));
		System.out.println(Pattern.matches("..d", "abd"));
		System.out.println(Pattern.matches(".s", "asd")); //character sequence greater than 2 so false
		
		
	}
	
	
}
