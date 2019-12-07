package com.class24_1;

public class SyntaxTechnologies {
	
	public String schoolName, lastDayOfClass, year;
	public int batch;

	SyntaxTechnologies(){
	    System.out.println(schoolName+" "+batch+" "+lastDayOfClass+" "+year);
	  }

	SyntaxTechnologies(String str,int num, String y,String date){
	    schoolName=str;
	    lastDayOfClass=date;
	    year=y;
	    batch=num; 
	}
	
	public void displaySchool(){
	    System.out.println(schoolName+" "+batch+" "+lastDayOfClass+" "+year);
	  }
}
