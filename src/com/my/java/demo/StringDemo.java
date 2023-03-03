package com.my.java.demo;

public class StringDemo {

	public static void main(String[] args) {
		System.out.println("----------------------Reversed String--------------------------");
		String s = "Vinit Salokhe @123";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

		System.out.println("****************************");
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse().toString());

		System.out.println("----------------------Print the vovels in given String--------------------------");
		String s1 = "vinit salokhe";
		String result = s1.replaceAll("[^'a','e','i','o','u']", "");
		System.out.println(result);
		System.out.println(result.length());

		System.out.println("<<<<<<<<<<<<<<<<<<<<");
		String max = s1.replaceAll(result, "*");
		System.out.println(max);
		System.out.println(">>>>>>>>>>>>>>>>>>>>");

		System.out.println("----------------------Remove the vovels in given String--------------------------");
		String result1 = s1.replaceAll("['a','e','i','o','u']", "");
		System.out.println(result1);
		System.out.println(result1.length());

	}

}
