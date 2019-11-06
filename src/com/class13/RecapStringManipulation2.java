package com.class13;

public class RecapStringManipulation2 {

	public static void main(String[] args) {

		
		String str1="Hello";
		String str2="Hello";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1==str2);
		
		System.out.println("======Equals========");
		
		String str3=new String ("Bye");
		String str4=new String("Bye");
		
		System.out.println(str3.equals(str4)); //true
		System.out.println(str3==str4);
		
		System.out.println("======Contains========");
		
		System.out.println(str1.contains("zz"));
		
		System.out.println("======StartsWith and EndsWith======");
		
		String str5="Today is Saturday";
		System.out.println(str5.startsWith("Today"));
		System.out.println(str5.endsWith("day"));
		
		System.out.println("======Concat=======");
		
		System.out.println(str5.concat(" and we have java class"));
		
		System.out.println("======Trim=====");	
		
		String str6="          it is sunny          ";
		System.out.println("Before triming:"+str6);
		System.out.println("After: "+str6.trim()); //will never touch the middle white spaces. ONLY beginning and end of string
		
		System.out.println("======Index OF and CharAt=======");
		
		String str7="Tomorrow we will be done with String Manipulation";
		System.out.println(str7.indexOf('e')); // it will print only first occurrence 
		System.out.println(str7.indexOf('e', 11));
		System.out.println(str7.indexOf("we"));
		
		System.out.println(str7.charAt(10));
		
		
		
		
		
	}

}
