package com.class18;

import java.util.Scanner;

public class BuiltAndUserDefinedMethods {

	public static void main(String[] args) {

		String str="Hello";
		str=str.replace("Hello", "Hi");
		
		Scanner scan=new Scanner (System.in);
		String scannerString=scan.nextLine();
		System.out.println(scannerString);
		
		BuiltAndUserDefinedMethods obj=new BuiltAndUserDefinedMethods();
		obj.myMethod();
		
	}
		void myMethod() {
			System.out.println("This is user denfined method that I created");
		}
}
