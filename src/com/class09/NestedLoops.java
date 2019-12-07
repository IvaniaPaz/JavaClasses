package com.class09;

public class NestedLoops {

	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
			for (int j = 0; j <= 5; j++) {
				System.out.println(j);
			}
		}
		
	System.out.println("--------------------------------------------------------");
	
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				System.out.println(i + " " + j);
			}
		}
	}
}