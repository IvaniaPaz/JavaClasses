package com.class12;

import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {

		int[] array2 = { 2, 5, 4, 7 };

		for (int i : array2) {
			System.out.println(i);
		}
		int[] arr = new int[3]; // creating an object of class
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) { // this loop will allow the user to input, stores values
			arr[i] = scan.nextInt();
		}
		for (int i = 0; i < arr.length; i++) { // this loop does nothing but print it
			System.out.println(arr[i] + " ");
		}
	}

}
