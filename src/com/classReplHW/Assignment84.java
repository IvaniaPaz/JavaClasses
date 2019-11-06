package com.classReplHW;

public class Assignment84 {

	public static void main(String[] args) {

		int[][] a = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};
     int max=a[0][0];
		
		for (int i=0; i<a.length;i++) {
			for(int k=0; k<a[i].length;k++) {
				if(a[i][k]>max) {
					max=a[i][k];
				}
			}
		}System.out.println(max);
}
	}

