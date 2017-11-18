package com.guru.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {
		
		String[] inputArray = {"I", "wanna", "live", "I", "I", "forever"};
		
		Set<String> distinctWords = Arrays.asList(inputArray).stream()
				.collect(Collectors.toSet());
		
		System.out.println(distinctWords.size() + " : distinctWords " + distinctWords);
		
		List<String> distW = Arrays.asList(inputArray);
		inputArray[1] = "mod";
		
		System.out.println(distW.size() + " : distinctWords " + distW);
		
		Set<String> s = new TreeSet<String>();
		
		for(String a : inputArray){
			s.add(a);
		}
		System.out.println(s.size() + " : distinctWords " + s);

	}

}
