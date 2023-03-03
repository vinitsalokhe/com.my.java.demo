package com.oops.demo;

public abstract class Inheratance {

	int id;
	String name;

	public Inheratance() {
		super();
	}

	public Inheratance(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public abstract void show(int id, String name);

	public void printInfo(int id, String name) {

		System.out.println("Id is : " + id);
		System.out.println("Name is : " + name);

	}

}
