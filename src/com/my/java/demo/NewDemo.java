package com.my.java.demo;

import java.util.Scanner;

public class NewDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter age");
		int ad = sc.nextInt();

		String result = isValidVoter(ad, "india") ? "Vaild" : "NotVaild";
		System.out.println(result);

	}

	public static boolean isValidVoter(int age, String country) {
		{
			if (age > 18 && country.equalsIgnoreCase("India")) {
				return true;

			} else {
				return false;
			}
		}

	}
}
