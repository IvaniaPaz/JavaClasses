package com.class24_1;

public class Main{ 
	  

	public static void main(String[] args) {
	
		Car obj=new Car("Toyota","Prius",4,120,30000.0);
		 obj.displayMethods();
		 
		 Car obj1=new Car("Toyota","Prius",4,120,30000.0);
		 obj1.displayMethods();
		
		Car obj2=new Car("uknown","unknown",4,120,30000.0);
		 obj2.displayMethods();	
		 
		 Car obj3=new Car("Toyota","Prius",4,90,0.0);
		 obj3.displayMethods();

	}

}
