package com.simplilearn.stack.linkedstack;



public class TestLinkedStack {

	public static void main(String[] args) {
		
		Employee johnSmith = new Employee(100, "John Smith", "Dev", 29876.234);
		Employee marrySmith = new Employee(100, "Marry Smith", "Dev", 19876.234);
		Employee willClark = new Employee(100, "Will Clark", "Dev", 29876.234);
		Employee davidDoe = new Employee(100, "David Doe", "Dev", 29876.234);
		
		LinkedStack stack = new LinkedStack();
		System.out.println("The Stack size : "+ stack.size());
		
		stack.push(johnSmith);
		stack.push(marrySmith);
		stack.push(willClark);
		
		stack.printStack();
		
		System.out.println("--------------");
		System.out.println("top -> "+ stack.peek());
		
		stack.pop();
		
		System.out.println("--------------");
		System.out.println("top -> "+ stack.peek());
		

	}

}
