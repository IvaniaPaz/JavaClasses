package com.class5;

import java.util.Scanner;

// to import shortcut is crtl+shirt+0
public class MoreLogicalExamples {

	public static void main(String[] args) {
	
		Scanner scan;
		double salesAmount;
		double commission;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your sales amount");
		salesAmount=scan.nextDouble();
		
		if (salesAmount>=1 && salesAmount<100) {
	// let's give user 10% commission of sale
		commission=salesAmount*0.1;
		}else if(salesAmount>=100 && salesAmount<200) {
	// let's give user 20% commission of sale
		commission =salesAmount*0.2;
		}else if (salesAmount>200 && salesAmount<500) {
	// let's give user 30% commission of sale
		commission=salesAmount*0.3;
		}else if(salesAmount>=500) {
	//let's give user 50% commission of sale
		commission =salesAmount*0.5;
		}else {
		commission=0;
		}
		System.out.println("Based on the sales of your commission "+commission);
	}

}
