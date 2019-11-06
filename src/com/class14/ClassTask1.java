package com.class14;

public class ClassTask1 {

	public static void main(String[] args) {
		
	/*Create a string that will hold a sentence 
	 * 	Write a program to get a new String without any spaces
	 */
//TASK 1	
		String str="Hello we will all leave on time today";
		
		System.out.println(str.replace(" ", ""));
		
		System.out.println("=============");
		
//TASK2		
		/*Create a String that should be combination of letters, numbers, special characters.
		 * Find out how many alpha characters are there in the String
		 */
		
		String str1="Hell12345o#$!";
		System.out.println(str1.replaceAll("[a-zA-Z0-9]", "").length());
		
		System.out.println("=============");
//TASK3
		/*You have a String a="Is it Saturday? Is it raining? Do we have a Java Class today?"
		 * how would you find out how many sentences are in that string?
		 */
		
		String a="Is it Saturday? Is it raining? Do we have a Java Class today?";

		String[] array2=a.split("\\? "); // this is how you would find out how many sentences
		System.out.println(array2.length);
		
	for (String string:array2) {          //this is to print out each sentences
		System.out.println(string.trim());
	}
		
	}
}