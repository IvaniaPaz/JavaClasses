package com.class31;

public class Parent {

	//we are doing method hiding
	 void hello() {
		System.out.println("Hello from Super class");
	}
}
class Child extends Parent{
	void hello() {
	System.out.println("Hello from Sub class");
	}
}