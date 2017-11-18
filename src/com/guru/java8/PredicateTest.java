package com.guru.java8;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		return t>10;
	}
	
	public static Predicate<Integer> inBetween(){
		Predicate<Integer> inBetween = new Predicate<Integer>(){
			public boolean test(Integer t){
				return (t>10 && t<20);
			}
		};
		
		return inBetween;
	}
	
	public static Predicate<Integer> between(){
		return t -> (t>10 && t<20);
	}
	
	public static void main(String[] args) {
		Predicate<Integer> isGreater = new PredicateTest();
		System.out.println(isGreater.test(10));
		
		Predicate<Integer> isLesser = new Predicate<Integer>(){
			public boolean test(Integer t) {
				return t<10;
			}
		};
		
		System.out.println(isLesser.test(5));
		
		Predicate<Integer> isEqual = t -> t==10;
		
		System.out.println(isEqual.test(5));
		
		List<Integer> list = Arrays.asList(new Integer[]{9,15,20});
		List<Integer> newList =
		list
			.stream()
			.filter(between())
			.collect(Collectors.<Integer>toList());
		
		System.out.println(newList);
		
		
		
	}

}
