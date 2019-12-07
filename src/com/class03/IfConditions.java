package com.class03;

public class IfConditions {

	public static void main(String[] args) {
	
		int a=90;
		int b=30;
		// if number is 'A' bigger than number 'B'
		// i want to print a is larger than b
			
		if (a>b) {
		System.out.println("a is larger than b");
		// when it is true it will include the open and close door,
		//when it is false it will skip the line and not print anything 
		}else {
			System.out.println("a is smaller than b");
		}
		
		int expectedHours=15;
		int actualHours=2;
// if actual hours are more than expected ---> you will succeed
// otherwise, please study more

		if (actualHours>expectedHours) {
		System.out.println("you will succeed");
		}else {
			System.out.println("please study more");
		}
		
		double teaPrice=4.99;
		double allowedPrice=5.99;
		//teaPrice-=2;//2.99=4.99-2
//if price is more than i can afford i will NOT buy
// if price is less or matches what i can afford then i will buy
		if  (allowedPrice>=teaPrice) {
		System.out.println("I will buy tea");
	}else {
		System.out.println("I cannot afford, I need to study more");
	}
}

}
	