package com.classReplHW;

import java.util.Scanner;

public class Assignment102 {

	public static void main(String[] args) {
//		For you to do: 
//		The code provided in your main method will take in five Strings and save them into an array called arr.  
//		Print out the first three letters of each element of array, one per line.  
//		Note: every element of array is at least 3 letters long. 
//		bla
//		bla
//		lol
//		wha
//		wha
		
		
		Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
       
        
        for (int i=0;i<5;i++)
        { 
            arr[i] = input.nextLine();
                    System.out.print(arr[i].substring(0,3));
                    
        }
        //leave above alone!  write your code below
//        
//        for (int i=0; i<arr[i].length; i++) {
//			System.out.print(arr.charAt(i));
        
        
//       
//       arr[0]="bla";
//       arr[1]="bla";
//       arr[2]="lol";     
//	   arr[3]="wha";
//	   arr[4]="wha";   
//	 
//	   for (String s: arr)
//       {
//         System.out.println(s);
//       }
	   
	   
	   
	   
	   
    }
	}