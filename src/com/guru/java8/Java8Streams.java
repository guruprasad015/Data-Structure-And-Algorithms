package com.guru.java8;

import java.util.*;
import java.util.stream.*;

public class Java8Streams {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("a1","c2","c3","a4");
		list
			.stream()
			.filter(s->s.startsWith("c"))
			.map(String::toUpperCase)
			.sorted()
			.forEach(System.out::println);
		
		list
			.stream()
			.findFirst()
			.ifPresent(System.out::println);
		
		Stream.of("t1","t2","t3")
			.findFirst()
			.ifPresent(System.out::println);
		
		IntStream.range(1,4)
			.forEach(System.out::println);
		
		Arrays.stream(new int[] {1,2,3})
			.map(n -> 2*n+1)
			.average()
			.ifPresent(System.out::println);
		
		Stream.of("a1","a2","a3")
			.filter(s->{
				System.out.println("filter : " + s);
				return true;
			});
		
		List<String> list2 = Arrays.asList("a1","c2","c3","a4","a","b","c");
		
		list2
			.stream()
			.sorted((s1,s2)->{
				System.out.println("sort : " + s1 + " , " + s2);
				return s1.compareTo(s2);
			})
			.filter(s->{
				System.out.println("filter : " + s);
				return s.startsWith("a");
			})
			.map(s->{
				System.out.println("map : " + s);
				return s.toUpperCase();
			})
			.forEach(s->System.out.println("forEach : " + s));

	}

}
