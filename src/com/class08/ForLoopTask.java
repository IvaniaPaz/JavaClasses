package com.class08;

public class ForLoopTask {

	public static void main(String[] args) {
// print numbers from 1 to 100 in 1 line with space
// print numbers from 100 to 1
// print even numbers from 20 to 1 (2 ways)
// print odd numbers between 20 and (2 ways)
		
	for (int i=1; i<=100; i++) {
		System.out.println(i);
	}
	System.out.println("--------------");	
	for (int i=100; i>=1;i--) {	
		System.out.println(i);
	}
	System.out.println("---------------");
		
	for(int i=20; i>=1; i--) {
		if(i%2==0) {
			System.out.println(i);
		}
	}
	System.out.println("-------------------");
		
	for(int i=20; i>=1;i--) {
		if(i%2!=0) {
			System.out.println(i);
		}
	}	
	} 
}
