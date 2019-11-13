package com.class18;

public class Hello {
	
	
	
	public static void main(String[]args) {
		Hello obj=new Hello();
		obj.sayHello("Asel");
		obj.sayHello("Weqas");
		obj.sayHello("Diego");
		obj.sayHelloDifferentLanguage("USA");
		obj.sayHelloDifferentLanguage("China");
		obj.sayHelloDifferentLanguage("Russia");
System.out.println("--------------");			
		obj.sayNameAndAge("Ivania", 24);
		obj.sayNameAndAge("Victor", 26);
System.out.println("--------------");		
		obj.isSnowing(true);
		obj.isSnowing(false);
System.out.println("--------------");	
	}	
	
	void sayHello(String name) { //method header
		System.out.println("Hello "+name);//method body
	}
		/*Create a method that will say hello in different language based
		 * on the value that will be passed when user calls a method
		 */
	void sayHelloDifferentLanguage(String country) {	
		
		switch (country.toLowerCase()) {
		
		case "usa":
		System.out.println("Hello");
		break;
		
		case "russia":
		System.out.println("Privet");
		break;
		
		case "paraguay":
		System.out.println("Hola");
		break;
		
		case "albania":
		System.out.println("Pershendetje");
		break;
		
		default:
		System.out.println("I don't know how to say hello in any other language");
		}
	}
	
//Method to say name and age
	void sayNameAndAge(String name, int age) {
		System.out.println("My name is "+name+ " and I am "+ age+" years old");
	}
//to call method you would need to create an object

	/*Create method that will check if it's snowing
	 * if snow --> stay at home
	 * otherwise ---> go for a walk
	 */
	
	void isSnowing(boolean isSnowing) { //method header
		
		if(isSnowing) {//method body
			System.out.println("Stay at home");
		}else {
			System.out.println("Go for a walk");
		}
	}
	
}
