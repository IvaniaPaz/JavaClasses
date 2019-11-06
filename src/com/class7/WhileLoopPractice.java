package com.class7;

public class WhileLoopPractice {
	
public static void main(String[] args) {
		
		int i=1;
		
		while(i<=20){
			System.out.println(i);
			i++;
		}
	
// I want to print numbers from 10-30 all in 1 line
	int a=10;
	
	while(a>=1) {
		System.out.println(a);
		a--;
	}
// Print values from 50 to 20
	
	int v=50;
	
	while(v>=20) {
		System.out.println(v);
		v--;
	}
System.out.println("-------------------------------");
// I want to print all even numbers from 1 to 20
// 2 ways to get the answer

// first example is to increment value by 2	
	int z=2;
	
	while(z<=20) {
		System.out.println(z);
		z+=2;
	}
// second example using modulus remainder
	
	int q=1;
	
	while(q<=20) {
		if(q%2==0) {
			System.out.println(q);
		}
		q++;
  }
	
	System.out.println();
// print only odd numbers from 50 to 100
// print only even number from 100 to 1
	
	int w=100;
	
	while(w>=1) {
		if(w%2==0) {
		System.out.println(w);
		}
		z--;
	}
	
	
 }

}
