package com.java.stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a Stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display the stack
        System.out.println("Stack: " + stack);

        // Pop an element from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after pop: " + stack);

        // Peek at the top element of the stack
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.empty());

        // Search for an element in the stack
        int position = stack.search(20);
        System.out.println("Position of '20': " + position);

        // Push another element onto the stack
        stack.push(40);
        System.out.println("Stack after push: " + stack);

        // Clear the stack
        stack.clear();
        System.out.println("Stack after clearing: " + stack);
	}

}
