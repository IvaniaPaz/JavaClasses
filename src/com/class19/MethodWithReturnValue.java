package com.class19;

public class MethodWithReturnValue {

	public static void main(String[] args) {
		/*Create a String 		 
		 * IF String has more than 10 characters ---> String is large
		 * otherwise---> String is small 
		 */
		String str="Welcome home";
		int numofChars=str.length();
		if (numofChars>=10) {
			System.out.println("String is large");
		}else {
			System.out.println("String is small");
		}
		
		char character=str.charAt(4);
		System.out.println(character);
		
	MethodWithReturnValue obj=new MethodWithReturnValue();
//	int num=obj.sum(10,30); compile error saying change return type
	int sum=obj.sum(50, 50);
	System.out.println(sum);
	
	int Large=obj.findLargest(20, 40);
	System.out.println(Large);
	
	}
   //we specify return type here, method name (list of parameters)
	int sum(int num1, int num2) { //---> first part outside curly bracket is your method header
	int c=num1+num2; //---> inside the curly bracket is your method body
	return c;
}
	
	//method find largest number
	int findLargest(int num1, int num2){
		
		int largest;
		if(num1>num2) {
			largest=num1;
		}else {
			largest=num2;
		}
		return largest;
	}
	
	
	
}
