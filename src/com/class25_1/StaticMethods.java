package com.class25_1;

public class StaticMethods {

	public static void main(String str) {
		System.out.println("I am a parameter constructor with 1 String parameter");
	}

	public static void main(int num1) {
		System.out.println("I am a parameter constructor with 1 int parameter"); 
	}

	public static void main() {
		System.out.println("I am a non argument constructor");
	}
	
	private void methodOne() {
		System.out.println("I am method one ");
	}
	private void methodOne(String str) {
	System.out.println("I am method one with 1 String parameter");
	}
	
	private void methodOne(int num) {
		System.out.println("I am method one with 1 String parameter");
		}
	public static void main(String[] args) {
		StaticMethods result= new StaticMethods();
		main("String");
		main(10);
		main();
		
		result.methodOne();
		result.methodOne("Hello");
		result.methodOne(2);
	}

}
