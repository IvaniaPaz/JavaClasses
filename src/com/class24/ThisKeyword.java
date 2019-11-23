package com.class24;

public class ThisKeyword {

	int a, b;

	public ThisKeyword(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public ThisKeyword() {
		System.out.println("I am a non argument constructor");
	}

	public void sum(int a, int b) {
		System.out.println("The sum of local parameters is " + (a + b));
		System.out.println("The sum of instance variables is " + (this.a + this.b));
	}
	
	public void sayA() {
		System.out.println(a);
	}
	public void sayB() {
		System.out.println(b);
	}

	public void sayAandB() {
		this.sayA();// not necessary to use this keyword since complier will default add it w/o us seeing it
		sayB(); //complier add this keyword automatically--->this.sayB();
//inside your method body you can make a call 
	}
	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword(5, 10);
		obj.sum(10, 20);
		obj.sayAandB();
		obj.sayA();
		obj.sayB();

		ThisKeyword obj1 = new ThisKeyword();
		obj1.sum(100, 200);
	}

}
