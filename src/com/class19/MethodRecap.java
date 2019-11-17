package com.class19;

public class MethodRecap {

	void methodName(String name) {//--> method header
	System.out.println("Hello "+name);
	}//--> method body 
	
	public static void main(String[] args) {
		MethodRecap obj=new MethodRecap ();
		obj.methodName("Anton");
		//"Anton" --> argument, value that we pass we call a method
	}

}
