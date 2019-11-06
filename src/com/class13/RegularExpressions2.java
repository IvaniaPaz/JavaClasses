package com.class13;

public class RegularExpressions2 {

	public static void main(String[] args) {
		

		String str="Today is our Java class";
		//replacing space with nothing 2 ways to do it 
		System.out.println(str.replace(" ", ""));
		System.out.println(str.replaceAll("\\s", ""));
		
		
		String doc="Video provides a powerful way to help you prove your point. When you click Online Video";
		doc=doc.toLowerCase();
		System.out.println(doc.toLowerCase().replace("video", "Audio"));
		System.out.println(doc.replaceAll("powerful(.*)", "")); //delete everything after powerful
		
		
		
		
		
		
		
		
		
	}
}