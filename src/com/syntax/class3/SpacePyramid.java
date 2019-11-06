package com.syntax.class3;

public class SpacePyramid {

	public static void main(String[] args) {
		// 1
		//12
		//123
		//1234
		//12345
		
	// on our assignment	
		 	
		for(int b=1;b<=5;b++) {
			
			for(int j=5-b;j>=1;j--) {
				System.out.print(" ");
			}
			for(int m=1;m<=b;m++) {
				System.out.print(m);
			}
			System.out.println();
			
		}

	}

}
