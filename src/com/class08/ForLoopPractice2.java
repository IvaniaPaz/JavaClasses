package com.class08;

public class ForLoopPractice2 {

	public static void main(String[] args) {
		/*Write a code to find the sum of even and odd numbers
		 * from range 1 to 20
		 * Expecting 2 outputs
		 * sum for odd nums=
		 * sum for even nums=
		 * Asel didn't want us to print out all of the even and odd numbers. She only wanted us to print the SUM OF ALL. 
		 * that's why our condition below is how it looks 
		 * */
				
				int sumEven=0;
				int sumOdd=0;
				
				for(int i=1; i<=20; i++) {
					if(i%2==0) {
				sumEven=sumEven+i;
					}else {
				sumOdd=sumOdd+i;
					}
				}System.out.println("The sum of odd numbers = "+sumOdd);
				System.out.println("The sum of even number = "+sumEven);
	}
	}
