package com.class22;

public class LocalVariables {

	public static void main(String[] args) {
		
		LocalVariables obj=new LocalVariables();
		obj.sayName();
System.out.println("----------------");
		String userEmail=obj.createEmail("John", "Smith", "outlook");
		System.out.println(userEmail);

	}
      void sayName() {
      String myName="John";
      System.out.println(myName);
 }
      String createEmail(String name, String lastname, String email) {
    	String userEmail=name+lastname+"@"+email+".com";
    	return userEmail;
      }
}
