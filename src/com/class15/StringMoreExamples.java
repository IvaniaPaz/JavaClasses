package com.class15;

public class StringMoreExamples {

	public static void main(String[] args) {
	
	// get a character at specific location
		
		String str="Syntax Technologies Inc";
		char letter=str.charAt(5);
		System.out.println(letter);
		
		//System.out.println(str.charAt(str.length())); String out of bounds, won't work
		System.out.println(str.charAt(str.length()-1));  // this will get you the last character index #18 "s"
		
	    //get a substring from a string	
		//print Syntax	
		String substr1=	str.substring(0, 6);
		System.out.println(substr1);
	
		//Print Technologies Inc
		String substr2=str.substring(7);
		System.out.println(substr2);
	

	}

}
