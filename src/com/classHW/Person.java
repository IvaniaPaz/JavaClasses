package com.classHW;

public class Person {
	
	  public String name;
	  public String lastName;
	  public int age;
	  
	  public void personOne() {
		System.out.print(name+" "+lastName+" "+age+" ");
	  }
	  
	
	  public static void main(String[] args) {
		 Employee e1= new Employee();
			e1.name="John";
			e1.lastName="Smith";
			e1.age=35;
			e1.salary=35000;
			e1.personOne();
			e1.employee1();
	
	}
}
