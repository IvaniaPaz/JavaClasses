package com.class21;

public class Student {
//static variable also known as class variable. One memory is reversed
//ALL objects of the same class are affected. 
	public String studentName;
	public double GPA;
	public static String school; // doesn't belong to the object, IT BELONGS to the class
	
	public void displayInfo() {
	System.out.println(studentName+" attending "+school+" has GPA of "+GPA);
	}
	
	public void study(int hours) {
		//we cannot use local variable outside a class?
		int raining;
		
		if (3>4) {
		int ifTrue=5;
		System.out.println(ifTrue);
		}else {
		int ifFalse=6;
		System.out.println(ifFalse);
		}
	
	int localVariable= 4;
	System.out.println(studentName+ " is studying for "+hours+" hours");
	}
	
	
	
	
	
	
	
	
	
	
	
}
