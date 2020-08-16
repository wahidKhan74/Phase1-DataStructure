package com.simplilearn.stack.arraystack;

import java.util.EmptyStackException;

public class ArrayStack {
	
	private int top;
	private Employee[]  stack;
	
	ArrayStack(int capacity){
		stack = new Employee[capacity];
	}
	
	// push  --> add element in stack
	
	public void push(Employee employee) {
		// stack is full
		if(top == stack.length) {
			Employee[] newArray = new Employee[2 * stack.length];
			System.arraycopy(stack, 0, newArray, 0, stack.length);
			stack = newArray;
		}		
		// add values in stack array
		stack[top++] = employee;
		
	}
	
	// pop --> remove element from stack
	public Employee pop() {
		// verify stack empty.
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		// remove stack top element
		Employee employee = stack[--top];
		stack[top] = null;
		return employee;
		
	}
	
	public Employee peek() {
		//verify stack is empty
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top-1];
	}
	
	public int size() {
		return top;
	}
	
	public int capacity() {
		return stack.length;
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
	
	public void printStack() {
		System.out.println("top -> ");
		for (int i = top-1  ; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}

}
