package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeWork3 {

	public static void main(String[] args) {
		/*
		 * Create an ArrayList of drinks if any drinks has letter "a" or "e" replace it
		 * with water
		 */

		List<String> drinks = new ArrayList<>();
		drinks.add("soda");
		drinks.add("milk");
		drinks.add("juice");
		drinks.add("coffee");
		drinks.add("tea");

		drinks.set(0, "water");
		System.out.println(drinks);

		Iterator<String> it = drinks.iterator();

		for (int i = 0; i < drinks.size(); i++) {
			if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
				drinks.set(i, "water");
			}
		}
		System.out.println(drinks);
	}

}
