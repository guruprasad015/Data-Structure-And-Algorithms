package com.guru.algorithms;

public class InsertionSort {
	
	private int[] a;
	private int nElements;
	
	public InsertionSort(int max){
		a = new int[max];
		nElements = 0;
	}
	
	public void insert(int input){
		a[nElements++] = input;
	}

	public void display(){
		
		for(int i=0; i<nElements; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public void sort(){
		int in, out, temp;
		for(out=0; out<nElements; out++){
			temp = a[out];
			in = out;
			while(in>0 && a[in-1]>=temp){
				a[in] = a[in-1];
				--in;
			}
			a[in] = temp;
		}
	}

}
