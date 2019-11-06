package com.class14;

public class ReplacementMethods {

	public static void main(String[] args) {
		
		//.replace
		String str="your Syntax Technologies are your responsibilites that your eclipse will run your code";
		// i want to replace the y to i
		System.out.println(str.replace('y','i')); //all will be changed bc it looks for the occurrence of all that character.
		
		System.out.println("===============");
		
		System.out.println(str.replace("your", "MY")); // not only one character but a sequence of characters. 
		
		System.out.println("===============");
		
		//.replaceAll
		// this will replace everything after way including way to nothing. it should only print out Video provides a powerful
		String str2="Video provides a powerful way to help you prove your point."
				+ " When you click Online Video,"
				+ " you can paste in the embed code for the video you want to add";
		System.out.println(str2.replaceAll( "way (.*)", ""));// give some limits, anything after that text will be removed (.*)
		
		//to replace numbers to nothing. it should only print out the letters
		String str3="23423Hell3049o%^&*";
		System.out.println(str3.replaceAll("[0-9]", ""));
		// this will replace all letters and print out only numbers/special characters
		System.out.println(str3.replaceAll("[a-z A-Z]", ""));
		//this will replace all numbers and special characters, it should print out only letters  
		System.out.println(str3.replaceAll("[^A-z]", ""));
		
		System.out.println("===============");
		
		//.replaceFirst
		// this will just replace the first space the first occurrence of space nothing else
		System.out.println(str2.replaceFirst(" ", ""));
		System.out.println(str3.replaceAll("\\w", ""));// this prints out the special characters, but we don't use this 
		
		System.out.println("===============");

		
		
		
		
		
		
		
		
		
		
		
		
	}
}