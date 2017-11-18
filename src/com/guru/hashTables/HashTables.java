package com.guru.hashTables;

import java.util.HashMap;

public class HashTables {
	
	public HashMap<Integer, String> buildMap(Student[] students){
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		for(Student s : students)
			map.put(s.getId(), s.getName());
		return map;
	}

}
