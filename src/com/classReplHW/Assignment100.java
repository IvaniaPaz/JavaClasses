package com.classReplHW;

public class Assignment100 {

	public static void main(String[] args) {
//		For you to do:
//			Create a String named "Welcome To Syntax Solutions".
//			Convert the String into array and using toCharArray method print all values. 
//			Output should be like :
//
//			W
//			e
//			l
//			c
//			o
//			m
//			e
//			 
//			T
//			o
//			 
//			S
//			y
//			n
//			t
//			a
//			x
//			 
//			S
//			o
//			l
//			u
//			t
//			i
//			o
//			n
//			s
	
		String str1="Welcome To Syntax Solutions" ;
		
      char[] array=str1.toCharArray();
		
		for(char a:array) {
			System.out.println(a);
		}
	}
}
