package com.class04;

import java.util.Scanner;

public class Assignment46 {

	public static void main(String[] args) {
/*Initialize an object for Scanner class,    
 *  condition is if object is greater than 400 create a nested if condition to see if object is less than or equal to 600.
 * If object is less than or equal to 600 have output say "don't calculate commission"
 * if object is greater than or equal to 600 then have output say "Value is too large"
 * For anything less than the value of 400 in the first condition please print "calculate commission"
 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter object");
		int object;
		object=scan.nextInt();
		
		
		
		if(object>400) {
			if(object<=600) {
				System.out.println("Don't calculate commission");
			}else if(object>=600) {
				System.out.println("Value is too large");
			}
		}else {
			System.out.println("Calculate commission");
		}
	}
}
