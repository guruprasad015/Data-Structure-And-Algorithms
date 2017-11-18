package com.guru.Strings;
import java.util.Hashtable;

public class StringPlayer {

	public static void main(String[] args) {
		
		String test = "Aest";
		System.out.println(test.charAt(0) - 96);
		
		System.out.println(Character.getNumericValue(test.charAt(0)));
		System.out.println(Character.getNumericValue(test.charAt(1)));
		
		System.out.println( Character.getNumericValue(test.charAt(1)) - Character.getNumericValue(test.charAt(0)));
		
		Hashtable<Character,Integer> charTable = new Hashtable<>();

	}

}
