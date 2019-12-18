package com.class33;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// create linked list of String objects
		
		LinkedList<String> lList=new LinkedList<>();
		lList.add("Hello");
		lList.add("Bye");
		
		System.out.println(lList.size());
		lList.add("Hello1");
		lList.add("Bye1");
		
		//retrieve
		System.out.println(lList.get(1));
		
		//update/replace
		lList.set(2, "Hi");
		System.out.println(lList);
		
		// how to retrieve all values from linked list
		
		
		
		
	}

}
