package com.class20;

public class MySonMath {
	public String name;
	String phone;
	private String SSN;
	protected String birthday;
	
	public void add1() {
		int num1=2;
		int num2=1;
		int result=num1+num2;
	}
	
	void add2(int num1,int num2) {
		int result=num1+num2;
	}

	protected int add3() {
		int num1=4;
		int num2=2;
		int result=num1+num2;
		return result;
	}
	
	protected int add4(int num1, int num2) {
		int result=num1+num2;
		return result;
	}
	private void add5() {
		int result=6;
	}
	
}
