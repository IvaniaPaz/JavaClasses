package com.class13;

public class ReplaceMethodStringClass {

	public static void main(String[] args) {


		/*.replace()
		 * This method returns a new string resulting
		 * from replacing all occurrences of oldChar
		 * in this string with newChar
		 * it replaces all characters not just the first occurrence
		 */
		
		String str="Hello Dear Dan, how are you Dan, How you been?";
		String str1="12-22-1990"; 
		
		/*.replace()
		 * This method returns a new string resulting
		 * from replacing all occurrences of sequence of string
		 * in this string with newCharsequence
		 * it replaces all characters not just the first occurrence
		 */
		
		System.out.println(str.replace('e','z'));
		
		System.out.println(str1.replace('-','/'));
		System.out.println(str1.replaceAll("-", "/"));
		
		System.out.println("==================");
		
		System.out.println(str.replace("Dan", "Ben"));
		
		// how to replace ONLY the first occurrence
		System.out.println(str.replaceFirst("Dan", "Ali"));
		
		
		
		
		
		
		
	}

}
