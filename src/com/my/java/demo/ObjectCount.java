package com.my.java.demo;

public class ObjectCount {

	public class Oops {

	}

	static int count = 0;

	public ObjectCount() {
		count++;
	}

	public static void main(String[] args) {
		ObjectCount o = new ObjectCount();
		ObjectCount o1 = new ObjectCount();
		ObjectCount o2 = new ObjectCount();
		ObjectCount o3 = new ObjectCount();
		ObjectCount o4 = new ObjectCount();

		System.out.println(ObjectCount.count);

		Integer i1 = 128;
		Integer i2 = 128;

		System.out.println(i1 == i2);

		Integer i3 = 127;
		Integer i4 = 127;
		System.out.println(i3 == i4);

		Integer i5 = 76;
		Integer i6 = 76;
		System.out.println(i5 == i6);
	}
}
