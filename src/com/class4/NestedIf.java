package com.class4;

public class NestedIf {

	public static void main(String[] args) {
		
//EXAMPLE
		
		boolean isFriday=false;
		int day=13;
// If today is friday only day I want to check if day is 13th
		if(isFriday) {
System.out.println("Today is Friday");
		
		if (day==13) {
	System.out.println("I will watch scary movie");
		}
	}else {
	System.out.println("Today is NOT friday");
	}
// EXAMPLE 2		
		boolean b=true;
		boolean classToday= true;
		
	if (b) {
		System.out.println("Hello");
		
	if (classToday) {
		System.out.println("Hello my friend");
	}else {
		System.out.println("Bye");
	}
	}
	System.out.println("I am continues code");
// ^ this statement has nothing to do with the prior statment as we have closed it and it is outisde of our statement.
// that's why it is printing
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
