package com.class37;

public class ExceptionDemo {
	public static void main(String[] args) {
	
	division2Integer(10, 5);
	division2Integer(10, 0);	
	division2Integer(10, 0);
	division2Integer(10, 2);
	division2Integer(10, 5);
	division2Integer(10, 5);
	division2Integer(10, 2);
	
	System.out.println("End of code");
	}

	public static void division2Integer(int num1, int num2) {
		try {
			System.out.println(num1/num2);
		}catch(ArithmeticException e){
			System.out.println("Cannot divide by 0, please provide valid number");
			System.out.println(e.getMessage());
		}
	}
}
