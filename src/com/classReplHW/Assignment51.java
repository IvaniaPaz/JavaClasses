package com.classReplHW;

public class Assignment51 {

	public static void main(String[] args) {
//		Create a while loops that prints out even numbers from 1 to 13
//		Must not include the number 13 in the output 
//		Increment by 1 - example(a++)
		
		int a=1;
		
		while(a<=12) {
			if(a%2==0) {
				System.out.println(a);
			}
			a++;
	  }
		
		System.out.println();
	}

}
