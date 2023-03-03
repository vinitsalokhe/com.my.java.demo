package com.oops.demo;

public class AbstractImpl extends AbstractDemo {

	@Override
	public void show() {
		System.out.println("Inside show method ************");
	}

	public static void main(String[] args) {
		AbstractImpl ab = new AbstractImpl();
		ab.show();
		ab.print();
	}

}
