package com.class31_1;

public class MarksTest {

	public static void main(String[] args) {
		
		A a=new A(80,90,90);
		double average=a.getPercentage();
		System.out.println(average);
		
		B b=new B(90,90,80,90);
		double average1=b.getPercentage();
		System.out.println(average1);
	}

}
