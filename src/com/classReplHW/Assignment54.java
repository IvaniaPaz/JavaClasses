package com.classReplHW;

public class Assignment54 {

	public static void main(String[] args) {
//		Step 1: Initialize the i value as int i=7.
//		Step 2: Write a program to print a sequence of number starting from 7 to 98. 
//		Step 3: Think by what number it should be incremented. 
//		7 
//		14 
//		21 
//		28 
//		35 
//		42 
//		49 
//		56 
//		63 
//		70 
//		77 
//		84 
//		91 
//		98

		int i=7;
		
		while(i<=98){
			if (i%7==0) {
				System.out.println(i);
			}
			i++;
		}
		
	}

}
