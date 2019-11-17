package com.class19;

public class Task {
	
//TASK 1
	
	String createEmail(String userName,String lastName, String emailType) {
		String createEmail=(userName+lastName+emailType);
		return createEmail;
	}
public static void main(String[]args) {
	Task res=new Task();
String emailAddress=res.createEmail("ivania", "paz", "@hotmail.com");
System.out.println(emailAddress);
	
}
}
