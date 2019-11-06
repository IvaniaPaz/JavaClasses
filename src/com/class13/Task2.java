package com.class13;

public class Task2 {

	public static void main(String[] args) {
//		Create a String and print it in reverse order (Sunday → yadnuS).

//		Create a String and if the String is not empty perform the following: 
//		if the String has an odd number of characters and has 3 or more characters, 
//		print the character in the middle of the String.

		// REVERSE ORDER
		

		String day = "Sunday";

		System.out.println(day.charAt(5) + " " + day.charAt(4) + " " + day.charAt(3) + " " + day.charAt(2) + " "
				+ day.charAt(1) + " " + day.charAt(0));

		System.out.println(day.length());

		for (int i = day.length() - 1; i >= 0; i--) {
			System.out.print(day.charAt(i));
		}

	}

}
