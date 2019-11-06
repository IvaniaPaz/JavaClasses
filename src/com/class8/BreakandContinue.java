package com.class8;

public class BreakandContinue {

	public static void main(String[] args) {

		// break will be used within the if statement...only break loop.
		for (int i=0; i<10;i++) {
			if (i==7) {
				break;
			}
			System.out.println(i);
		}System.out.println("I am outside of the loop");
	System.out.println("---------------------------------------------------------");	
		for(int i=1; i<=5;i++){
			
			if(i==3) { // if you assign number to variable, it will skip/ignore that number and keep going 
			continue;
			}
			System.out.println(i);
		}
		System.out.println("--------------------------");
		//I want to print nums from 1 to 20 except 5,6,7
		//CONTINUE EXAMPLE
		// code needs to be all true if not, it will NOT execute the way we want it.
		for (int a=1; a<=20;a++) {
			if(a==5 || a==6 || a==7) {
			continue;
			}
			System.out.println(a);
			
	System.out.println("------------------------");
	/// BREAK EXAMPLE
	for (int b=1; b<=20;b++) {
		if(b==5 || b==6 || b==7) {
		break;
		}
		System.out.println(b);
	}
	}
		//ANOTHER WAY TO USE THIS WHILE USING AND OPERATOR... to skip the numbers between 5-7
		for (int c=1; c<=20;c++) {
			if(c>=5 && c<=7) {
			continue;
			}
			System.out.println(c);
	}
}
}