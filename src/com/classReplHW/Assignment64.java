package com.classReplHW;

public class Assignment64 {

	public static void main(String[] args) {
//		For you to do: 
//		Write a program that prints the string "It is year: " and the years between 2010 and 2019.
//		Must not include year 2019 in the output 
//		Hint: 
//		It is year 2011
//		It is year 2012
//		It is year 2013
//		.
//		.
//		.
//		It is year 2018
//		Output:
//		It is year 2011
//		It is year 2012
//		It is year 2013
//		It is year 2014
//		It is year 2015
//		It is year 2016
//		It is year 2017
//		It is year 2018
		
		for(int a=2011; a<=2018;a++) {
			if(a%1==0) {
			System.out.println("It is year: "+a);
			}
		}
		System.out.println("---------------------------------------");
//ASSIGNMENT 65		
		for(int a=2011;a<=2019;a++) {
			if(a%1==0)
		System.out.println("Hey, it is year: ");
			System.out.println(a);
		}
		
	System.out.println("--------------------------------------------------");
	
//ASSIGNMENT 66
	
		for(int a=10; a>=1;a--) {
		System.out.println(a);
		}System.out.println("Happy New Year!");
		
		
	}
}
