package com.syntax.class3;

public class Max2DArray {

	public static void main(String[] args) {
		
	int [][] b= {
			{7,3,5},
			{2,4,7},
			{8,1,9},
			{3,5,1},
	};	
	
//int max=Integer.MIN_VALUE;
	
		int max=b[0][0];
		
		for (int i=0; i<b.length;i++) {
			for(int k=0; k<b[i].length;k++) {
				if(b[i][k]>max) {
					max=b[i][k];
				}
			}
		}System.out.println("Maximum is "+max);
}
}