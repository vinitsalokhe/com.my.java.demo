package com.collection;

public class MyComparableDemo implements Comparable<MyComparableDemo> {

	int id;
	String name;
	int age;

	public MyComparableDemo(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(MyComparableDemo o) {

		if (this.age < o.age) {
			return -1;
		} else if (this.age > o.age) {
			return +1;
		}

		return 0;
	}

}
