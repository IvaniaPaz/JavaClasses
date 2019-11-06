package com.classReplHW;

import java.util.Scanner;

public class Assignment39 {

	public static void main(String[] args) {

		String instructor, teach;
		Scanner scan;

		scan = new Scanner(System.in);
		System.out.println("Enter name of the instructor");
		instructor = scan.nextLine();

		switch (instructor) {

		case "Shiva":
			teach = "Will take care of Java Assignment";
			break;

		case "Sandish":
			teach = "Will take care of SDLC Assignment";
			break;

		case "Weqas":
			teach = "Will take care of Selenium Assignment";
			break;

		case "Asel":
			teach = "Will take care of every Assignment";
			break;

		default:
			teach = "Invalid instructor selected";

		}
		System.out.println(teach);
	}
}
