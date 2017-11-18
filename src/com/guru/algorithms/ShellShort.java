package com.guru.algorithms;

class ArraySh {
	
	private long[] theArray;
	int nElems;
	
	public ArraySh(int max){
		theArray = new long[max];
		nElems = 0;
	}
	
	public void insert(long value){
		theArray[nElems] = value;
		nElems ++;
	}
	
	public void display(){
		for(int i=0; i< nElems; i++){
			System.out.print(theArray[i] + " , ");
		}
		System.out.println();
	}
	
	public void shellSort(){
		int outer;
		int inner;
		long temp;
		
		int h=1;
		while(h<=nElems/3)
			h = (h*3) + 1;
		
		while(h>0){
			System.out.println("h in while loop : " + h);
			for(outer = h; outer<nElems; outer++){
				temp = theArray[outer];
				inner = outer;
				
				System.out.println("temp in outer for loop : " + temp);
				
				System.out.println("outer in outer for loop : " + outer);
				
				while(inner>h-1 && theArray[inner-h] >= temp){
					theArray[inner] = theArray[inner-h];
					
					System.out.println("inner in inner while loop : " + inner);
					inner -= h;					
				}
				theArray[inner] = temp;	
			}
			h = (h-1)/3;
		}
		
	}

}

public class ShellShort{
	
	public static void main(String[] args){
		int maxSize = 10;
		ArraySh shellAr = new ArraySh(maxSize);
		for(int i=0; i<maxSize; i++){
			long n = (int)(java.lang.Math.random()*99);
			shellAr.insert(n);
		}
		shellAr.display();
		shellAr.shellSort();
		shellAr.display();
	}
	
}
