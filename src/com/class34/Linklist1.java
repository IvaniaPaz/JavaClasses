package com.class34;

import java.util.LinkedList;
import java.util.List;

public class Linklist1 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(111);
		list.add(222);
		list.add(333);
		list.add(444);
		list.add(555);
		list.add(666);

		int sum = 0;

		for (Integer add : list) {
			sum = sum + add;

		}
		System.out.println(sum);
	}

}
