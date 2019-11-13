package com.class18;

public class Task {
	/*
	 * TASK 1 Create a method that will take 2 parameters as numbers and prints
	 * which number is larger
	 */

	void twoNums(int a, int b) {
		if (a > b) {
			System.out.println(a + " is larger than " + b);
		} else {
			System.out.println(b + " is larger than " + a);
		}
	}

	public static void main(String[] args) {

		Task largest = new Task();
		largest.twoNums(14, 24);
		System.out.println("--------");
		Task result = new Task();
		result.evenOrOdd(22);
		System.out.println("--------");
		Task answer = new Task();
		answer.palindrome("mom");

	}

	/*
	 * TASK 2 Create a method that will take a number and prints whether the number
	 * is even or odd
	 */
	void evenOrOdd(int x) {
		if (x % 2 == 0) {
			System.out.println(x + " is even");
		} else {
			System.out.println(x + " is odd");
		}
	}

	/*
	 * TASK 3 Create a method that will print whether given String is palindrome or
	 * not
	 */
	// methodName (String type parameter)
	void palindrome(String name) {
		String reverse = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}
		System.out.println(reverse);

		if (name.equals(reverse)) {
			System.out.println("This is palindrome");
		} else {
			System.out.println("This is NOT palindrome");
		}

	}
}