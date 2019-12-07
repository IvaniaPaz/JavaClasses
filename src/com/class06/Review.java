package com.class06;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {

		// Find the largest number using nested
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers for Nested if ");

		double no1=scan.nextDouble();
		double no2=scan.nextDouble();
		double no3=scan.nextDouble();
		
		if(no1>no2) {
			if(no1>no3) {
// what this if condition is stating is that no1 is greater than no2 AND no1 is greater than no3
			System.out.println("Largest number is first - "+no1);
			}else {
// what this else is stating is that no1 greater than no2 but no1 less than no3
			System.out.println("Largest number is third - "+no3 );
			}
		}else {
//assuming that no2>no1
			if (no2>no3) {
				System.out.println("Largest number is second - "+no2);
			}else {
				System.out.println("Largest number is third - "+no3);
			}
		}
	}

}
