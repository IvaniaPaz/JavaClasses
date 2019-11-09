package com.class15;

public class ClassRecap {

		public static void main(String[]args) {
			
			
			/*String class comes in JAVA lang package
			 * 2 ways to create a String
			 */ 
			
	// First way - using String literal 
		String str="Hello";	
			
	// Second way - using a new keyboard creating a String object	
			String str1=new String("hello");
	
	System.out.println(str);
	System.out.println(str1);
	
	System.out.println("===============");
	
//Find the number of characters inside the String
	int length=str.length();
	System.out.println(length);
	
	System.out.println("===============");
	
//Case conversion methods/functions
	str=str.toLowerCase(); //reassigning
	System.out.println(str.toLowerCase()); 
	System.out.println(str);
			
	System.out.println("===============");
	
//verify if the string is empty			
	String myString="";	//empty value
	boolean isEmpty=myString.isEmpty();		
	System.out.println(isEmpty);
	
	System.out.println("===============");
			
	String myString1=null; // no value at all complier will give you an exception, this equals to String myString1;		
	//System.out.println(myString1.isEmpty());
	
	System.out.println("===============");

//how to verify existence of characters in the String
	String a="Good evening students";
	boolean exist=a.contains("even");
	System.out.println(exist);
	
	System.out.println("===============");
	
System.out.println(a.startsWith("Good"));	
System.out.println(a.endsWith("student"));	
	
    System.out.println("===============");
	
	
	
 }
}