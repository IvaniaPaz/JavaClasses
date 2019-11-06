package com.classReplHW;

public class Assignment74 {

	public static void main(String[] args) {
		//Write a program that creates an array of integers 
		//that stores the following values: 45,78, 12,  67, 55, 89, 23, 77, 88
		//Print only values that stored with even index including 0.
		//Output:
		//45 12 55 23 88 
		
		
		int[] values=new int[9];
		values[0]=45;	
		values[1]=78;				
		values[2]=12;		
		values[3]=67;		
		values[4]=55;		
		values[5]=89;		
		values[6]=23;		
		values[7]=77;		
		values[8]=88;		
		
	System.out.println(values[0]+" "+values[2]+" "+values[4]+" "+values[6]+" "+values[8]);
		
		

	}

}
