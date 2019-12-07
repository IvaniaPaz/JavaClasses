package com.classHW;

public class Main2 {

	public static void hello() {
		System.out.println("method without parameter");
	}

	public static void hello(int num) {
		System.out.println("method with parameter");
	}

	public static void main(String[] args) {
		Main2 obj=new Main2();
		obj.hello();
		obj.hello(10);
	}

}
