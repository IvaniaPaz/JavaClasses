package com.class11;

import java.util.Arrays;

public class ArrayManipulation {

	public static void main(String[] args) {
		
		String [] actualNames= {"John", "Smith", "Alex", "Tanaz"};
		Arrays.sort(actualNames);
	
		String [] expectedNames= {"Smith","John", "Alex", "Tanaz"};
		
		//To sort the elements of an array
		Arrays.sort(expectedNames);
		
		//System.out.println(Arrays.toString(actualNames)); // easiest way to print out all the strings
		
		String actual= Arrays.toString(actualNames);
		String expected= Arrays.toString(expectedNames);
		
		System.out.println(actual.equals(expectedNames));
		
		
		int [] numbers= {123,34,15,66,99};
		
		for(int i:numbers) {
			System.out.print(i+" "); //gives you all the numbers
		}
		
		System.out.println();
		System.out.println("*************");
		
		Arrays.sort(numbers);
		for(int i:numbers) {
			System.out.println(i+" ");
		}
	}
}