package com.class8;

import java.util.Scanner;

public class BreakandContinueTask {

	public static void main(String[] args) {
//1. Print numbers from 1 to 50 except those that are divisible by 3
		
// 2. create program that will be asking user to apply for a credit 10 times as soon as you get a YES from user program should stop asking
		
		for(int i=1; i<=50;i++) {
			if(i%3==0) {
			continue;
			}System.out.println(i);
		}
	System.out.println("----------------------");	
// you could have used this with a boolean or string 	
		String card;
		Scanner scan=new Scanner(System.in);

		for(int c=1; c<=10; c++) {
			System.out.println("Do you want to apply for a credit card?");
			card=scan.nextLine();
			if(card.equalsIgnoreCase("yes")) {
				break;	
			}
		}

	}
}
