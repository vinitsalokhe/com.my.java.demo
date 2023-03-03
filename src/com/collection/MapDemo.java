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
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

//convert map into list
		Map<String, Integer> m = new HashMap<>();
		m.put("AA", 1);
		m.put("BB", 2);
		m.put("CC", 3);
		m.put("DD", 4);
		Set<Map.Entry<String, Integer>> s = m.entrySet();
		List<Map.Entry<String, Integer>> l = new ArrayList<>(s);
		System.out.println("Map converted into list : " + l);

//check key is present in given map	
		Map<String, Integer> m1 = new HashMap<>();
		m1.put("xx", 11);
		m1.put("yy", 22);
		m1.put("zz", 33);
		m1.put("zz", 1233);

		System.out.println("Total map is : " + m1);

//check key is present or not		
		if (m1.containsKey("vv")) {
			System.out.println("Key is Present");
		} else {
			System.out.println("Key is Absent");
		}

//check value is present in given map			
		if (m1.containsValue(11)) {
			System.out.println("Value is Present");
		} else {
			System.out.println("Value is Absent");
		}

//check map is empty
		m1.clear();
		System.out.println(m1);
		// OR
		m1 = new HashMap<>();
		System.out.println(m1);

	}

}
