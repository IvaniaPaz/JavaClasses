package com.classReplHW;

public class Assignment55 {

	public static void main(String[] args) {
//		Create a do while loop that prints out numbers from 10 to 20
//		Must not include the number 20 in the output 
//		Increment by 1 within the do example:
//		do  {
//		a++;
//		 }
//		Output:
//		10
//		11
//		12
//		13
//		14
//		15
//		16
//		17
//		18
//		19
		int a=10;
		
		do {
			if(a%1==0) {
				System.out.println(a);
			}
		a++;
		}while(!(a<20));
		a--;
	 }
	}
