package com.class24;

public class Task1 {

	
	private Task1() {
		System.out.println("I am a non argument constructor");
	}
	
	Task1(String str) {
	System.out.println("i am default constructor");
	}
	
	protected Task1(int ipt) {
	System.out.println("i am protected constructor");
	}
	
	
	public static void main(String[] args) {
		Task1 result=new Task1();
		Task1 result2=new Task1(10);
		Task1 result3=new Task1("string");
		
	}
	
}