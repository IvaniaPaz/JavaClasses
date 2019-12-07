package com.class26;

public class Degree {

	public void getDegree(){
		System.out.println("Hi Dennis was here");
	}
	
}
class Undergraduate extends Degree{

	public void getDegree(){
		System.out.println("I messed with your code");
	}
}
class Postgraduate extends Degree{

	public void getDegree(){
		System.out.println("I'm sorry but, not really");
	}
}