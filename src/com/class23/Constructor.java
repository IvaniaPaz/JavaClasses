package com.class23;

public class Constructor {

	Constructor() { // no argument constructor
		System.out.println("I am your constructor");
	}

	Constructor(String str) { // pararmeter constructor
		System.out.println("I am constructor with 1 parameter  " + str);
	}

	Constructor(int num) { // pararmeter constructor
		System.out.println("I am constructor with 1 int parameter  " + num);
	}

	Constructor(int num, String str) { // pararmeter constructor
		System.out.println("I am constructor with 2 int parameter  " + num);
	}

	public static void main(String[] args) {

		Constructor obj = new Constructor();
		System.out.println("Code after creating an Object");
		obj.hello();

		Constructor obj2 = new Constructor(123, "pizza");

	}

	public void hello() {
		System.out.println("Hello Class");
		System.out.println("Hello Instructors");
	}

}