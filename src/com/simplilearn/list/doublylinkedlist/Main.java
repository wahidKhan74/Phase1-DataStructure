package com.simplilearn.list.doublylinkedlist;


public class Main {

	public static void main(String[] args) {
		
		Employee johnSmith = new Employee(100, "John Smith", "Dev", 29876.234);
		Employee marrySmith = new Employee(100, "Marry Smith", "Dev", 19876.234);
		Employee willClark = new Employee(100, "Will Clark", "Dev", 29876.234);
		Employee davidDoe = new Employee(100, "David Doe", "Dev", 29876.234);
		
		EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
		
		System.out.println("List Size : "+list.getSize());
		System.out.println("List Empty Status : "+list.isEmpty());
		
		list.addToFront(johnSmith);
		list.addToFront(marrySmith);
		list.addToFront(willClark);
		list.addToEnd(davidDoe);
		
		
		System.out.println("List Size : "+list.getSize());
		System.out.println("List Empty Status : "+list.isEmpty());
		list.printList();
		
		System.out.println();
		System.out.println("---------------------");
		System.out.println();
		
		
		list.removeFromFront();
		list.printList();
		System.out.println("List Size : "+list.getSize());
		
		System.out.println();
		System.out.println("---------------------");
		System.out.println();
		
		list.removeFromEnd();
		list.printList();
		System.out.println("List Size : "+list.getSize());
		
	}

}
