package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {
		List<MyComparableDemo> l = new ArrayList<>();

		l.add(new MyComparableDemo(101, "Ram", 16));
		l.add(new MyComparableDemo(99, "Sha", 24));
		l.add(new MyComparableDemo(76, "Jay", 14));

		Collections.sort(l);

		for (MyComparableDemo d : l) {
			System.out.println(d.id + " " + d.name + " " + d.age);
		}
	}

}
