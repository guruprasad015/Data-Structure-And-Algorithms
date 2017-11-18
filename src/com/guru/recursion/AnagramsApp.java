package com.guru.recursion;

public class AnagramsApp {
	
	static int size;
	
	static int count;
	
	static char[] inputArr;
	
	public static void doAnagram(int newSize){
		System.out.println("Anagram newSize : " + newSize);
		if(newSize == 1)
			return;
		for(int j=0; j<newSize;j++){
			System.out.println("Anagram j : " + j);
			doAnagram(newSize-1);
			System.out.println("Anagram j : " + j);
			System.out.println("Anagram inside newSize : " + newSize);
			if(newSize == 2)
				display();
			rotate(newSize);
		}
		
	}
	
	public static void display(){
		if(count < 99) 
			System.out.print(" ");
		if(count < 9) 
			System.out.print(" ");
		System.out.print(++count + " "); 
		for(int j=0; j<size; j++)
			System.out.print( inputArr[j] ); 
		System.out.println(""); 
		System.out.flush();
		if(count%6 == 0)
			System.out.println("");
		
	}
	
	public static void rotate(int newSize){
		
		System.out.println(" BEFORE Rotate : ");
		
		for(int j=0; j<size; j++)
			System.out.print( inputArr[j] );
		System.out.println("");
		System.out.println(" BEFORE Rotate : ");
		
		System.out.println(" Rotate newSize : " + newSize);
		int j;
		int position = size - newSize;
		char temp = inputArr[position];
		for(j= position +1; j<size;j++)
			inputArr[j-1] = inputArr[j];
		inputArr[j-1] = temp;
		
		System.out.println(" AFTER Rotate : " );
		
		for(int k=0; k<size; k++)
			System.out.print( inputArr[k] );
		System.out.println("");
		System.out.println(" AFTER Rotate : " );
		
	}

	public static void main(String[] args) {

		String input = "abcd";
		
		size = input.length();
		
		inputArr = input.toCharArray();
		
		count = 0;
		
		doAnagram(size);
		
		
	}

}
