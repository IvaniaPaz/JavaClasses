package com.class32;

public class Recap {
	
	
	public static void main(String[] args) {
		
	
	
	/*To store single value
	 */

	int num1=10;
	
	/*To store multiple values
	 */
	
	int [] arrat= {10,20,30};
	
	// OR
	
	int [] arr=new int[2];
	arr[0]=100;
	arr[1]=200;
	arr[2]=300;
	System.out.println(arr[2]);
	
	
	/*To retrieve all values 1 by 1
	 * using enhanced loop
	 */
	
	for(int num:arr) {
	System.out.println(num);
	}
	
	
	/*using for loop
	 */
	
	for (int i=0; i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	
	/*We can store non primitive types: Objects
	 */
	Fruit f=new Apple();
	Fruit f1=new Orange();
	Object f2=new Banana();
	Object monkey=new Monkey();
	
	Object[] mixArray= {f,f1,f2, monkey, "hello",12,10.2,'A'}; //using object we can store different types 
	for (Object fr:mixArray) {
		
	}
	
	
	}
}
class Monkey extends Object{ //<-- this happens automatically extending object
	
}
class Fruit{
	
}
class Apple extends Fruit{
	
}
class Orange extends Fruit{
	
}
class Banana extends Fruit{
	
}