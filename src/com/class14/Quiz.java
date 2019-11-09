package com.class14;

public class Quiz {

	public static void main(String[]args) {
		
		
		
		String obj = "I LIKE JAVA";
		System.out.println(obj.charAt(3));
		System.out.println("==========");   
		String str = "0123456789";
		System.out.println(str.substring(4));
		System.out.println("=============");
		String word ="abrakadabra";

	      String replace=word.replaceAll("[^aAeEiIoOuU]", " ");

	      System.out.println(replace);
	      System.out.println("================");

	      String str_Sample = "RockStar";
	      System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));
		}
}


