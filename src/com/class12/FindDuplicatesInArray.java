package com.class12;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
	// this will be in the interview
		int [] array2= {2,5,4,7,2};
		
		for(int i=0; i<array2.length;i++) {
			for(int j=i+1;j<array2.length;j++) {  //i gives you 0, 
				if(array2[i]==array2[j]) {								// this loop will run 5 times bc you have 5 index
			System.out.println(array2[j]);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}