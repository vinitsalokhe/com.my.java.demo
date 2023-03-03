package com.my.java.demo;

import java.util.Scanner;

public class BacisDebugeDemo {

	public static int isAddition(int a, int b) {
		int result = 0;
		result = a + b;
		return result;
	}

	public static void isEven(int x) {
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println("Even no is = " + i);
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 number");
		int aaa = sc.nextInt();
		int output = isAddition(aaa, aaa);
		System.out.println(output);

		isEven(0);
	}

}
