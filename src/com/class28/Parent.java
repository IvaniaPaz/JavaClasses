package com.class28;

public class Parent {

	String name = "John";
	String lastName = "Snow";

	public void callName() {
		System.out.println(name + " " + lastName);
	}

}

class Child extends Parent {
	String name = "James";

	public void callName() {
		System.out.println(name); // child overrides parent
		System.out.println(super.name);// parent
		System.out.println(lastName);// parent, you only use this when parent and child have the same variable name.
										// otherwise don't
	}

	public void callingMethod() {
		this.callName(); // you'll be calling current class which is child. BY DEFAULT THIS IS ADDED
		super.callName();
	}
}