package com.class07;

public class WhileLoop {

public static void main(String[] args) {
	
		int time=8;//first thing is to declare and initialize variable..
		
		if(time<12) {
			System.out.println("Good morning");// this code will execute only once
		}
	while(time<12) {//testing condition, if condition is true, it will execute
		System.out.println("Good morning");
		time++; // what does this do? we are adding 1 to it
	// this while code executes infinitely. Think of while loop as infinite loop
// why this while doesn't stop? it is because it's going in a loop
	// to stop this loop you need to use increment and decrement operator
// once your condition is false your code will stop executing if it is not true
// if you don't use the increment and decrement it will keep looping the condition
	}
}
}
