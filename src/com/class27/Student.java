package com.class27;

public class Student {

	public void hwAssignments() {
		System.out.println("Every student in school usually gets homework assignment");
	}

	public void study() {
		System.out.println("Most students in school study");
	}

}

class SyntaxStudent extends Student {

	public void study() {
		System.out.println("Syntax students study for 2-3 hours");
	}

	public void hwAssignments() {
		System.out.println(
				"Syntax Students normally get homework assignments Tuesdays, Thursdays, Saturdays, and Sundays");
	}

	public void code() {
		System.out.println("Syntax Students code");
	}

}

class CollegeStudent extends Student {

	public void hwAssignments() {
		System.out.println("College students normally get essays and exams as well as homework");
	}

	public void study() {
		System.out.println("College students study most days");
	}

	public void activity() {
		System.out.println("College students have extra curicular activities they can take");
	} 

}

class SchoolStudent extends Student {
	public void hwAssignments() {
		System.out.println("School students normally get homework assignments everyday after class ends");
	}

	public void study() {
		System.out.println("School students study afterschool");
	}

	public void afterschool() {
		System.out.println("School students always have afterschool programs");
	}

}