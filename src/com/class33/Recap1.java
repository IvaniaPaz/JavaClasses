package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Recap1 {

	public static void main(String[] args) {

		Student s1 = new Student("Salim", 107);

		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(new Student("Zeynep", 108));
		list.add(new Student("Hasan", 109));
		list.add(new Student("Jaime", 110));
		list.add(new Student("Ivania", 111));
		list.add(new Student("Ozlem", 112));

		Iterator<Student> st = list.iterator();

		while (st.hasNext()) {
//			Student stu = st.next();
//			System.out.println(stu.name);
			System.out.println(st.next().studentID);
			//System.out.println(st.next().name);
		}
	}

}
