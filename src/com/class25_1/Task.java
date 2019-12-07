package com.class25_1;

public class Task {
	
	/*Create 1 class in which create a methods that will calculate the volume (area) of 
	 * Rectangle
	 * Square
	 * Box
	 * Use separate classes to test your code
	 */
	
	public void area(int l, int w) {
		System.out.println("The are of a Rectangle is "+(l*w));
		
	}
	public void area(int a) {
		System.out.println("The area of a Square is "+(a*a));
		
	}
	public void area(int l, int w, int h) {
		System.out.println("The volume of a Box is "+(l*w*h));
		
	}

}
