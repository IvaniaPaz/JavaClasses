package com.class29;

public class Main extends Parent1{
	  public void m1(){
		    System.out.println("abstract method1 implementation without argument in main class");
	  }
		  
		  public void m2(int num){
		    System.out.println("abstract method2 implementation with argument in main class");
		  }
		  
		  
		  public static void main(String[] args) {
		    Parent1 obj= new Main();
		    obj.m1();
		    obj.m2(10);
		  }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  

}
