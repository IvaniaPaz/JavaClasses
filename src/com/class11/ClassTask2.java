package com.class11;

public class ClassTask2 {

	public static void main(String[] args) {

		// TASK 1

		int[][] numbers = {

				{ 2, 4, 6, 8 }, // 3 rows 4 columns
				{ 3, 6, 9, 12 },
				{ 4, 8, 12, 16 }, 
				};

		for (int getNums[] : numbers) {
			for (int getCol : getNums) {
				System.out.print(getCol + " ");
			}
			System.out.println();
		}
		int[][] nums = { 
				{ 1, 10, 9, 4, 5, 7, 9, 3 }, 
				{ 0, 12, 7, 9, 63, 4, 1, 3, 7 },
				{ 0, 14, 7, 8, 9, 4, 55, },
				{ 18, 7, 6, 5, 8, 9, 8, },

		};
		System.out.println("--------------------------------------");

		for (int Nums1[] : nums) {

			for (int Cols : Nums1) {
				System.out.print(Cols + " ");
			}
			System.out.println();
		}

		System.out.println("--------------------------------------");

		int[][] numbers1 = {
				{ 8, 7, 5, 3 }, 
				{ 1, 5, 6, 4 },
				{ 3, 6, 8, 1 },
				};
		
		// TASK 2: 1st of finding out the sum
		int sum = 0;

		for (int i = 0; i < numbers1.length; i++) {
			for (int j = 0; j < numbers1[i].length; j++) {
				System.out.println(numbers1[i][j] + " ");
				sum = sum + numbers1[i][j];
			}
			System.out.println();
		}
		System.out.println("The sum of all elements in the array is= " + sum);

		System.out.println("--------------------------------------");

		// TASK 2: 2nd way of finding out the sum
		int sum1 = 0;
		for (int nums2[] : numbers1) {

			for (int getNms : nums2) {
				sum1 = sum1 + getNms;
			}
		}
		System.out.println("The sum of all elements in the array is= " + sum1);
	}
}