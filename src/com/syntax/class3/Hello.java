package com.syntax.class3;

public class Hello {

	public static void main(String[] args) {
		int[] a= new int [5]; // we dont have to put them in order we just need to start by 0. ALWAYS
		a[2]=7;
		a[4]=9;
		a[0]=4;
		a[1]=5;
		a[3]=2;
		
		int sumA=0;
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
			sumA=sumA+a[i]; /// a[i] <-- would be the number printed in the loop 
		}
		System.out.println();
		System.out.println(sumA);
	
	
	}

	
}
