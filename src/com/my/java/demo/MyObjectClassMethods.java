package com.my.java.demo;

public class MyObjectClassMethods {

	int rollNo = 007;
	static int last_rollNo = 1000;

	public MyObjectClassMethods() {
		super();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	public static void main(String[] args) {
		MyObjectClassMethods o = new MyObjectClassMethods();
		System.out.println(o);
		System.out.println(o.hashCode());

		Object obj = new String("My Name Is Vinit..........");
		Class c = obj.getClass();
		System.out.println(c);

		MyObjectClassMethods xyz = new MyObjectClassMethods();
		System.out.println(xyz.hashCode());

		xyz = null;
		System.gc();
		System.out.println("Method Is Ending ");

	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println();
		super.finalize();
	}

}
