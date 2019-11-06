package com.class8;

public class ForLoopPractice {

	public static void main(String[] args) {

		int sum=0;
		
		for (int i=1; i<=5;i++) {
			sum=sum + 1;
			System.out.println(sum+ "+");
		}
		System.out.println();
		System.out.println(sum);
		
		System.out.println("-----------------");	
		
		int sumAll=0;
		
		for(int i=0; i<=20; i+=5) {
			sumAll=sumAll+i;
		}
		System.out.println(sumAll);
		
		System.out.println("---------------");
		
	}
}
