package com.guru;

public class HammingDistance {

	public static void main(String[] args) {
		int x = 1;
		int y = 4;
		System.out.println("Number 'x'= " + x);
		System.out.println("Number 'y'= " + y);
	    
	   /* returns the string representation of the unsigned integer value 
	   represented by the argument in binary (base 2) */
	   System.out.println("Binary 'x'= " + Integer.toBinaryString(x));
	   System.out.println("Binary 'y'= " + Integer.toBinaryString(y));

	   // returns the number of one-bits 
	   System.out.println("Number of one bits 'x'= " + Integer.bitCount(x)); 
	   System.out.println("Number of one bits 'y'= " + Integer.bitCount(y));
	   
	   System.out.println("x^y = " + Integer.toString(x^y));
		
	   System.out.println("Hamming Distance = " + Integer.bitCount(x^y));
	}

}
