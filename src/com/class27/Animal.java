package com.class27;

public class Animal {
	public static void whoAmI() {
		System.out.println("I am an animal");
	}
}
class Monkey extends Animal{
	/*CANNOT override static methods with instance methods
	 *public void whoIAm() {} 
	 */
	public static void whoAmI() {
	System.out.println("I am a Monkey");
	/*We CANNOT override static methods.
	 * animal will print out not monkey
	 * Constructor CANNOT be inherited.
	 */
	}
}