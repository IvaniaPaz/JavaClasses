package com.class28;

public class UserClass {
	String name, mobileNumber;
	
	UserClass(String name,String mobileNumber){
		this.name=name;
		this.mobileNumber=mobileNumber;
	}

}
class UserInfo extends UserClass{
	String address;
	UserInfo(String name, String mobileNumber, String address){
		super(name,mobileNumber);
		this.address=address;
	}
	public void userDetail() {
		System.out.println(name+" "+mobileNumber+" "+address);
	}
}