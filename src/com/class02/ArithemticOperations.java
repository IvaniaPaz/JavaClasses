package com.class02;

public class ArithemticOperations {
	public static void main(String[]args) {
		
//TASK
/*declare 2 variables and initialize them
 * Display result of addition, subraction, multiplication, and division
 */
	int num1, num2;
	num1=20;
	num2=10;
	
	System.out.println(num1+num2);
	System.out.println(num1-num2);
	System.out.println(num1*num2);
	System.out.println(num1/num2);
	
//How can we print the value of num1 and num2 together
// Answer: you can print it by using +","+ to display the comma once we print it
	System.out.println(num1+","+num2);
	
	int sum=num1+num2;
	System.out.print(sum);
	
	int sub=num1-num2;
	int mult=num1*num2;
	int div=num1/num2;
	System.out.println(sub);
	System.out.println(mult);
	System.out.println(div);

	
	System.out.println("The addition of 2 numbers is "+sum);
	System.out.println("The subraction of 2 numbers is "+sub);
	System.out.println("The multiplication of 2 numbers is "+mult);
	System.out.println("The division of 2 numbers is "+div);
	
	
	
	
	
	
	
	
	}

}
