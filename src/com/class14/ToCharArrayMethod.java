package com.class14;

public class ToCharArrayMethod {

	public static void main(String[] args) {

		/*.toCharArray
		 * This method converts this String to a new character array.
		 * So it should print out one letter at a time in a different line.
		 */
		String str="Syntax";
		
		char[] array=str.toCharArray();
		
		for(char i:array) {
		System.out.println(i);	
		}
	System.out.println("============");
		
		
		
		
		
	}
}