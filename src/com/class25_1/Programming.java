package com.class25_1;

public class Programming {
	
	 Programming() {
	System.out.println("I love programming languages");
	}
	Programming(String str) {
		System.out.println("I love Java");
	}
	
	public static void main(String[] args) {
		Programming obj=new Programming();
		Programming obj1= new Programming("Hello");
	}

}
