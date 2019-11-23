package com.class22;

public class StaticVSNonStatic {

	//template for a student (school, name, grade)
	
	static String school="Synatx"; //< this is a static variable, this variable belongs to the class NOT the object
	String name; // < this is an instance variable
	char grade;

// instance method.. .b/c it isn't a static method, we are not adding value to this 
	void getInfo() {
	System.out.println("My name is "+name+" and I am going to "+school+" and my grade is "+grade);
	}
	
//static method
 static	void getInfo1() {
		System.out.println("I am attending classes at "+school);
		}
	
	public static void main(String []args) {
//you can do this in the same class, your complier will know when to pull it because it's the same class
		System.out.println(school);
		getInfo1();
		
	}
}
