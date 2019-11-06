package com.class10;

public class ArrayLesson2 {

	public static void main(String[] args) {
//		  element/index    0    1     2   3     4    5
			double grades[]= {96.5,98.7,99.3,88.4,88.6,99.9};
			double max;
			
			int i;
			
			max=grades[0];
			
			for (i=0; i<=5; i++) {
				if(grades[i]> max) max=grades[i];
			}
			System.out.println("The max grade in the class is "+max);

	}

}
