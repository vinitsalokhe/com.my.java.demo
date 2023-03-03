package com.oops.demo;

public class InheretanceDemo extends Inheratance {

	@Override
	public void show(int id, String name) {
		System.out.println("*************");
		System.out.println("Id is : " + id);
		System.out.println("Name is : " + name);
	}

	public static void main(String[] args) {

		InheretanceDemo d = new InheretanceDemo();
		d.show(100, "Peater");
		d.printInfo(1000, "Mahesh");

	}

}