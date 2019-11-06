package com.classReplHW;

import java.util.Scanner;

public class Assignment78 {

	public static void main(String[] args) {
		
//		For you to do:
//			Note: Create Scanner class
//
//			Write an array with size of 5. 
//			Use a loop to input values to the array (don't print any prompt message for Scanner).
//			Then print out all the elements you have created in the first loop in reverse order. 
//
//			Example: 
//			Input: 
//			1
//			2
//			3
//			4
//			5
//
//			Output:
//			5
//			4
//			3
//			2
//			1
		
		Scanner scan = new Scanner(System.in);
		int[] array = new int[5];

		
		
//		for(int a=1; a<=array.length;a++) {
//			System.out.println("input numbers");
//			
//		
		for (int i = 0; i < array.length; i++)
	    {
	        System.out.println("");
	        array[i] = scan.nextInt();
	    }
		for(int j=array.length-1;j>=0;j--) {
			System.out.println(array[j]);
		}
	}
}