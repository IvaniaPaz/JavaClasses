package com.class07;

public class DoWhileLoop {

	public static void main(String[] args) {

// While loop we will use this condition the most!!!!
		int num=1;
		
		while(num<=7) {
			System.out.println("Hello");
			num++;
		}
		
		//^ this is while, just showing an example to see the difference with WHILE and DO WHILE. 

		// Do while: It is similar to while loop, we are preforming the action and ONLY then testing the condition
		//while the condition is true we go to our second while condition		
		//code will execute while condition is true, EVEN IF CONDITION IS FALSE CODE WILL GET EXECUTED AT LEAST ONCE.
		// with Do-while you will rarely used this condition on a basis.
		int num1=1;
		
		do { /// this will print b/c we have something to DO while compiler goes to test the condition
		System.out.println("Bye");
		num++;
		}while(num1<=7); 
	// for while part on do-while make sure that the while is outside of the do curly brackets
	

	
// print even numbers from 20 to 50 using do while

	int even=20;
	
	do {
		System.out.println(even);
		even+=2;
	}while(even<=50);
System.out.println("-------- second way--------");	
	//2 way
	int even1=20;
	
	do {
		if(even1%2==0) {
			System.out.println(even1);
		}
	even1++;
	}while(even1<=50);
	
 }
}