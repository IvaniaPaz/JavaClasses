package com.class10;

public class ClassTask1 {

	public static void main(String[] args) {
		/*
		 * Create an array of countries. While retrieving all values from an array print
		 * capital for each country.
		 */

		String[] countries = {"El Salvador","Japan","Jamaica" };

		for (int i = 0; i < countries.length; i++) {

			if (countries[i].equals("El Salvador")) {
				System.out.println("San Salvador");
			} else if (countries[i].equals("Japan")) {
				System.out.println("Tokyo");
			} else if (countries[i].equals("Jamaica")) {
				System.out.println("Kingston");
			}
		}
	}
}
