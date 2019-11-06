package com.class10;

public class AnotherWayClassTask1 {

	public static void main(String[] args) {
		/*
		 * Create an array of countries. While retrieving all values from an array print
		 * capital for each country.
		 */

		String[] countries = { "El Salvador", "Japan", "Jamaica" };

		for (int i = 0; i < countries.length; i++) {

			switch (countries[i]) {

			case "El Salvador":
				System.out.println("San Salvador");
				break;
			case "Japan":
				System.out.println("Tokyo");
				break;
			case "Jamaica":
				System.out.println("Kingston");
				break;
			}
		}
	}
}
