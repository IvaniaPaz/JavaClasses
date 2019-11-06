package com.classReplHW;

import java.util.Scanner;

public class Assignment43 {

	public static void main(String[] args) {
		
		String carOrigin;
		Scanner scan;
		String make=null;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your favorite car make");
		make=scan.nextLine();
		
		switch(make) {
		
		case "BMW":
		carOrigin="german car";
		break;
		
		case "Toyota":
		carOrigin="german car";
		break;
		
		case "Maserati":
		carOrigin="italian car";
		break;
		
		default:
			carOrigin="unknown";
		}
		System.out.println("Your favorite car is "+carOrigin);
	}
}
