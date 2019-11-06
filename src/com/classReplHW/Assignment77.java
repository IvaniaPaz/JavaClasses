package com.classReplHW;

import java.util.Scanner;

public class Assignment77 {

	public static void main(String[] args) {
		Scanner scan;
		scan=new Scanner(System.in);
		
		
		String[] arr= new String[7];
		
		for(int i=0; i<arr.length;i++) {
		System.out.println("Please enter "+(i+1)+" day of the week");	
		arr[i]=scan.next();
		}
		for(int i=0;i<7;i++) {
			System.out.println(arr[i]);
		}

	}
}
