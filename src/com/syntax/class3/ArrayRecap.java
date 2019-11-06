package com.syntax.class3;

public class ArrayRecap {

	public static void main(String[] args) {
		//funny way
		int a1=4;
		int a2=5;
		int a3=7;
		int a4=2;
		int a5=9;
		
		int sum=a1+a2+a3+a4+a5;
System.out.println("-------------------------------");
		//serious way
		
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
	
	System.out.println("-------------------------------");
	
	// serious way #2
	int[] b= {4,5,7,2,9} ;

	int sumB=0;
	for(int i=0; i<b.length;i++) {
		sumB=sumB+b[i];
	}
	System.out.println(sumB);
	
	
	//REVERSE ARRAY
	
		String[] animals= {"dog","cat","mouse","bird"};
		
		for(int i=animals.length-1;i>=0;i--) {
			System.out.println(animals[i]);
		}

	}

}
