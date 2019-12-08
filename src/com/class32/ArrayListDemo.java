package com.class32;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
		/*
		 * To store values inside your collection
		 */
		arrayList.add("John");
		arrayList.add("Jane");
		arrayList.add("Jack");

		/*
		 * To retrieve value from arrayList
		 */
		System.out.println(arrayList.get(1));

		// add more values
		arrayList.add("James");
		arrayList.add("John");
		arrayList.add("Jane");

		// How many elements inside the arrayList?
		int size = arrayList.size();
		System.out.println(size);

		System.out.println("===================");

		// creating an Object of ArrayList that will hold numeric values
		ArrayList<Integer> numArrayList = new ArrayList<>(); // cannot store primitive, only object INCORRECT <int> CORRECT <Integer>
		numArrayList.add(100);
		numArrayList.add(200);
		numArrayList.add(300);
		
		//update the value 
		numArrayList.set(0, 1000); //instead of 100 it'll be set as 1,000
		System.out.println(numArrayList);

		numArrayList.set(2, 12);
		System.out.println(numArrayList);
		
		//retrieving values
		System.out.println(numArrayList.get(2)); // index of 300^

		System.out.println("===================");

		// using for loop
		// int num is called control variable or counter --->control number of iterations for the loop.
		for (int num = 0; num < numArrayList.size(); num++) {
			//this for loop is going to display value one by one
			System.out.println(numArrayList.get(num));
			
		}

		System.out.println("===================");

		// using enhanced loop
		for (Integer number : numArrayList) {
			System.out.println(number);
		}
		
//		ArrayList can be generic or Non-generic	
		
		

	}

}
