package com.java.string;

import java.util.Arrays;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Example string
        String str = "Hello, World!";
        String str2 = "hello, world!";

        // length() method
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // charAt() method
        char charAtIndex = str.charAt(4);
        System.out.println("Character at index 4: " + charAtIndex);

        // substring() method
        String subString = str.substring(7);
        System.out.println("Substring from index 7: " + subString);

        // indexOf() method
        int index = str.indexOf('W');
        System.out.println("Index of 'W': " + index);

        // lastIndexOf() method
        int lastIndex = str.lastIndexOf('o');
        System.out.println("Last index of 'o': " + lastIndex);

        // equals() method
        String otherString = "Hello, World!";
        boolean isEqual = str.equals(otherString);
        System.out.println("Are the strings equal? " + isEqual);

        // contains() method
        boolean contains = str.contains("World");
        System.out.println("Does the string contain 'World'? " + contains);

        // startsWith() method
        boolean startsWith = str.startsWith("Hello");
        System.out.println("Does the string start with 'Hello'? " + startsWith);

        // endsWith() method
        boolean endsWith = str.endsWith("!");
        System.out.println("Does the string end with '!'? " + endsWith);

        // toUpperCase() method
        String upperCase = str.toUpperCase();
        System.out.println("Uppercase string: " + upperCase);

        // toLowerCase() method
        String lowerCase = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerCase);

        // trim() method
        String stringWithWhitespace = "  Hello, World!  ";
        String trimmedString = stringWithWhitespace.trim();
        System.out.println("Trimmed string: '" + trimmedString + "'");

        // replace() method
        String replacedString = str.replace('o', '0');
        System.out.println("Replaced 'o' with '0': " + replacedString);

        // split() method
        String[] splitString = str.split(", ");
        System.out.println("Split string: " + Arrays.toString(splitString));

        // join() method (introduced in Java 8)
        String joinedString = String.join(" - ", "Java", "is", "awesome");
        System.out.println("Joined string: " + joinedString);

        // matches() method
        boolean matches = str.matches(".*World.*");
        System.out.println("Does the string match pattern '.*World.*'? " + matches);

        // isEmpty() method
        boolean isEmpty = str.isEmpty();
        System.out.println("Is the string empty? " + isEmpty);

        // concat() method
        String concatenatedString = str.concat(" Have a nice day!");
        System.out.println("Concatenated string: " + concatenatedString);

        // valueOf() method
        int intValue = 42;
        String stringValue = String.valueOf(intValue);
        System.out.println("String value of integer 42: " + stringValue);

        // compareTo() method
        int compareResult = str.compareTo(str2);
        System.out.println("Comparison result of str and str2: " + compareResult);

        // compareToIgnoreCase() method
        int compareResultIgnoreCase = str.compareToIgnoreCase(str2);
        System.out.println("Comparison result ignoring case of str and str2: " + compareResultIgnoreCase);

        // format() method
        String formattedString = String.format("The value of PI is %.2f", Math.PI);
        System.out.println("Formatted string: " + formattedString);
	
	}

}
