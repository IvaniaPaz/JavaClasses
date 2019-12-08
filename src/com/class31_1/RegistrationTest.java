package com.class31_1;

public class RegistrationTest {

	public static void main(String[] args) {
		Registration reg=new Registration();
		reg.setEmail("Ivaniapaz@gmail");
		reg.setUsername("Ivania13!");
		reg.setPassword("Ivypaz13!");
		
//		String e=reg.getEmail();
//		String un=reg.getUsername();
//		String p=reg.getUsername();
//		
		System.out.println("email is "+reg.getEmail());
		System.out.println("username is "+reg.getUsername());
		System.out.println("password is "+reg.getPassword());
	}

}
