package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {

	String name;
	int studentID;

	public Student(String name, int studentID) {
		this.name = name;
		this.studentID = studentID;
	}

	public void display() {
		System.out.println("My name is " + name + " and my student ID is " + studentID);
	}
}

public class StudentTest {

	public static void main(String[] args) {
		// create an ArrayList that will store student type of object

		List<Student> students = new ArrayList<>();

		// creating Student Type of Object
		Student stu = new Student("John", 101);
		Student stu1 = new Student("Jane", 102);
		Student stu2 = new Student("Jack", 103);

		// adding Student type of Objects
		students.add(stu);
		students.add(stu1);
		students.add(stu2);

		// display info of each student
		stu.display();
		stu1.display();
		stu2.display();

		System.out.println("---Using for each loop---");
		// for each loop
		for (Student st : students) {
			st.display();
		}

		// adding more objects of a student type
		System.out.println("---adding more objects of student type---");
		students.add(new Student("Michael", 104));
		students.add(new Student("David", 105));
		students.add(new Student("Ezra", 106));

		System.out.println("--using Iterator--");
		Iterator<Student> st1 = students.iterator();

		while (st1.hasNext()) {
			st1.next().display();
		}

	}

}
