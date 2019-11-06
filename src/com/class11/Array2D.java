package com.class11;

public class Array2D {

	public static void main(String[] args) {
// they are fixed, meaning that is the only value, you can't change it
		//Array is a class. 
		
	//when the first letter is capitalized it is considered a class
	//compile time - happens before you run a code
	// run time error - gives you an error after.
	//exception =error
	//
		
		
		
		// Declare 2D Arrays

		int[][] array = new int[3][4];

		// 1st row

		array[0][0] = 44;
		array[0][1] = 80;
		array[0][2] = 33;
		array[0][3] = 20;

		// 2nd row
//	array [first row][first colum]=;
		array[1][0] = 10;
		array[1][1] = 2;
		array[1][2] = 7;
		array[1][3] = 8;

// 3rd row

		array[2][0] = 10;
		array[2][1] = 9;
		array[2][2] = 70;
		array[2][3] = 8;

		System.out.println(array[1][3]); // specify row and col

//TASK 
		/*
		 * Create 2D array of string with 2 rows and three columns
		 */

		String[][] colors = new String[2][3];

		colors[0][0] = "Pink";
		colors[0][1] = "Blue";
		colors[0][2] = "Black";

		colors[1][0] = "Yellow";
		colors[1][1] = "Green";
		colors[1][2] = "Orange";

		System.out.println(colors[0][0]);

		System.out.println("**************************************");
		int[][] numbers = {

				{ 8, 7, 5, 3, 8 }, // 3 rows 5 columns
				{ 1, 5, 6, 4, 9 }, 
				{ 3, 6, 8, 0, 7 }, 
				};

		// System.out.println(numbers [1][4]);

		// to identify numbers of rows
		System.out.println("The numbers of rows are:= " + numbers.length);

		// to identify numbers of columns/elements in that row
		System.out.println("The numbers of columns are:= " + numbers[1].length);
System.out.println("-----------------------------------");
System.out.println();

//how to print like the what we have under numbers

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) { // how to use for statement to columns
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
	}
}
