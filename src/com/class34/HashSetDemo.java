package com.class34;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		// let's create a collection of veggies where I do not want to have duplicates
		// inside our hashset the order of our elements is not preserved
		HashSet<String> set = new HashSet<>();
		// storing values into hashset
		set.add("Cucumber");
		set.add("Zuccini");
		set.add("Onion");
		set.add("Carrots");
		set.add("Zuccini");
		set.add("Radish");

		System.out.println(set.size());
		System.out.println(set);

		// they do not have any methods to retrieve elements from the collection
		// .get(); or .set();

		// How can we retrieve ALL elements
		// we can use Iterator
		System.out.println("-----ENHANCED LOOP------");
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String element = it.next();
			System.out.println(element);
		}
System.out.println("-----ENHANCED LOOP------");
		// enhance for loop
		for (String el : set) {
			System.out.println(el);
		}

	}
}
