package com.class12;

public class Array2DRecap {

	public static void main(String[] args) {
		
		
		int [][] array1=new int [2][3];
		
//first row of array		
		array1[0][0]=9;		
		array1[0][1]=10;
		array1[0][2]=11;
		
//Second row of array		
		array1[1][0]=9;
		array1[1][1]=10;
		array1[1][2]=11;
		
		for(int i[]:array1) { // you specify that this is an array
			
			for(int j: i) { // i has all the access to the rows that why we are printing it
	System.out.println(j);		
			}
		}
		
		System.out.println("===================");
		
		int[][] array2= {
				{44,55,67}, //2rows 3columns
				{11,22,33},
				
		}; //initialize, store values
		
		for (int[] is: array2) {
			for(int is2:is) {
				System.out.println(is2);// prints out all the values
			}
		}
	}

}
