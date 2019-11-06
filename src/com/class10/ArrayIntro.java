package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		
		int a;
		a=10;
		
		int a1=10;
		
		//1st way
		int[] b; //declaring an array. 1st way (most preferred array)
		int c[]; // 2nd way
		
		b=new int[4]; //initializing value.. [4] <---4 elements (4 values)
		
		// 2nd way -- all in 1 line (declaration and initialization)
		int[] array=new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
	// how to access value from array
		System.out.println(array[2]);
		
		System.out.println("------------------------");
	// let's create an array that will store classes that we have
		
		String[] classes=new String[4];
		classes[0]="Java";
		classes[1]="SDLC";
		classes[2]="Manual testing";
		classes[3]="Git";
		// print "Today we have java class
		System.out.println("today we have "+classes[0]+" class!");
		
		System.out.println("---------------");
		
		int[] nums=new int[3];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		// how can i change 1 to 100
		
		System.out.println("---------------------------");
		
		nums[0]=100;
		System.out.println(nums[0]);
		System.out.println(nums[0]+nums[2]);
		
		System.out.println("------------------------");
		
		//the size of an array is fixed
		String[] names=new String[3];
		names[0]="Diana";
		names[1]="Seda";
		names[2]="Jaime";
		//names[3]="Olga"; during run time we will get an exception
		//ArrayIndexOutOfBoundsException
		
		System.out.println(names[0]);
		
		System.out.println("-----------------");
		//we are putting less elements inside, the compiler will give default values
		int[] numbers=new int[4];
		numbers[1]=100;
		numbers[3]=200;
		
		System.out.println(numbers[2]);
		
		System.out.println("--------------------");
		
		
		
		
		
		
		
		
		
		
	}

}
