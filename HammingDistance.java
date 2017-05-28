package com.guru;

/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different. 
Given two integers x and y , calculate the Hamming distance.

STEP 1
Compare the first two bits in each string. If they are the same, record a "0" for that bit. 
If they are different, record a "1" for that bit. In this case, the first bit of both strings is "1," so record a "0" for the first bit.

STEP 2
Compare each bit in succession and record either "1" or "0" as appropriate. 
String 1: "1001 0010 1101" String 2: "1010 0010 0010" Record: "0011 0000 1111"

STEP 3
Add all the ones and zeros in the record together to obtain the Hamming distance. 
Hamming distance = 0+0+1+1+0+0+0+0+1+1+1+1 = 6
*/

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
