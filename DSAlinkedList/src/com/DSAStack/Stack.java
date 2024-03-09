package com.DSAStack;

public class Stack {
	
	int stack []= new int[5];
	int top =0;
	
	// adding stack
	public void push (int data) {
		if(top==4) {
			System.out.println("Stack is full");
		} else {
		stack[top] = data;
		top++;		
			}	
	}
	
	// deleting stack
	public int pop( ) {
		
		int data =0;
		if(isEmpty()) {
			System.out.println("stack is empty");
		} else {
			top--;
			data = stack[top];
			stack[top] = 0;	
		}	
		return data;
	}
	// peek
	public int peek( ) {
		int data;
		top--;
		data = stack[top-1];
		return data;
			
	}
	
	// checking size
	public int size() {
		return top;
	}
	
	// checking isEmpty
	
	public boolean isEmpty() {
		return top<=0;
	}
	
	
	public void show() {
		for(int n : stack) {
			System.out.println(n);
		}
	}

	

}
