package com.class27;

public class Examples {
	
	public String helloName(String str) {
		return str;//overridden method
	}
	public String helloName(String str1, String str2) {
		return str1+" "+str2; //overloading same class same method name
	}
}
class smallExamples extends Examples{
	public String helloName(String str) {
		return "Hello "+str; //overriding method
	}
}