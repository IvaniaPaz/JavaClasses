package com.class03;

public class PrimitiveCasting {
	
	public static void main(String[]args) {
		
	double d=12;
	System.out.println(d);
	
	// int i=12.0; Compile time error 
	// widening or automatic/ impilict casting
	byte b=127;
	int i=b;
	
	int num=123;
	double d1=num;
// we are adding the small data type to next big data type after it int is smaller than double so it has no issues.
	System.out.println(d1);
	// narrowing or explicit/manual casting
	// (int) is part of casting
	//we are manually entering this information even though JAVA knows it's incorrect. we can lose data 
	double d2=123.56;
	int num2=(int)d2;
	System.out.println(num2);
	
	// try to store into smaller data type
	// by putting data type in parenthesis we are manually entering the information to override since JAVA doesn't want to be held responsible.
	//We are trying to throw something bigger to small. complier cannot do it for you.
	int num3=1000;
	byte b1=(byte)num3;
	System.out.println(b1);
	
			
			
	
		
		
		
		
		
		
		
		
		
	}

}
