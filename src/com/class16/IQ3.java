package com.class16;

public class IQ3 {

	public static void main(String[] args) {
	
		/*How to find out the part of the string from a string?
		 *What is a substring? 
		 * Find number of words in String?
		 */
		
		
		String str="Today is very cold outside";
		String subString=str.substring(0, 6);
		System.out.println(subString);
		
		/*Step 1: split based on the space --> array of String
		 * Step 2: find the length of an array 
		 */
		
		
		String [] words=str.split(" ");
		System.out.println(words.length);
		
		
		
	}
}