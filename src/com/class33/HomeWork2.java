package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork2 {

	public static void main(String[] args) {
		/*
		 * Create an ArrayList of words remove every word that ends with "e" Use
		 * iterator
		 */

		ArrayList<String> elist = new ArrayList<>();
		elist.add("Cute");
		elist.add("Love");
		elist.add("Hello");
		elist.add("Java");

		Iterator<String> it = elist.iterator(); // you create object of iterator and then reference 
		while (it.hasNext()) {
			if (it.next().endsWith("e")) {
				it.remove();
			}
		}
		System.out.println(elist);

	}

}
