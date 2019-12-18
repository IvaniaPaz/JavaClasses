package com.class34;

import java.util.*;

public class SetFamilyMember {

	public static void main(String[] args) {
		Set<String> fruitSet = new LinkedHashSet<>();
		fruitSet.add("Watermelon");
		fruitSet.add("Pomegranete");
		fruitSet.add("Banana");
		fruitSet.add("Jackfruit");
		fruitSet.add("Watermelon");
		fruitSet.add("Raspberry");

		System.out.println(fruitSet.size());
		System.out.println(fruitSet);

		// create a collection that won't allow duplicates and sort objects in ascending
		// order (0-9) (A-Z)
		Set<Integer> tset = new TreeSet<>();
		tset.add(200);
		tset.add(2000);
		tset.add(20);
		tset.add(999);
		tset.add(0);
		tset.add(999);
		tset.add(0);

		System.out.println(tset.size());
		System.out.println(tset);

		// Adding Collection into a collection

		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Selenim");
		list.add("TestNG");

		Set<String> linkedSet = new HashSet<>();
		linkedSet.addAll(fruitSet);
		linkedSet.addAll(list);

		System.out.println("----- Objects from both collections");
		System.out.println(linkedSet);

	}
}
