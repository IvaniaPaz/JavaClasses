package com.class10;

public class ArrayDemo {

	public static void main(String[] args) {
		//int[] nums=new int[ 2147483647]; // max number it can reach
		
		int[] nums=new int[4];
		nums[0]=12;
		nums[1]=13;
		nums[2]=14;
		nums[3]=15;
		// to find # of elements inside an array we use ".length" (property of an array)
		System.out.println(nums.length); // length will tell you how many elements you have
		
		System.out.println("-------------------------------------");
					//     0         1       2        3
		String[] array={"Winter" ,"Fall","Summer", "Spring"}; //we can specify values with curly brackets
	//print out "I was born in Summer
		
		System.out.println("I was born in "+array[2]);
		System.out.println(array.length);//1st way of finding out length of elements
		
		System.out.println("-------------------------------------");
		
		//2nd way of finding out length of elements
		int arraySize=array.length;
		System.out.println(arraySize);
		
		
	}

}
