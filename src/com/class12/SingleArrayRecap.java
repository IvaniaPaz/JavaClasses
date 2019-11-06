package com.class12;

public class SingleArrayRecap {

	public static void main(String[] args) {
//ALL OF THESE CONDITIONS ARE FOLLOWING THIS LIST OF ARRAYS
		int[] array1=new int[4];

		array1[0]=12;
		array1[1]=13;
		array1[2]=14;
		array1[3]=14;
	//how to retrieve values from array
	//	System.out.println(array1[1]);
		
		int num1=0;    //how to find the sum 
		for(int s=0;s<4;s++) {
			num1=num1+array1[s];
		}System.out.println("The sum of Array1 is= "+num1);
		
		System.out.println("=======================");
		
		int[]array2= {2,5,4,7};  // you don't have to provide size(index) this is to print out the values of the index
		for(int i: array2) {
			System.out.println(i);
		}
		System.out.println("=======================");
		//you can use i<array1.length OR i<4 to get the index number 
		for(int i=0; i<array1.length;i++) {  //int variable gives you the values
			System.out.println(array1[i]);
		}
	//for each loop 
		
	//for each loop does: which array you want me to give you the values? traverse it
	
		System.out.println("========================");
		
		
		for(int i:array1) {
			System.out.println(i); //all you need to do for this 
		}
		
		
		
		
	}
}