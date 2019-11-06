package com.classReplHW;

public class Assignment85 {

	public static void main(String[] args) {
		
		int[][] a = {
	            {1,1,1},
	            {1,1,1},
	            {1,1,1}
	        };

		boolean same=true;
		
		for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {	
			
		if(a.length!=a[i].length) {	
			same=false;
			break;
		}
        }
		}
		System.out.println(same);

	}
}