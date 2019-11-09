package com.class16;

public class IQ5 {

	public static void main(String[] args) {
		
	//Write a java program to reverse String	
	/*tocharArray();
	 * 	
	 */
		
	String given1="Today is Java class";	
	char[] charArray=given1.toCharArray();	
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}
		
System.out.println(" ");

 String Word3="I Love Java";
		for(int i=Word3.length()-1; i>=0;i--) {
			System.out.print(Word3.charAt(i));
		}
		
		System.out.println(" ");
	//reverse a string word by word	
	
	String given="Welcome to the Java class";
	/*To reverse String
	 * split();
	 * Step 1: split ---> array of String 
	 * Step 2: use for loop and use decrement to print values
	 */
		
	String reversed="";	
	String [] str= given.split("\\s");	
		for(int j=str.length-1;j>=0; j--) {
			reversed=reversed+str[j]+" ";
		}
		System.out.println(reversed);
 }
}