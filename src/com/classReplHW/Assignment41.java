package com.classReplHW;

import java.util.Scanner;

public class Assignment41 {

	public static void main(String[] args) {

		String name;
		int num;
		Scanner scan;

		scan = new Scanner(System.in);
		System.out.println("Enter the roll number of the Child");
		num = scan.nextInt();

		switch (num) {

		case 101:
			name = "Studen name:Ramesh";
			break;

		case 102:
			name = "Student name:Mahesh";
			break;

		case 103:
			name = "Student name:Mukesh";
			break;

		default:
			name = "Not found Student name:in Class";

		}
		System.out.println(name);
	}

}
