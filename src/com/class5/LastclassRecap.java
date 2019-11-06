package com.class5;

public class LastclassRecap {

	public static void main(String[] args) {
	

		
 boolean isDisplayed=true;
 String buttonText="Sign in";

if (isDisplayed) {
	System.out.println("Button is displayed");
	
	if(buttonText.equals("Sign In")) {
		System.out.println("Test case pass");
	}else {
	System.out.println("Wrong text is displayed");
	}
}else {
	System.out.println("Button is not displayed");
  }
 }
}
