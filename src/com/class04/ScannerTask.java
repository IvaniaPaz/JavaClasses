package com.class04;

import java.util.Scanner;

public class ScannerTask {

	public static void main(String[] args) {
	
	Scanner specialist=new Scanner(System.in);
	System.out.println("What is the amount of loan needed");
	int num=specialist.nextInt();
	
	if(num<200000) {
System.out.println("Lend money");
	}else {
System.out.println("Reject money");
	}

//TASK2	
	
	Scanner dmv=new Scanner(System.in);
	System.out.println("Sir, What is your age?");
	int num1=dmv.nextInt();
	
	if(num1>=18) {
System.out.println("Perfect!I'll go ahead and issue you a Driver's license");
	}else {
System.out.println("Looks like you will need to be issued a Learner's permit");
	}
	
	
	
	
	
	
	}
}
