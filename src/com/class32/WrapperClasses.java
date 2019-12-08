package com.class32;

public class WrapperClasses {

	public static void main(String[] args) {
	
		int num =10;
		//Autoboxing ---> converting primitive type into object type
		
		Integer integer=100000; //taking primitive type and storing it into Integer object 
		System.out.println(integer.MIN_VALUE);
		String str=integer.toString();
		System.out.println(str);
		
		
		

		
		//converting boolean primitive type into Boolean object type
		Boolean bool= true;
		Byte _b=20;
		System.out.println(_b.MAX_VALUE); //answer will be how much you can store inside byte
		
		// AutoUnboxing ---> converting  Object type into a primitive type
		int num1=new Integer(10);
		System.out.println(num1);
		
		
		
		
	}

}
