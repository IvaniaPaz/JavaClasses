package com.classReplHW;

import java.util.Scanner;

public class Assignment45 {

	public static void main(String[] args) {

		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("Please enter number");
		int num = scan.nextInt();

		if (num%2==0) {
			System.out.println("Value is even");
			if (num > 100) {
				System.out.println("Value is too large");
			} else {
				System.out.println("Value is just right");
			}

		}else if (num<100){
			System.out.println("Value is just right and is an odd number");
		}else {
			System.out.println("This is an odd number and value is too high");
		}
	}
}