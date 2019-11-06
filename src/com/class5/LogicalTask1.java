package com.class5;

public class LogicalTask1 {
	public static void main(String[] args) {
		
		/*write a program that will print whether it is a weekend or weekday. 
		 * if any day from 1-5---->it is a weekday 
		 * if any day from 6-7 -----> it is a weekend
		 * any other day ------> Invalid day
		 */	
				
			int day=0;	
				
			if(day==1 || day==2) {
			System.out.println("It is a weekday");
			}else if (day==3 || day==4) {
			System.out.println("It is a weekday");
			}else if (day==5) {
			System.out.println("It is a weekday");
			}else if(day==6 || day==7) {
			System.out.println("It is a weekend");
			}else {
			System.out.println("Invalid day");
		  }
			
			int feet=0;
			
			if(feet>1 && feet<=5) {
			System.out.println("You are short");
			}else if (feet>5 && feet<=6) {
			System.out.println("You are medium");
			}else if (feet>6 && feet<=8) {
			System.out.println("You are tall");
			}else {
			System.out.println("You are nothing");
			}
 }
}
