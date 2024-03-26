package com.java.varargs;

public class Example {

	 public static void printInfo(String info, int... numbers) {
	        System.out.println("Information: " + info);
	        System.out.println("Number of arguments: " + numbers.length);
	        System.out.print("Arguments: ");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Calling the method with different number of arguments
        printInfo("This is varargs example", 1, 2, 3);
        printInfo("Another varargs example", 4, 5, 6, 7, 8);
        printInfo("No arguments provided");
	}

}
