package com.reviewSessions;

public class ClassA {

//	create a new package and call it reviewSessions
//	Create a class and call it ClassA
//	inside ClassA overload the main method and print a String
//	in ClassA also create 4 methods with your name
//	in those 4 methods do anything you'd like, print out strings but in at least two methods declare a 
//	return type of anything you'd like
//
//	lastly, execute your program
	
	

	public static void main(String[] args) {
		System.out.println("this is a review session");
		ClassA obj = new ClassA();
		obj.Ivania('h');
		int num = obj.Ivania(14);
		String name = obj.Ivania("Ana");
		obj.Ivania();
	}

	String Ivania(String name) {
		String name1 = name;
		return name1;
	}

	int Ivania(int num1) {
		return num1;
	}

	public void Ivania(char obj) {
		System.out.println("hello");
	}

	public void Ivania() {
		System.out.println("Hello, my name is Ivania.");
	}

}
