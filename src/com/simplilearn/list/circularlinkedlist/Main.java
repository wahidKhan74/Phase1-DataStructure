package com.simplilearn.list.circularlinkedlist;


public class Main {

	public static void main(String[] args) {
		
		Employee johnSmith = new Employee(100, "John Smith", "Dev", 29876.234);
		Employee marrySmith = new Employee(100, "Marry Smith", "Dev", 19876.234);
		Employee willClark = new Employee(100, "Will Clark", "Dev", 29876.234);
		Employee davidDoe = new Employee(100, "David Doe", "Dev", 29876.234);
		
		EmployeeCircularLinkedList list = new EmployeeCircularLinkedList();
		
		System.out.println("List Size : "+list.getSize());
		System.out.println("List Empty Status : "+list.isEmpty());
		
		list.addNode(johnSmith);
		list.addNode(marrySmith);
		list.addNode(willClark);
		list.addNode(davidDoe);

		System.out.println("List Size : "+list.getSize());
		System.out.println("List Empty Status : "+list.isEmpty());
		
		list.printList();
		
		
	}

}
