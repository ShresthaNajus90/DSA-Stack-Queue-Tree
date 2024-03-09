package com.DSAStack;

public class Main {

	public static void main(String[] args) {
		
		DynamicStack stack = new DynamicStack();
		stack.push(13);
		stack.push(12);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(7);
		stack.push(8);
		

		// peek
		System.out.println("Peeking the stack" + stack.peek());
		
		//pop delete
		//System.out.println("deleting item from stack" + stack.pop());
		System.out.println("Size of stack is : " + stack.size());
		System.out.println("Stack is "+ stack.isEmpty());
		
		 stack.show();
	}

}
