package com.class32;

import java.util.ArrayList;
import java.util.Iterator;



public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList<String> names= new ArrayList<String>();
		names.add("Ivania");
		names.add("Diana");
		names.add("Ana");
		names.add("Paola");
		names.add("Terri");

		System.out.println("-------------------");
		//retrieve values from ArrayList
		//1 - for loop
		
		for(int i=0; i<names.size();i++) {
			System.out.println(names.get(i));
		}
		// 2nd way - enhanced loop
		for(String n:names) {
			System.out.println(n);
		}
	System.out.println("-------------------");	
		// 3rd way -iterator
		Iterator <String>it=names.iterator();
		
		
	}

}
