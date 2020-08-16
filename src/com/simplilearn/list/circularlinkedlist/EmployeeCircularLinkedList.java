package com.simplilearn.list.circularlinkedlist;

public class EmployeeCircularLinkedList {
	
	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;
	
	public void addNode(Employee employee) {
		//  create a node
		EmployeeNode newNode = new EmployeeNode(employee);
		
		// if list is empty
		if(head == null) {			
			head = newNode;
			tail = newNode;			
			
		} else {
			tail.setNext(newNode);
		}
		tail = newNode;
		tail.setNext(head);
		size++;
	}
	
	public EmployeeNode removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		EmployeeNode removedNode = head;
		head = head.getNext();
		size--;
		removedNode.setNext(null);	
		return removedNode;
	}
	
	public int getSize() {
		return size;
	}
	
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void printList() {
		EmployeeNode current = head;
		if(current == null) {
			System.out.println("Circular Linked is empty");
		}else{
			do {
				System.out.println(" -> " + current.getEmployee());
				current = current.getNext();
			} while(current != head);
		}
		
		
	}
}
