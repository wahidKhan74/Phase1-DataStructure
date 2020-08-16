package com.simplilearn.queue.arrayqueue;


public class ArrayQueue {

	private Employee[] queue;

	private int front;
	private int rear;

	public ArrayQueue(int capacity) {
		queue = new Employee[capacity];
	}

	// add
	public void add(Employee employee) {
		// queue is full
		if (rear == queue.length) {
			Employee[] newArray = new Employee[2 * queue.length];
			System.arraycopy(queue, 0, newArray, 0, queue.length);
			queue = newArray;
		}
		// add values in stack array
		queue[rear++] = employee;
	}

	// remove
	public Employee remove() {
		if(size() == 0) {
			System.out.println("List is empty");
			rear = 0;
			front = 0;
			return null;
		}
		
		Employee employee = queue[front];
		queue[front] = null;
		front ++;
		return employee;
	}
	
	// size
	public int size() {
		return rear - front;
	}
	
	// peek
	public Employee peek() {
		if(size() == 0) {
			System.out.println("List is empty");
			rear = 0;
			front = 0;
			return null;
		}
		return queue[front];
	}
	
	// printQueue
	public void printQueue() {
		System.out.println(" front  ->");
		for(int i= front; i<rear; i++) {
			System.out.println(queue[i]);
		}
		System.out.println(" <- rear");
	}
}
