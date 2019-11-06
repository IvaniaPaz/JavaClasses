package com.syntax.class3;

import java.util.Scanner;

public class ReviewTask1 {

	public static void main(String[] args) {

		// Write a program with one int value for salary and four String values for
		// different cars
		// If you make over 50000 a year, you may buy a brand new car otherwise you
		// should buy a used car.
		// For those you can afford a new car there are different price ranges
		// I want anything under 70k to be Audi A5
		// I want anything under 80k to be Mercedes-Benz
		// I want anything under 90k to be Jaguar
		// I want anything under 100k to be Tesla
		// And if you make less than 60k output to read "Save up money and wait until
		// next year"

		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("How much is your salary?");
		int salary = scan.nextInt();

		if (salary > 50000) {
			System.out.println("You may buy a brand new car");
			if (salary>=50000 && salary<70000) {
				System.out.println("You will get an Audi A5");
			} else if (salary>=70001 && salary <80000) {
				System.out.println("You will purchase a Mercedes-Benz");
			} else if (salary>=80001 && salary <=90000) {
				System.out.println("You will purchase a Jaguar");
			} else if (salary>90001 && salary<=10000) {
				System.out.println("You will purchase a Tesla");
			} else if (salary <=60000) {
				System.out.println("Save up money and wait until next year");
			}

		} else {
			System.out.println("You should buy a used car");
		}

	}

}
