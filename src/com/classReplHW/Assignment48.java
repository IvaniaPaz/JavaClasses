package com.classReplHW;

import java.util.Scanner;

public class Assignment48 {

	public static void main(String[] args) {
//		Prompt user to input either "M" or "F" as a String "gender" and input any value as int "age". 
//		You have 2 conditions:
//		If age is above 25, your inner condition, depending on your gender value, should get either "Woman" or "Man" as an output. 
//		If age is below 25, your inner condition, depending on your gender value, should get either "Girl" or "Boy" as an output. 
//		Instruction: after you run your code, start inputing your values without Prompt question to appear. 
//		Hint: your age should not be equal to 25. 
		
	
		 Scanner scan=new Scanner(System.in);
		 System.out.println();
	      String gender=scan.nextLine();
	      
	      System.out.println();
	      int age=scan.nextInt();      
	      
	      if (age>25) {
	          if (gender.equals("M")) {
	       System.out.println("Man");
	     
	       }else{
	           System.out.println("Woman");
	       }
	           
	           }else  if ( gender.equals("F"))
	           {
	           System.out.println("Girl");
	          
	      }else  {
	               System.out.println("Boy");
	       }
	}
}
