package com.my.java.demo;

public class StringSpecialCharactor {

	public static void main(String[] args) {

		String s = "vintsalokhe3540@gmail.com";

		System.out.println("-------------------Find a spacial charecter using methods------------------------");
		String result = s.replaceAll("[^a-z]", "");
		String result1 = s.replaceAll("[^0-9]", "");
		String result2 = s.replaceAll("[^!@#$%^&*.]", "");

		System.out.println("Only letters is : " + result);
		System.out.println("Only numbers is : " + result1);
		System.out.println("Only spacial charecter is : " + result2);

		
		
		System.out.println("-------------------Find a spacial charecter using loop------------------------");
		char[] myArray = s.toCharArray();

		for (int i = 0; i < myArray.length; i++) {

			if (Character.isLetter(s.charAt(i))) {
				System.out.print(s.charAt(i));
			}
		}

		System.out.println();

		for (int i = 0; i < myArray.length; i++) {

			if (Character.isDigit(s.charAt(i))) {
				System.out.print(s.charAt(i));
			}
		}

		System.out.println();

		for (int i = 0; i < myArray.length; i++) {

			if (!(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))) {
				System.out.print(s.charAt(i));

			}

		}

	}

}
