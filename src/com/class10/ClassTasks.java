package com.class10;

public class ClassTasks {

	public static void main(String[] args) {

		/*Create an array of chars and store grades into it:A,B,C,D,E,F
		 * Then print grade B (use 2 different ways of creating an array)
		 */
//TASK 1
		char [] grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
	
		//System.out.println(grade[1]);
	
	char[] grade1= {'A','B','C','D','E','F'};
	System.out.println(grade1[1]);
	int i;
	for(i=1;i<grade.length;i++) {
	System.out.println(i);
	}
	
	System.out.println("-------------------------------------");
	
//TASK 2
	
	
	/*Create an array of names and store all names of your group
	 * then print your name from that array. (use 2 different ways of creating array)
	 */
	
	
	
	String[] names=new String[7];
	names[0]="Ivania";
    names[1]="Diana";
    names[2]="Ana";
    names[3]="Paola";  
    names[4]="Terri";
    names[5]="Shirley";
    names[6]="Henry";
    
    System.out.println(names[0]);
    
    String[]  names1= {"Ivania","Diana","Ana","Paola","Shirley","Henry"};
    System.out.println(names[0]);
    
  // TASK 3
    
    String[] word=new String[5];
    word[0]="Java";
    word[1]="Saturday";
    word[2]="for";    
    word[3]="coding";
    word[4]="is";    
    
    System.out.println(word[1]+" "+word[4]+" "+word[2]+" "+word[0]+" "+word[3]);
    
    
    String[] animals= {"cat","dog","cow","snake","elephant"};
    int size=animals.length;
    
    for(int a=0;a<size;a++) {
   // System.out.println(animals[a]); one way of printing all animals
    System.out.print(animals[a]+" ");
    }
    
    // create an array to store 5 double values, print all elements in 1 line
    System.out.println("-------------------------------------------------------------");
    double[] value={1.2,1.3,10.1,10.3,11.0};
    double element=value.length;
    
    for(int b=0;b<element;b++) {
    System.out.print(value[b]+" ");
    }    
	}
}
