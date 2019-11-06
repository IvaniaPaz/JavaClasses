package com.class14;

public class LastClassRecap {

	public static void main(String[] args) {
		
	String str=new String ("Hello"); //both are stored separately and will
	String str3=new String ("Hello");
// String str3=str; //changes the value that will print TRUE rather than false
	System.out.println(str==str3);
	
	System.out.println("===============");
	
	String s1="Hello";
	String s2="Hello";
	System.out.println(s1==s2);

	System.out.println(str);
	String str2=str.replaceAll("Hello", "Bye"); //store in a new object bc you cannot change the str
	System.out.println(str2); //string is immutable you can never change the values. everyone will have it's own object.
		
//	  ==    will tell you if the, does not compare the content it compares the object. reference 
//   .equals used to compare content 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}