package com.class25_1;

public class ConstructorOverloading {
	
	//Different amount of parameter
	ConstructorOverloading() {
		System.out.println("i am non argument constructor");
	}

	ConstructorOverloading(String str){
		System.out.println("I am constructor with 1 String parameter");
	}
	
	//Having different type of parameter
	ConstructorOverloading(int num){
		System.out.println("i am constucotr with 1 int parameter");
	}
	
	
	
}
