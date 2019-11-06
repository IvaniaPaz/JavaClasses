package com.class10;

public class GetAllValues {

	public static void main(String[] args) {
		// I want to print all values from an array
		// when value is dog--. i love dogs

		String[] animals = { "cat", "dog", "cow", "snake", "elephant" };
// when you want a string to equal another string make sure you put string.equals("string")
		
		for (int i = 0; i < animals.length; i++) {

			if (animals[i].equals("dog")) {
				System.out.println("I love dogs <3");
			} else {
				System.out.println(animals[i]);
			}
		}

	}

}
