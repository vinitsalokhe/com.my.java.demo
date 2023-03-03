package com.collection;

import java.util.Arrays;
import java.util.List;

/*List l= (1,2,3,4,5,6,7,8,9,10);
[1,2,3] 
[4,5,6]
[7,8,9]
[10,0,0]*/

public class ArrayListExample {

	public static void main(String[] args) {
		// System.out.println("Hi");
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int size = a.length / 3 + 1;
		int i1 = 0;
		int count = 0;
		while (i1 < size) {
			int j = 0;
			while (j < 3) {
				if (count < a.length) {
					System.out.print(a[count] + " ");
				}
				count++;
				j++;
			}
			j = 0;
			System.out.println();
			i1++;
		}

// convert int type array into list 
		Integer[] b = new Integer[a.length];
		for (int i = 0; i < a.length; i++) {
			System.out.println(b[i] = Integer.valueOf(a[i]));
		}
		List<Integer> lll = Arrays.asList(b);
		System.out.println("converted in array into list : " + lll);

	}

}
