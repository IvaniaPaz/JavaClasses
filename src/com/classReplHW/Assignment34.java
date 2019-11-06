package com.classReplHW;

public class Assignment34 {

	public static void main(String[] args) {
	/*For you to do:  
	 * Declare 4 int variables a, b, c and d.
	 * Your variable c is the result of addition of a & b. 
	 * Variables a & b should be more than d, and c should be more than d. 
	 * Output: 
	 * true
	 * true
	 * Hint: you have 2 outputs meaning you need to have 2 printing statements
	 */

	int a, b, c, d;
	a=24;
	b=15;
	c=a+b;
	d=10;
	
	if (a>d && b>d) {
		System.out.println("True");
	if (c>d) {
		System.out.println("True");
	}
	}else {
		System.out.println("Invalid");
	}
	
		
		
		
		
		
		
	}
}
