package com.class33;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		boolean ans = list.isEmpty();
		if (ans == true)
			System.out.println(ans);
		else
			System.out.println(ans);

		// addition of a element to the ArrayList
		list.add("Syntax");

		// check if the list is empty or not
		ans = list.isEmpty();
		if (ans == true)
			System.out.println(ans);
		else
			System.out.println(ans);
	}
}
