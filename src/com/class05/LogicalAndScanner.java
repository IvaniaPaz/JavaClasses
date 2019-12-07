package com.class05;

import java.util.Scanner;

public class LogicalAndScanner {

	public static void main(String[] args) {
	/*ask user to enter age
	 * if age is from 1-3---> you are a baby
	 * 	if age from 3-5 ---> you are a toddler
	 * if age from 5-12 you are a kid
	 * if age from-19 ----> teenager
	 * if age>20---> you are an adult 
	 */
		
	Scanner age=new Scanner(System.in);
	System.out.println("Enter your age");
	int num1=age.nextInt();
	
	if (num1>=1 && num1<=3 ) {
	System.out.println("You are a baby");
	}else if (num1>=3 && num1<=5) {
	System.out.println("You are a toddler");
	}else if (num1>=5 && num1<=12) {
	System.out.println("You are a kid");
	}else if (num1>=12 && num1<=19) {
	System.out.println("You are a teenager");
	}else if (num1>20) {
	System.out.println("You are an adult");
	}else {
	System.out.println("Invalid");
	}
	}
}
