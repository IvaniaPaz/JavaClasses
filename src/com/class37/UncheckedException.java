package com.class37;

public class UncheckedException {

	public static void main(String[] args) {

		System.out.println("Begining of code");
		int a = 20;
		int b = 0;

		try {
			System.out.println("I am code inside try block");
			System.out.println(a / b);// new ArithmeticException();
			System.out.println("I am continuing code inside block");
		} catch (ArithmeticException e) {// ArithmeticException exception=new ArithmeticException(); this what's
			System.out.println("I am code inside catch block"); // happening
			//e.printStackTrace(); // full description want to still access the codes you want to print
			//System.out.println(e); //print object of the type - will give you name and detailed message
			System.out.println(e.getMessage()); //print the message
		}
		System.out.println("Ending of code");
	}

}
