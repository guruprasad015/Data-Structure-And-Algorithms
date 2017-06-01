package com.guru.primitiveTypeQuestions;

public class ReverseNumber {
	
	public int reverse(int input){
		int output = 0;
		int digit = 0;
		
		if(input ==0)
			return input;
		else{
			while(input!=0){
				digit = input%10;
				output = output*10 + digit;
				input = input/10;
			}
		}
		return output;		
	}

	public static void main(String[] args) {
		int input = -1234;
		ReverseNumber rn = new ReverseNumber();
		int output = rn.reverse(input);
		System.out.println(output);
		
	}

}
