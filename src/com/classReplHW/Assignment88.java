package com.classReplHW;

public class Assignment88 {

	public static void main(String[] args) {
//		For you to do:
//		Write a program that will print the sum of all elements in column with index 1 in a 2-D int array.
//      should print -9
		
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}
			};
			
		    int sum=-0;
		    
		    for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				
				if(i==0) {
				sum+=a[i][j];
				}
				}
			}	
			int[] col= {sum};	
			for(int i=0;i<col.length;i++) {
			System.out.println(col[i]+" ");
			}			
}

}
