package com.class33;

import java.util.ArrayList;
import java.util.List;

public class InstructorList {

	public static void main(String[] args) {
		// create a List that will be holding 5 instructor

		List<Instructor> inList = new ArrayList<>();
		inList.add(new Instructor("Asel", "Umurzakova"));
		inList.add(new Instructor("Diego", "Juarez"));
		inList.add(new Instructor("Mohammad", "Shokriyan"));
		inList.add(new Instructor("Weqas", "Haq"));

		for (Instructor i : inList) {
			System.out.println(i.lastName);
			i.display();
		}

	}

}
