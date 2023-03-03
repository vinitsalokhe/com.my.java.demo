package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ArrayListDemo {

	public static void main(String[] args) {
		int temp = 0;
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(76);
		l.add(45);
		l.add(23);
		l.add(90);
		l.add(101);
		l.add(10);

		System.out.println(l);

//Reverse the list
		Collections.reverse(l);
		System.out.println(l);

//Shuffle the list
		Collections.shuffle(l);
		System.out.println("shuffle Collection is :" + l);

//2 nd max element in list
		Collections.sort(l);
		System.out.println(l);
		temp = l.get(l.size() - 2);
		System.out.println("2 nd Max No. in list is :" + temp);

//remove duplicate		
		Set<Integer> s = new HashSet<>(l);
		System.out.println(s);

//check if list is empty			
		if (l.isEmpty()) {
			System.out.println("Empty Method ");
		} else {
			System.out.println(" Not Empty Method ");
		}

//convert  Integer array into list
		Integer[] a = { 1, 2, 3, 4, 6, 7, 6, 7, 9, 10 };
		List<Integer> ll = Arrays.asList(a);
		System.out.println(ll);
		for (Integer i : ll) {
			System.out.println(i);
		}

//convert list to array		
		List<Integer> aa = Arrays.asList(12, 23, 34, 45, 56, 78);
		Integer[] pp = aa.toArray(new Integer[0]);
		// System.out.println(Arrays.toString(pp));
		for (Integer ii : pp) {
			System.out.println(ii);
		}

//check if an element exists in an ArrayList
		List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);

		if (l1.contains(2)) {
			System.out.println("Present");
		} else {
			System.out.println("absent");
		}

//Convert set into List
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		List<Integer> list = new ArrayList<>(set);
		System.out.println(list);

//Convert List into set		
		List<Integer> list1 = new ArrayList<>();
		list1.add(11);
		list1.add(22);
		list1.add(33);
		list1.add(44);
		Set<Integer> set1 = new HashSet<>(list1);
		System.out.println(set1);

//Each character count in String 
		System.out.println("Each characot count is ");
		String ss = "Vinit Salokhe";
		int[] count = new int[256];
		for (int i = 0; i < ss.length(); i++) {
			count[ss.charAt(i)]++;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] > 0) {
				System.out.println((char) i + " : " + count[i]);
			}
		}

	}
}
