package com.class05;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {

		// Create a java program that will ask if user has a credit card or not.
		/*
		 * if user does not have a credit card then offer them. If they do have one, ask
		 * what is balance on the card? If balance of the card is larger than, tell them
		 * to pay off Otherwise you can tell them that they can spend more
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Do you have a credit card? true or false");
		boolean cc = input.nextBoolean();

		if (cc) {
			System.out.println("What is the balance on your card?");
			int balance = input.nextInt();
			if (balance > 1000) {
				System.out.println("Please pay off balance");
			} else {
				System.out.println("You can spend more money");
			}

		} else {
			System.out.println("Would you like to apply for credit card?");
		}

	}
}
