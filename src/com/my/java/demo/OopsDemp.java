package com.my.java.demo;

public class OopsDemp {

	public static void main(String[] args) {
		Parentt p = new Child();
		p.m1();
	}
}

class Parentt {
	Parentt() {
		System.out.println("parent const");
		m1();
	}

	public void m1() {
		System.out.println("Parent m1");
	}
}

class Child extends Parentt {
	int x = 10;

	public void m1() {
		System.out.println(x);
		System.out.println("child m1");
	}
}