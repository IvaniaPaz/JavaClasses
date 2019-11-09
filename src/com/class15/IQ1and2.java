package com.class15;

import java.util.Arrays;

public class IQ1and2 {

	public static void main(String[] args) {
		
// Interview Question #1: Write a program to swap 2 numbers without a temporary variable?		
//using Arithmetic operators
		
	int a=10;	
	int b=20;
		
    a=a+b; //30		
    b=a-b; //30-20=10		
    a=a-b; //30-10=20		
		
    System.out.println("The value of a= "+a);		
    System.out.println("The value of b= "+b);		
	
    System.out.println("==================");
    
//Interview Question #1: Swap 2 strings without a temporary variable?		
//using String Manipulation		
	String str1="Hello";	
	String str2="Welcome"; //7
		
	str1=str1+str2; // =HelloWelcome --> 12
	str2=str1.substring(0, str1.length()-str2.length()); 
	str1=str1.substring(str2.length());
	
	System.out.println("The value of str1= "+str1);
	System.out.println("The value of str2= "+str2);
	
	System.out.println("==================");
	
//Interview Question #2: Write a java program to find the  second largest number in the array?	
	
	int [] array= {100,-90,8787,898,0,1,-90,8787}; //even if elements are duplicated it still remains the same 
 	
	// 1 easiest way 
	Arrays.sort(array);
	int min=array[0];
	int max=array[array.length-1];
	int second=array[array.length-2];
	
	System.out.println(min);
	System.out.println(max);
	
	System.out.println("==============");
	
//2nd way	
	int [] myArray= {100,-90,8787,898,0,1,-90,8787};
	int largest=myArray[0];
	int smallest=myArray[0];
	
	for (int i=0; i<myArray.length;i++) {
		if(myArray[i]>largest) {
			largest=myArray[i];
		}
		if(myArray[i]<smallest) {
			smallest=myArray[i];
		}
	
	}
	System.out.println("The smallest value in the array is "+smallest);	
	System.out.println("The largest value in the array is "+largest);
	
	System.out.println("============");
	
	int [] nums= {100,-90,8787,898,0,1,-90,8787};
	int large=nums[0];
	int secondlarge=nums[0];
	
	for(int i=0;i<nums.length;i++) {
		
		if(nums[i]>large) {
			secondlarge=large;
			large=nums[i];
		} 
		if (nums[i]>secondlarge) {
			secondlarge=nums[i];
		}
		
		
		
	}
	
	
	}
}