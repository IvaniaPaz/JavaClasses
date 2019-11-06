package com.class9;

public class Pattern {

	public static void main(String[] args) {

		for (int k = 1; k <= 5; k++) {
			for (int l = 1; l <= 5; l++) {
				System.out.println("*");
			}

		}
		System.out.println("----------------------------");

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------------------------------------------");

		for (int v = 1; v <= 9; v++) { // rows

			for (int s = 1; s <= 5; s++) { // cols
				System.out.print("@");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");

		for (int i = 0; i < 3; i++) {
			for (int p = 0; p < 10; p++) {
				System.out.print("$");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");

		for (int i = 1; i < 5; i++) {

			for (int j = 1; j < 6; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");

		for (int a = 1; a <= 5; a++) {

			for (int b = 1; b <= 9; b++) {
				System.out.print(b);
			}
			System.out.println();
		}

		System.out.println("------------------------------------------");

		for (int c = 5; c >= 1; c--) {
			for (int d = 1; d <= 5; d++) {
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");

		for (int c = 1; c <= 5; c++) {
			for (int d = 5; d >= 1; d--) {
				System.out.print(d);
			}
			System.out.println();
		}

		System.out.println("------------------------------------------");
		// PYRAMID

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("------------------------------------------");

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");

		for (int i = 9; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------");
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 9; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
