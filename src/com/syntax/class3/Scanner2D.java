package com.syntax.class3;

import java.util.Scanner;

public class Scanner2D {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Body, how many rows?");
				int rows=scan.nextInt();
		System.out.println("How many cols do you want?");
		
		int cols=scan.nextInt();
		
//		System.out.println("Your array will have "+rows+cols+"colums");
		
	String[][] names =new String[rows][cols];	
		//names.length=rows
		// names[0].length=cols
		//entering into array
	System.out.println("Body, enter a name!");
		for(int i=0;i<rows;i++) { //this for is for rows
			for(int j=0; j<cols;j++) { // this for is columns
				//System.out.println("Body, we're at row index!"+);
				
				if(j !=1) {
					names[i][j]=scan.next();	
				}else {
					scan.next();
				}
				
			}
		}
		
		System.out.println("Let's print the names!");
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(names[i][j]+" ");
			}
		}System.out.println();
		
		
		
	}

}
