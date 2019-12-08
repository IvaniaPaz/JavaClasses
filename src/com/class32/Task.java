package com.class32;

import java.util.ArrayList;

public class Task {

	public static void main(String[] args) {
		
		//Generic ArrayList
		ArrayList<String> names= new ArrayList<String>();
		names.add("Ivania");
		names.add("Diana");
		names.add("Ana");
		names.add("Paola");
		names.add("Terri");
//		names.add(10) not possible because we are using string
		
		System.out.println(names.isEmpty());
		
		System.out.println(names.contains("Diana"));
		
		int size=names.size();
		System.out.println(size);
		
		for(String n: names) {
			System.out.println(n);
		}
		
		for (int b = 0; b < names.size(); b++) {
			System.out.println(names.get(b));
		}
		
		
//		ArrayList can be generic or Non-generic
		//Non-generic --> adds all types 
		//to store different type of objects
		
		ArrayList<Object> alist= new ArrayList<>();
		alist.add("Hello");
		alist.add(100);
		alist.add(10.10);
		alist.add('e');
		alist.add(true);
		System.out.println(alist);
		
		ArrayList<Double> list= new ArrayList<Double>();
		list.add(100.10);
	}

}
