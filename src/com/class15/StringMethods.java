package com.class15;

public class StringMethods {

	public static void main(String[] args) {
		
		//replace 
		String str="Java classes at Syntax are awesome";
		str=str.replace("awesome", "great");
		System.out.println(str);
		str=str.replace("a", "2468/**--/^&");
		System.out.println(str);
		
	  //replaceAll --->specify regular expression	
	  //let's remove all special characters
	  str=str.replaceAll("[^a-zA-Z0-9]", "");	
	  System.out.println(str);	
		
	  //split	
	  String myString="Java classes at Syntax are awesome";
	  String[] array=myString.split("a");
	  System.out.println(array.length); 
		

	}

}
