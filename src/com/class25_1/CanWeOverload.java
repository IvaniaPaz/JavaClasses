package com.class25_1;

public class CanWeOverload {
	
// Can we overload a private method? -Yes
	
	private void methodOne() {
	System.out.println("I am method one");
	}
	private void methodOne(String str) {
	System.out.println("I am method one with "+str);
	}

// Can we overload a main method? - Yes
// Can we overload a static method? - Yes
// Can we overload a private method? - Yes
// just as long as you are changing parameter or type of parameter
		
	public static void main(String str) {
		System.out.println("I am main method with String arguments");
	}	
		
	public static void main(String str, String[]args) {	
		System.out.println("I am main method with 2 parameters");
	}
		
	public static void main (String []args) {
		System.out.println("I am a main method with String array");
		main("String"); // method can be used by calling it 
		String []array= {"A","B"};
		main("Hello",array);
	}
		
}
