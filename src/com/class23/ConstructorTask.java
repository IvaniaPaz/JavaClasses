package com.class23;

public class ConstructorTask {
	
	public static String breed;
	public String color;
	public char size;
	
  
	ConstructorTask(String dogColor, char dogSize){
		color=dogColor;
		size=dogSize;
		breed="Boxer";
	}
	
	public void getDog() {
		System.out.println("My dog Taz is a "+breed+" his colors is "+color+" and he's a "+size+" dog");
	}
	
	public static void main (String[]args) {
		ConstructorTask cTask1= new ConstructorTask("Brindel", 'M');
		cTask1.getDog();
	}
	

	

}
