package com.class07;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		
		Scanner scan;
		boolean isRain;
		scan=new Scanner(System.in);
		
		do {
			System.out.println("Is it raining");
			isRain=scan.nextBoolean();
		}while(isRain);
		System.out.println("Go to the park");
	}

}
