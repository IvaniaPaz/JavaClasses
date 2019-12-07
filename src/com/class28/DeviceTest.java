package com.class28;

public class DeviceTest {

	public static void main(String[] args) {
		Apple app= new Apple("iPhone","11Pro");
		System.out.println(app.deviceType);
		
		Apple app1=new Apple("iPad","12Pro");
		System.out.println(app1.deviceType);
	}

}
