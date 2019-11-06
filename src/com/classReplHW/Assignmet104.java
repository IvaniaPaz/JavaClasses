package com.classReplHW;

import java.util.Scanner;

public class Assignmet104 {

	public static void main(String[] args) {
//		Write a for loop that will print out every other letter in a String, starting with the first letter.
//		These letters should be printed all on one line with no space in between.
//
//		Sample input/outputs
//		In: hello
//		hlo

		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String word = inp.nextLine();
		// write your code below

		for (int i = 0; i < word.length(); i++) {
			char[] array = word.toCharArray();
			if (i % 2 == 0) {
				System.out.print(array[i]);
			}
		}

	}
}