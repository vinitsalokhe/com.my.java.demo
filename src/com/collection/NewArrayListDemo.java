package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class NewArrayListDemo {

	public static void main(String[] args) {

		Integer[] a = { 1, 2, 3, 4, 5, 6, 7 };
		// List<Integer> l = Arrays.asList(a);
		// System.out.println(l);

		List<Integer> l1 = new ArrayList<>();
		System.out.println(l1);
		for (Integer i : a) {
			l1.add(i);

		}
		System.out.println(l1);

		LinkedList<Integer> l2 = new LinkedList<>();
		l2.add(11);
		l2.add(22);
		l2.add(33);

		Integer result = l2.getFirst();
		System.out.println("First element in Linked list is :" + result);

//Convert int array into list		
		int[] a1 = { 1, 2, 3, 4, 5 };
		Integer[] b1 = new Integer[a1.length];
		for (int i = 0; i < a1.length; i++) {
			System.out.println(b1[i] = Integer.valueOf(a[i]));
		}
		List<Integer> lll = Arrays.asList(b1);
		System.out.println(lll);

//String reverse character wise
		String s = "vinit salokhe";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

//String reverse word wise		
		String s1 = "vinit salokhe";
		String[] ss = s1.split(" ");
		for (int i = ss.length - 1; i >= 0; i--) {
			System.out.print(ss[i]);
		}

	}

}
