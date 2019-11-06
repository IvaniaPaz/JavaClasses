package com.class2;

public class MathTask {
	
	public static void main (String[]args) {
		
		//TASK1
//write a java program to add, subtract, multiply, and divide 2 decimal values.Your program should say..
// "The ____ of 2 numbers ___ and ____ is equal to ____"
		
		double num1,num2;
		num1=1.9;
		num2=10.5;
	
		double add=num1+num2;
		double sub=num1-num2;
		double multi=num1*num2;
		double div=num1/num2;
		
		System.out.println("The addition of 2 numbers "+num1+" and "+num2+" is equal to "+add); 
		System.out.println("The subraction of 2 numbers "+num1+" and "+num2+" is equal to "+sub);
		System.out.println("The multiplication of 2 numbers "+num1+" and "+num2+" is equal to "+multi);
		System.out.println("The division of 2 numbers "+num1+" and "+num2+" is equal to "+div);
		
		//TASK2
// Write a program to find the square of the number 3.9 Your program should say"The square of the __ is ___"
		
		float num3=3.9f;
		float name=num3*num3;
		System.out.println("The square of the "+num3+ " is "+name);
		
		//TASK3
//Write a program to print the area and perimeter of a rectangle with width=5 and height=8. 
// Your program should say"The perimeter of a rectangle with width_ and height_ is equal to_ and the area is_"
		
		int width=5;
		int height=8;
		
		int area=width*height;
		int perimeter=2*(width+height);
	
		
// TWO WAYS TO PRINT OUT THE ANSWER:
// #1
    System.out.println("The perimeter of rectangle with width "+width+" and height "+height+" is equal to "+perimeter+" and the area is "+area);
// #2
    String message="The perimeter of rectangle with width "+width+" and height "+height+" is equal to "+perimeter+" and the area is "+area;
        
    System.out.println(message);
		
		
		
		
		float ed=8.2f;
		float dog=ed*ed;
		
		System.out.println("The multiplication of "+ed+" value with itself is equal to "+dog);
		
		
		int myNumber=13;
	    
	    int stepOne=myNumber*myNumber;
	    
	    int stepTwo=stepOne+myNumber;
	    
	    int stepThree=stepTwo/myNumber;
	    
	    int stepFour=stepThree+17;
	    
	    int stepSix=stepFour/6;
	    
	    System.out.println("The magic number is "+stepSix);
		
		
		
	}

}
