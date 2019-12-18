package com.class34;

import java.util.*;

public class IteratorUsage {

	public static void main(String[] args) {

		List<String> stringList = new ArrayList<>();
		stringList.add("Esra");
		stringList.add("Hasan");
		stringList.add("Ak");
		stringList.add("Salim");
		stringList.add("Ak");
		stringList.add("Salim");
		stringList.add("John");

		// remove names that are shorter than 4 characters

		stringList.remove("Hasan");
		System.out.println(stringList);

		// removing element using for loop
		for (int i = 0; i < stringList.size(); i++) {
			if (stringList.get(i).length() <= 4) {
				stringList.remove(i);
			}
		}
		System.out.println(stringList);

		// best way to remove an element from a collection ---Iterator
		List<String> stringList1 = new ArrayList<>();
		stringList1.add("Esra");
		stringList1.add("Hasan");
		stringList1.add("Ak");
		stringList1.add("Salim");
		stringList1.add("Ak");
		stringList1.add("Salim");
		stringList1.add("John");

		Iterator<String> it = stringList1.iterator();
		while (it.hasNext()) {
			if (it.next().length() <= 4) {
				it.remove();
			}
		}
		System.out.println(stringList1);
	}
}