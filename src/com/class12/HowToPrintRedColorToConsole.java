package com.class12;

public class HowToPrintRedColorToConsole {

	public static void main(String[] args) {
		
	//if something is wrong and complier is giving you an exception you can System.err.println();
   // just to change color when you know it is wrong. 
		
		int a=2;
		
		if(a==20) {
			System.out.println("Number is "+a);
		}else {
			System.err.println("Number is not 20 but is "+a);
		}
		

	}

}
