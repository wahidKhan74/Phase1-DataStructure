package com.simplilearn.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListOfEmployee {

	public static void main(String[] args) {
		
		Employee johnSmith = new Employee(100, "John Smith", "Dev", 29876.234);
		Employee marrySmith = new Employee(100, "Marry Smith", "Dev", 19876.234);
		Employee willClark = new Employee(100, "Will Clark", "Dev", 29876.234);
		Employee davidDoe = new Employee(100, "David Doe", "Dev", 29876.234);
		
		LinkedList<Employee> employeeList = new LinkedList<Employee>();
		employeeList.addFirst(johnSmith);
		employeeList.addFirst(marrySmith);
		employeeList.addFirst(willClark);
		employeeList.addLast(davidDoe);
		
		
		Iterator iter = employeeList.iterator();
		System.out.print("HEAD -> ");
		while(iter.hasNext()) {
			System.out.print(iter.next());
			System.out.print("<=>");
		}
		
		System.out.println("====================");
		
		employeeList.removeFirst();
		iter = employeeList.iterator();
		System.out.print("HEAD -> ");
		while(iter.hasNext()) {
			System.out.print(iter.next());
			System.out.print("<=>");
		}
		
		System.out.println("====================");
		
		employeeList.removeLast();
		iter = employeeList.iterator();
		System.out.print("HEAD -> ");
		while(iter.hasNext()) {
			System.out.print(iter.next());
			System.out.print("<=>");
		}
	}

}
