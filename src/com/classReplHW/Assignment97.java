package com.classReplHW;

import java.util.Scanner;

public class Assignment97 {

	public static void main(String[] args) {

//		Using Scanner class input string value. 
//		Print out the following: "The first 3 letters of ___ is ___"
//
//		For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter anything");
	
				
		String value=scan.next();
		System.out.println("The first 3 letters of "+value+ " is "+value.charAt(0)+value.charAt(1)+value.charAt(2));
		
		
		
		
		
		
		
		
	}

}
