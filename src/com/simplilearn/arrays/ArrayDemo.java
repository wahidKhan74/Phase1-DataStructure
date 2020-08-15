package com.simplilearn.arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int numbers[] = new int[5];
		
		numbers[0] = 3;
		numbers[1] = 5;
		numbers[2] = 7;
		numbers[3] = 9;
		numbers[4] = 33;
		
		// one 
		// O(1) constant time complexity
		System.out.println("data "+numbers[2]);	
		
		// read operation
		// 5(5)   // O(n)  -> linear time complexity
		for(int index = 0; index< numbers.length;index++) {
			System.out.println("Element at index "+index +" => "+numbers[index]);
		}
		
		

	}

}
