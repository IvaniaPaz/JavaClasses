package com.class10;

import java.util.Scanner;

public class Hw4 {

	public static void main(String[] args) {
		
// TASK - use Do-while loop
				/*
				 * Write a guessing game where the user has to guess a secret number between 1
				 * and 20 after every guess input, the program tells the user whether their
				 * number was to large or too small. The program will keep asking the user to
				 * enter the number until he finds the correct number. when the correct answer
				 * is found the system should display "congratulations!!. You got it!.
				 */
		
		Scanner scan;
		int secretNumber, guessNumber;

		scan = new Scanner(System.in);
		secretNumber = 12;

		do {
			System.out.println("Guess a number from 1 to 20");
			guessNumber = scan.nextInt();

			if (guessNumber < secretNumber) {
				System.out.println("number is too small");
			} else if (guessNumber > secretNumber) {
				System.out.println("number is too large");
			} 
		} while (guessNumber != secretNumber);
		System.out.println("Congratulations, you got it!");
	}

}
