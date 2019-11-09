package com.class16;

public class IQ6 {

	public static void main(String[] args) {
	
		/*Write a Java Program to find whether a String is palindrome or not?
		 * if revered string and original string are same ---> string is palindrome
		 * Palindrome: mom, dad, madam,racecar,kayak,bob
		 */
/*Step 1: reverse the string 
 * Step 2: compare 2 strings:
 * if strings are equal --> palindrome
 * else ----> not palindrome
 */
		
		String original="kayak";
		String reversed="";
		
		for(int i=original.length()-1;i>=0;i--) {
			
			reversed=reversed+original.charAt(i);
			
		}
		System.out.println(reversed);
		
		if(original.equals(reversed)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is NOT palindrome");
		}

	}
}