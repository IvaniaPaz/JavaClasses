package com.class20;

public class Hello {
	
	char getChar(String word, int index){
		char word1=word.charAt(1);
		return word1; 

	  }
		public static void main (String[]args){
		  Hello charr=new Hello();
		  charr.getChar("hello",1);  
		  System.out.println(charr.getChar("hello", 1));
		}

}
