package com.classReplHW;

import java.util.Scanner;

public class Assigment103 {

	public static void main(String[] args) {
//		Write a for loop that will loop through every character of a word and print out each character, 
//		each on a separate line 
		
		 Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String word = inp.nextLine();
		    //write your code below
		
		    char[] array=word.toCharArray();
			
			for(char i:array) {
			System.out.println(i);	
			}
		    
		    
		    
		    
		    
		    
		    
//		for (int i = 0; i < args.length; i++) {
//			System.out.print("hello");
//		}System.out.println();
		
		
		
		
		
		
		

	}
}