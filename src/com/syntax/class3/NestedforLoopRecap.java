package com.syntax.class3;

public class NestedforLoopRecap {

	public static void main(String[] args) {

//		for (int i = 1; i <= 4; i++) {
//			for (int l = 1; l <= 6; l++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		
//
//		}

//		for (int i = 1; i <= 4; i++) {
//
//			for (int l = 1; l <= 6; l++) {
//				System.out.print("*");
//			}
//			System.out.println();
//
//		}

		
		
		for(int floor=1;floor<=4;floor++) {
			System.out.println("Floor"+floor+"--->");
			
			for(int room=1;room<=6;room++) {
				System.out.println(floor+"."+room+" ");
			}
			System.out.println();
			
		}
		
		
		 
		
		
	}

}
