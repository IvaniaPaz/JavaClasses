package com.classReplHW;

public class Assignment62 {

	public static void main(String[] args) {
//		For you to do: 
//			Write a program that use for loop to prints multiples of 3 between 1 and 20 on one line.
//			Must not include the number 20 in the output 
//			Hint :
//			3*1=3 
//			3*2=6
//			3*3=9
//			3*4=12
//			3*5=15
//			3*6=18
//			Output:
//			3 6 9 12 15 18

		int sum=3;
		for(int a=1; a<=20;a++) {
			if(a%3==0) {
			sum=sum*a;
			System.out.print(" "+a);
			}
		}
	}

}
