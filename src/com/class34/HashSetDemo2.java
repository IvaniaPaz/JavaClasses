package com.class34;

import java.util.*;

public class HashSetDemo2 {

	public static void main(String[] args) {
		/*
		 * Create a collection that will store Sweets type of Object and I do not care
		 * about the order as long as I do not have duplicate objects
		 */
		Set<Sweets> sweetSet = new HashSet<>();

		Sweets sweet = new Sweets("Cake");
		sweetSet.add(sweet);
		sweetSet.add(new Sweets("Cookies"));
		sweetSet.add(new Sweets("Icecream"));
		sweetSet.add(new Sweets("Baklava"));
		sweetSet.add(new Sweets("White chocolate pudding"));
		sweetSet.add(new Sweets("Chocolate"));
		sweetSet.add(sweet);

		System.out.println(sweetSet.size()); // 6

		// how do we print name of each sweets

		System.out.println("----ENHANCED FOR LOOP-----");
		for (Sweets sweets : sweetSet) {
			System.out.println(sweets.name);
		}

		System.out.println("----ITERATOR-----");
		Iterator<Sweets> iterator = sweetSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().name);

		}

	}
}
