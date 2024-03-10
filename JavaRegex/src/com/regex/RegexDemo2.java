package com.regex;

import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Regex character classes
		System.out.println(Pattern.matches("[abc]","a"));
		System.out.println(Pattern.matches("[abc]","b"));
		System.out.println(Pattern.matches("[abc]","c"));
		System.out.println(Pattern.matches("[ABC]","A"));
		System.out.println(Pattern.matches("[ABC]","B"));
		System.out.println(Pattern.matches("[ABC]","C"));
		
		System.out.println(Pattern.matches("[abc]","d"));
		System.out.println(Pattern.matches("[abc]", "da")); //length>2
		System.out.println("------------------------------");
		System.out.println(Pattern.matches("[^abc]","a"));
		System.out.println(Pattern.matches("[^abc]","b"));
		System.out.println(Pattern.matches("[^abc]","c"));
		System.out.println(Pattern.matches("[^abc]","z"));
		System.out.println(Pattern.matches("[^abc]","d"));
		System.out.println(Pattern.matches("[^abc]","cff"));
		
	}

}
