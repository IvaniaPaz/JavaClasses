package com.syntax.class3;

import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
	//read the array size from the scanner
	//create an array of Strings
	//insert values of int from the scanner
	//print the sum of all elements
		
		Scanner scan=new Scanner (System.in);
		int element;
		
		System.out.println("How many elements would you like to enter?");
		element=scan.nextInt();
		
		int [] array= new int[element]; // array and element are the same value right now so you can use both for the answer
		
		for(int i=0;i<array.length;i++) {// putting values here and printing it
			System.out.println("Enter a number");
			array[i] = scan.nextInt();
		}
		int sum=0;
		for(int i=0;i<element;i++) {
			sum+=array[i];
			
			
		}System.out.println("The sum is "+sum);
	}

}
