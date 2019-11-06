package com.classReplHW;

import java.util.Scanner;

public class Assignment35 {

	public static void main(String[] args) {

		/*
		 * Create a program that prompt user with question: "Do you need a loan?" If the
		 * result is true then prompt user with question: "What is your credit score?".
		 * Otherwise eligibility is "Unknown" Based on the score define users
		 * eligibility: if score is below 600 --> eligibility = "Not eligible" if score
		 * is between 600 and 700 inclusive --> eligibility = "Maybe eligible" if score
		 * is between 701 and 800 inclusive --> eligibility = "Eligible" if score is
		 * higher than any other previous values --> eligibility = "Definitely eligible"
		 * . Output: "The eligibility is ____"
		 */
		Scanner q= new Scanner(System.in);
		System.out.println("Do you need a loan?");
		boolean loan=q.nextBoolean();

		if (loan) {
			System.out.println("What is your credit score?");
			int num1 = q.nextInt();
			if (num1 < 600) {
				System.out.println("Not eligible");
			} else if (num1 >= 600 && num1 < 700) {
				System.out.println("Maybe eligible");
			} else if (num1 >= 701 && num1 < 800) {
				System.out.println("Eligible");
			} else if (num1 > 800) {
				System.out.println("Definietly eligible");
			}
		} else {
			System.out.println("Unknown");
		}
	}
}