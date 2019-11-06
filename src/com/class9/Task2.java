package com.class9;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TASK#1--- use FOR loop
		/*
		 * Write a program that reads a range of integers (start and end point) provided
		 * by a user then from that range prints the sum of the even and odd integers.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter starting point");
		int start = scan.nextInt();
		System.out.println("Enter ending point");
		int end = scan.nextInt();

		int sumOdd = 0;
		int sumEven = 0;

		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				sumEven = sumEven + i;

			} else {
				sumOdd = sumOdd + i;

			}
		}
		System.out.println("the sum of even numbers is: " + sumEven);
		System.out.println("the sum of odd numbers is: " + sumOdd);
	}

}
