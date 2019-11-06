package com.classReplHW;

public class Assignment86 {

	public static void main(String[] args) {
//		For you to do:
//			Write a program that  takes a 2-D array and prints the sums of the rows as an integer array.
//
//			For example, the if we run rowSums for the following 2D array:
		int[][] a ={
			  {1,1,2}, //sum = 4
			  {3,1,2}, //sum = 6
			  {3,5,3}, //sum = 11
			  {0,1,2},  //sum = 3
			};
		
		int sum=0;
		int sum1=0;
		int sum2=0;
		int sum3=0;
		
		for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			
			if(i==0) {
			sum+=a[i][j];
			}if(i==1) {
			sum1+=a[i][j];
			}if(i==2) {
			sum2+=a[i][j];
			}if(i==3) {
			sum3+=a[i][j];
			}
			}
		}	
		int[] col= {sum,sum1,sum2,sum3};	
		for(int i=0;i<col.length;i++) {
		System.out.println(col[i]+" ");
		}
			
		
		
		
		

	}

}
