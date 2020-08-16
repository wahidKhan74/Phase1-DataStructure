package com.simplilearn.queue.arrayqueue;


public class TestArrayQueue {

	public static void main(String[] args) {
		
		Employee johnSmith = new Employee(100, "John Smith", "Dev", 29876.234);
		Employee marrySmith = new Employee(100, "Marry Smith", "Dev", 19876.234);
		Employee willClark = new Employee(100, "Will Clark", "Dev", 29876.234);
		Employee davidDoe = new Employee(100, "David Doe", "Dev", 29876.234);
		
		// create a array queue
		ArrayQueue queue = new ArrayQueue(4);
		System.out.println("The Queue size : "+ queue.size());
		queue.add(johnSmith);
		queue.add(marrySmith);
		queue.add(willClark);
		queue.add(davidDoe);
		queue.add( new Employee(10011, "Some", "Dev", 121212313.23));
		
		queue.printQueue();
		
		System.out.println("-----------------");
		System.out.println("front -> "+ queue.peek());
		
		queue.remove();
		
		System.out.println("-----------------");
		System.out.println("front -> "+ queue.peek());
	}

}
