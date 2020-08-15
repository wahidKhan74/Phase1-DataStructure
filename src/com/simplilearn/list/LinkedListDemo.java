package com.simplilearn.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<Integer> numbersList = new LinkedList<Integer>();
		
		numbersList.add(10);
		numbersList.add(3);
		numbersList.add(6);
		numbersList.add(7);
		numbersList.add(33);
		
		for(int index=0;index<numbersList.size();index++) {
			System.out.println("Element at index :"+index +" "+numbersList.get(index));
		}

	}

}
