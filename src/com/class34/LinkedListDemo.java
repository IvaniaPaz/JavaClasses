package com.class34;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> llist = new LinkedList<>();
		llist.add("Hello");// 0
		llist.add("Bye");// 1
		llist.add("Hello");// 2
		llist.add("Bye");// 3
		llist.add(2, "How are you?"); // indicating element and replacing it with a new String. instead of hello it is
										// how are you?
		System.out.println(llist);

		// replace 1 element
		llist.set(1, "Good bye");
		System.out.println(llist);

		// retrieve 1 element

		String element = llist.get(2);
		System.out.println(element);

		// retrieve ALL elements

		System.out.println("----FOR LOOP RETRIEVE ALL ELEMENT----");

		for (int i = 0; i < llist.size(); i++) {
			System.out.println(llist.get(i));
		}

		System.out.println("----ENHANCED LOOP RETRIEVE ALL ELEMENT----");

		for (String el : llist) {
			System.out.println(el);
		}

		System.out.println("----ITERATOR RETRIEVE ALL ELEMENT----");
		Iterator<String> it = llist.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
