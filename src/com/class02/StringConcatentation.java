package com.class02;

public class StringConcatentation {
//add your main method
	public static void main(String[]args) {
		
		String name="Anna";
//Display in console Good morning Anna
		System.out.println("Good morning "+ name);
// make sure within the quotatino you add a space to display a space if you want it print out that way
		
		int day=22;
//Today is September 22
		System.out.println("Today is September "+day);
		
		String text="Today is September ";
		System.out.println(text + day);

		int num1=12;
		int num2=13;
// the value of num1____ = and the value of num2=___
		System.out.println("The value of num1="+num1+ " and the value of num2="+num2);
		
		String fruit="banana";
		char dollar='$';
		double price=1.99;
//The price of banana is 1.99
		System.out.println("The price of "+fruit+" is " +dollar+price+"!!!");
		
	}
}
