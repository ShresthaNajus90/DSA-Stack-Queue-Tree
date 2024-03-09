package com.DSAStack;

public class DynamicStack {
		
	   int capacity =2;
		int stack []= new int[capacity];
		int top =0;
		
		// adding stack
		public void push (int data) {
			if(size()==capacity)
			expand();
			stack[top] = data;
			top++;		
				}	

		
		private void expand() {
			int length = size();
			int newStack[] = new int[capacity*2];
			System.arraycopy(stack, 0, newStack, 0, length);
			stack = newStack;
			capacity *=2;
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
				shrink();
			}	
			return data;
		}
		
		// removing  deleted item to garbage collection
		private void shrink() {
			int length = size();
			if(length<=(capacity/2)/2) {
				capacity = capacity/2;
				int newStack[] = new int [capacity];
				System.arraycopy(stack, 0, newStack, 0, length);
				stack = newStack;
				
			}
			
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
