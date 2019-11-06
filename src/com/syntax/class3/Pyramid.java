package com.syntax.class3;

public class Pyramid {

	public static void main(String[] args) {
		
		
		for(int row=1;row<=5;row++) {
//			System.out.println(row); /// this will print 1 to 5 in a separate line not necessarily printing out the pyramid
			
	for(int col=1;col<=row;col++) {		
		System.out.print(col*col);
	}
			
		System.out.println();	
		}

	}

}
