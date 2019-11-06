package com.classReplHW;

import java.util.Scanner;

public class Assignment37 {

	public static void main(String[] args) {

		Scanner scan;
		scan = new Scanner(System.in);
		boolean thirsty;
		boolean sleepy;
		String beverage = null;

		System.out.println("Are you thirsty?");
		thirsty = scan.nextBoolean();
		System.out.println("Are you sleepy");
		sleepy = scan.nextBoolean();

		if (thirsty && !sleepy) {
			beverage = "Water";
		} else if (thirsty && sleepy) {
			beverage = "Coffee";
		} else if (!thirsty && sleepy) {
			beverage = "Tea";
		} else {
			beverage = "nothing";
		}
		System.out.println("Looks like you need " + beverage);
	}
}
