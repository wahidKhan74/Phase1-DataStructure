package com.simplilearn.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
	
		List<Integer> numbersList = new ArrayList<Integer>();
		numbersList.add(10);
		numbersList.add(3);
		numbersList.add(6);
		numbersList.add(7);
		numbersList.add(33);

//		for(Integer value: numbersList) {
//			System.out.println(value);
//		}
		
		for(int index=0;index<numbersList.size();index++) {
			System.out.println("Element at index :"+index +" "+numbersList.get(index));
		}
	}

}
