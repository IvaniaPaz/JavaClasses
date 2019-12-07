package com.class05;

public class LogicalNot {

	public static void main(String[] args) {

		boolean b1 = !true;
		boolean b2 = !false;

		System.out.println(b1);
		System.out.println(b2);

		boolean traffic = !true;
// using reverting condition	
		if (traffic) {
			System.out.println("Hello");
		} else {
			System.out.println("bye");
		}

		boolean isRain = false;
		if (!isRain) {
			System.out.println("Take umbrella");
		} else {
			System.out.println("Do not take umbrella");
		}

// Let's compare numbers using NOT operator

		int num1 = 10;
		int num2 = 10;

		if (num1 == num2) {
			System.out.println("Numbers are equal");
		} else {
			System.out.println("numbers are not equal");
		}

		if (!(num1 == num2)) {
			System.out.println("Numbers are not equal");
		} else {
			System.out.println("Numbers are equal");
		}
		
		String name="Mary";
		String name2="Anna";
		
		if (!name.equals("Mary") || name.equals("Anna")) {
		System.out.println("You are not my sister");
		}else {
		System.out.println("You are my sister");
		}
	}
}
