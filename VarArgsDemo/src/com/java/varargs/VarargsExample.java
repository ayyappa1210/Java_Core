package com.java.varargs;

public class VarargsExample {

	 // Method with varargs
    public static void printNumbers(int... numbers) {
        System.out.println("Number of arguments: " + numbers.length);
        System.out.print("Arguments: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 printNumbers(1, 2, 3);
	        printNumbers(4, 5, 6, 7, 8);
	        printNumbers(); // Calling with no arguments
	}

}
