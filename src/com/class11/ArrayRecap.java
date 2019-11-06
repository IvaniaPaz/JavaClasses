package com.class11;

public class ArrayRecap {

	public static void main(String[] args) {

		// this is all a single dimension

		int num1 = 12;
		int num2 = 14;
		int num3 = 16;

		// int num4=13; num5=50; num6=33;
		int a, b, c, d;

		a = 12;
		b = 1;
		c = 89;
		d = 11;

		// Array declaration:

		int[] h = new int[3];
		int e[]; // one way to declare array
		int[] y, u; // second way to declare array

		// int y[],u; this will give an error because the complier switch the u as a int
		// not an array

		y = new int[3];
		u = new int[2]; // creating an objecting, giving the size of element

		int[] array = new int[6];

		int[] numbersList = { 2, 3, 5, 7 }; // this is the simplest way of array, we will use this more frequently.
		System.out.println(numbersList[2]);

		// System.out.println(arr);
		// complier won't give you an error but when you run it,
		// it will give an error b/c you created the container and inside the container
		// you have 4 index numbers,
		// complier will NOT print all numbers. We need the reference of each number,
		// there is a way to print all numbers
		// just not like this, not this way. It'll be in a String format.

		for (int i = 0; i < numbersList.length; i++) { // for ctrl space to print out the format of a FOR
			System.out.println(numbersList[i]);
		}
	
		for (int element:numbersList) { // this will print all values on the list
			System.out.println(element);
		}
		
		
		

	}

}
