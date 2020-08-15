package com.simplilearn.list;

import java.util.ArrayList;
import java.util.List;

public class ListEmployeeDemo {

	public static void main(String[] args) {
		
		Employee johnSmith = new Employee(100, "John Smith", "Dev", 29876.234);
		Employee marrySmith = new Employee(100, "Marry Smith", "Dev", 19876.234);
		Employee willClark = new Employee(100, "Will Clark", "Dev", 29876.234);
		Employee davidDoe = new Employee(100, "David Doe", "Dev", 29876.234);
		
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(johnSmith);
		employeeList.add(marrySmith);
		employeeList.add(willClark);
		employeeList.add(davidDoe);
		
		for(int index=0;index<employeeList.size();index++) {
			System.out.println("Element at index :"+index +" "+employeeList.get(index));
		}

	}

}
