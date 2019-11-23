package com.class24;

public class ThisWithConstructor {
	
	public ThisWithConstructor() {
		System.out.println("Non argument constructor");
	}
	
	ThisWithConstructor(String str){
		this();// this is passing no argument since parenthesis is empty, so it finds construc method w/ no argum
		System.out.println("Constructor with 1 String parameter");
	}
	
	ThisWithConstructor(String str, String st1){
		this(str);// you can also use a string as well like "hello"
	System.out.println("Constructor with 2 parameters ");	
	}
	public static void main(String[] args) {
		ThisWithConstructor obj=new ThisWithConstructor("Hello");
		
/*Can we execute 2 constructors when creating an object? 
 * Yes. It can be achieved using this()
 * this() is used to call current class constructors
 * it is called CONSTRUCTOR CHANGING
 * this() ALWAYS MUST BE A FIRST STATEMENT INSIDE METHOD
 * 
  */
		ThisWithConstructor obj1=new ThisWithConstructor("Hello", "Bye");
		
		
		
		
	}
}
