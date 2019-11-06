package com.syntax.class3;

public class TwoDArray {

	public static void main(String[] args) {
	
		//arrays you cannot change the size. the length doesn't change.
				int [][] b= {
						{7,3,5},
						{9,4,2},
						{8,1,0,3,4},
						{3,5,1},
						
				};
				
				System.out.println(b.length);
				System.out.println(b[0].length);
				System.out.println(b[2].length);
				
	
			        for (int i = 0; i < b.length; i++) {
			            for (int j = 0; j < b[i].length; j++) {
//			              if (j != 1 && (i != 1 && i != 3)) {
			                    System.out.print(b[i][j] + " ");
//			              }
			            }
			            System.out.println();
			        }
	}
}
