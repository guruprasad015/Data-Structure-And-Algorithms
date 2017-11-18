package com.guru.ood;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Cat{
	public String name;
	public int height;
	public int weight;
	
	public Cat(String name, int height, int weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
	}	
}
public class CatsApp {
	
	public static void main(String[] args) {
		
		Cat cat1 = new Cat("tom", 2, 50);
		Cat cat2 = new Cat("tim", 3, 100);
		Cat cat3 = new Cat("james", 2, 100);
		Cat cat4 = new Cat("chloe", 3, 150);
		List<Cat> cats = Arrays.asList(cat1,cat2,cat3,cat4);
		List<Cat> result = getCatNames(cats, "HEIGHT",2,"=");
		for(Cat c : result)
			System.out.println(c.name);
		
		System.out.println(Integer.MIN_VALUE);

	}
	
	public static List<Cat> getCatNames(List<Cat> cats, String searchCriteria, int searchValue, String symbol){
		List<Cat> result = new ArrayList<>();
		
		for(Cat c : cats){	
			if(checkMatchedCat(c,searchCriteria,searchValue,symbol))
				result.add(c);
		}
		
		Predicate<Cat> predicate = getPredicate(searchCriteria, searchValue, symbol);
		result = cats
					.stream()
					.filter(predicate)
					.collect(Collectors.<Cat>toList());
			
		return result;
		
		
	}

	private static Predicate<Cat> getPredicate(String searchCriteria, int searchValue, String symbol) {
		switch(symbol){
		case "=":
			if(searchCriteria == "HEIGHT")
				return c -> c.height == searchValue ;
			else if(searchCriteria == "WEIGHT")
				return c -> c.weight == searchValue ;
		case ">":
			if(searchCriteria == "HEIGHT")
				return c -> c.height > searchValue;
			else if(searchCriteria == "WEIGHT")
				return c -> c.weight > searchValue;
		case "<":
			if(searchCriteria == "HEIGHT")
				return c -> c.height < searchValue;
			else if(searchCriteria == "WEIGHT")
				return c -> c.weight < searchValue;
		default: 
			return c -> c.height == searchValue ;
		}
	}

	public static boolean checkMatchedCat(Cat cat, String searchCriteria, int searchValue, String symbol){
		switch(symbol){
		case "=":
			if(searchCriteria == "HEIGHT")
				return cat.height == searchValue;
			else if(searchCriteria == "WEIGHT")
				return cat.weight == searchValue;
		case ">":
			if(searchCriteria == "HEIGHT")
				return cat.height > searchValue;
			else if(searchCriteria == "WEIGHT")
				return cat.weight > searchValue;
		case "<":
			if(searchCriteria == "HEIGHT")
				return cat.height < searchValue;
			else if(searchCriteria == "WEIGHT")
				return cat.weight < searchValue;
		default: 
			return false;
		}
	}

}
