package com.class23;

public class Task {

	Task(){
	System.out.println("I am a non argument constructor");
	}
	
	Task(String str){
		System.out.println("I am a parameter "+str);
	}
	
	public static void main(String []args) {
		Task obj=new Task ();
		Task obj1=new Task("constructor");
	}
}
