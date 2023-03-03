package com.my.java.demo;

import java.util.Scanner;

public class MyjavaPratices {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int xxx = sc.nextInt();

		// boolean result = isEvanNumber(xxx);
		String result1 = isEvanNumber(xxx);
		System.out.println(result1);
	}

	/*
	 * public static boolean isEvanNumber(int a) { if(a%2==0) return true;
	 * 
	 * return false;
	 * 
	 * }
	 */
	public static String isEvanNumber(int a) {
		return (a % 2 == 0) ? "Is even number" : "Is odd number";

	}

}