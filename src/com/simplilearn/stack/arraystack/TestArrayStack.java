package com.simplilearn.stack.arraystack;


public class TestArrayStack {

	public static void main(String[] args) {
		
		Employee johnSmith = new Employee(100, "John Smith", "Dev", 29876.234);
		Employee marrySmith = new Employee(100, "Marry Smith", "Dev", 19876.234);
		Employee willClark = new Employee(100, "Will Clark", "Dev", 29876.234);
		Employee davidDoe = new Employee(100, "David Doe", "Dev", 29876.234);
		
		ArrayStack stack = new ArrayStack(2);
		
		System.out.println("Stack Size : "+ stack.size());
		System.out.println("Stack Capacity : "+ stack.capacity());
		
		stack.push(johnSmith);
		stack.push(marrySmith);
		stack.push(willClark);
		
		System.out.println("--------------------");
		stack.printStack();
		System.out.println("Stack Size : "+ stack.size());
		System.out.println("Stack Capacity : "+ stack.capacity());
		
		System.out.println("--------------------");
		System.out.println("Stack Top :->  "+ stack.peek());
		
		System.out.println("--------------------");
		stack.pop();
		System.out.println("Stack Top :->  "+ stack.peek());
		
		
		
		

	}

}
