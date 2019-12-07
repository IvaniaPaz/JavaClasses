package com.class07;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		/*
		 * You need to ask user to pay for coffee you need to keep asking user to pay
		 * for it until entered price is equal=5 after user paid then say
		 * "Enjoy your coffee"
		 */
//		int total;
//		Scanner scan;
//		scan = new Scanner(System.in);
//		do {
//
//			System.out.println("Hey your total is $5");
//			total = scan.nextInt();
//
//			if (total == 5) {
//				System.out.println("Thank you enjoy your coffee");
//			} else if (total < 5) {
//				System.out.println("Need More Money Honey");
//			} else {
//				System.out.println("Thats too much money");
//			}
//
//		} while (total != 5);

		int total;
		Scanner scan = new Scanner(System.in);

		System.out.println("Your total is $5 please pay");
		total = scan.nextInt();
		
		while(total==5) {
			System.out.println("Enjoy your coffee");
			break;
		}
	System.out.println("");
	}
}
