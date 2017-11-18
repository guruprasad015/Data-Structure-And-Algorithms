package com.guru.algorithms;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter values for n, k, q in the format {n k q}" );
		
		String variables = in.nextLine().trim();
		
		String[] s = variables.split(" ");

		int n = Integer.valueOf(s[0]);
		int k = Integer.valueOf(s[1]);
		int q = Integer.valueOf(s[2]);
		
		System.out.println("Enter " + n + " values for array in the format {1 2 3}" );
		String arrayValues = in.nextLine().trim();
		
		String[] arr = arrayValues.split(" ");
		
		int[] inputArr = new int[n];
		for(int i=0; i<n;i++){
			inputArr[i] = Integer.valueOf(arr[i]);
		}
		
		System.out.println("Enter " + q + " values for the indices to be printed:" );
		
		int[] indices = new int[q];
		
		for(int i=0; i<q;i++){
			indices[i] = in.nextInt();
		}
		
		in.close();
		
		rotateArray(inputArr, k, n);
		for(int i =0; i<n ; i++){
		System.out.println(inputArr[i]);
		}
		
		printValuesAtIndices(inputArr, q, indices);
	}
	
	public static void rotateArray(int[] arr, int rotations, int size){
		int temp;
		while(rotations>0){
			temp = arr[size-1];
			for(int i=size-1; i>0; i--){
				arr[i] = arr[i-1];
			}
			arr[0] = temp;
			--rotations;
		}
		/*int[] temp = new int[rotations];
		int j=0;
		for(int i=size-rotations; i<size; i++){
			temp[j++] = arr[i];
		}
		for(int i=rotations; i<size; i++){
			arr[i] = arr[i-rotations];
		}
		for(int i=0; i<rotations; i++){
			arr[i] = temp[i];
		}*/
	}
	
	public static void printValuesAtIndices(int[] arr, int q, int[] indices){
		for(int i=0;i<q;i++){
			System.out.println(arr[indices[i]]);
		}
	}

}
