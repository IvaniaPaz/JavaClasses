package com.class10;

public class ArrayLessonYoutube {

	public static void main(String[] args) {
	
	//	  element/index    0    1     2   3     4    5
		double grades[]= {96.5,98.7,99.3,88.4,88.6,90.1};
		int numbers[]=new int[10];
		
		int i;
		for ( i = 0; i <=5; i++) 
		{
		System.out.println("Grade number "+i+" is "+grades[i]);
		}
		for (i = 0; i <=9; i++) 
		{
		numbers[i]=i+10;	
		}
		for (i = 0; i <=9; i++) {
			System.out.println(numbers[i]); //pull individual elements
		}

	}

}
