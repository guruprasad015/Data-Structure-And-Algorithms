package com.guru.hashTables;

public class Summation {
	
	static int summation(int[] numbers) {
        int noOfElements = numbers[0];
        int sum = 0;
        for(int i=1; i<=noOfElements; i++){
        	sum += numbers[i];
        }
        System.out.println(sum);
        return sum;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {5,1,2,3,4,5};
		Summation.summation(numbers);
	}

}
