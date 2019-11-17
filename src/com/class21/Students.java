package com.class21;

public class Students {
	
	public String studentName;
	public int studentID;
	public static int numberOfStudents;
	
	
	
	
public static void main (String[]args) {
	
	Students stu1=new Students();
	stu1.studentName="Victor";
	stu1.studentID=987949;
	Students.numberOfStudents++;
	
	Students stu2=new Students();
	stu2.studentName="Crystela";
	stu2.studentID=252645;
	Students.numberOfStudents++;
	
	Students stu3=new Students();
	stu3.studentName="Kelly";
	stu3.studentID=784854;
	Students.numberOfStudents++;
	
	Students stu4=new Students();
	stu4.studentName="Indra";
	stu4.studentID=202704;
	Students.numberOfStudents++;
	
	
	System.out.println("The total # of students is "+Students.numberOfStudents);
	
}
	
	

}
