package com.classReplHW;

public class Assignment95 {

	public static void main(String[] args) {

//		For you to do:
//
//			Output 1: print str starting at index 5 and going till the end.
//			Output 2:  print str starting at index 7 and ending at index 10.
//			Output 3: print "harambe". This must not be a new string, must be from str.
//			Output 4: print "t f". This must not be a new string, must be from str. 
		
//		ps out for harambe
//		ou
//		harambe
//		t f
//		
		String str = "laptops out for harambe";
		
		System.out.println(str.substring(5));
		System.out.println(str.substring(7,10));
		System.out.println(str.substring(16, 23));
		
		char an=str.charAt(3);
		char answer=str.charAt(12);
		
		System.out.println(an+" "+answer);
		
		
		
		
		
		
		
		

	}

}
