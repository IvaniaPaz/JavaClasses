package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeWork4 {

	public static void main(String[] args) {
		/*
		 * Create an ArrayList of even numbers from 1-50 Using Iterator remove any
		 * number that is divisible by 5 from that ArrayList
		 */
		// creating an object of ArrayList and referring to the list
		List<Integer> numbers = new ArrayList<>();

		// storing only even numbers using loop
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) { // performing verification
				numbers.add(i);
			}
		}
		System.out.println(numbers);

		Iterator<Integer> it = numbers.iterator();

		System.out.println("-----removing numbers divisible by 5----");
		// removing numbers that are divisible by 5 using Iterator
		while (it.hasNext()) {
			if (it.next() % 5 == 0) {
				it.remove();
			}
		}
		System.out.println(numbers);
	}

}
