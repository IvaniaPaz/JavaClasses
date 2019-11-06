package com.class11;

public class TwoDArrayDemo2 {

	public static void main(String[] args) {

		
		String [][] names= {
				
				{"Khan", "Yousuf", "Alex", "Zynab"},	
				{"Mohammad", "Ann", "Naslyhan", "Weqas"},
				{"Diego", "Asif", "Zubair", "Shogofa"},	
				
		};
		
		int lengthofRows=names.length;   // this will give you the length of rows/array
		System.out.println(lengthofRows);
		
		int lengthofColumns=names[0].length; 
		System.out.println(lengthofColumns);
		
		for(String getArrays[]: names) {
			for(String getName: getArrays) {
				System.out.print(getName+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		

		
	}
}