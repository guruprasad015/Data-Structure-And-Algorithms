package com.guru.Strings;

public class ReverseWordsInString {
	
	public static void reverseWordsInString(char[] inStr){

	    int start =-1, end=-1, wordLength = 0;
	    
	    for(int i=0; i<inStr.length; i++){
	        if(inStr[i] != ' '){
	            end++;
	            wordLength++;
	        }
	        else{
	        	if(wordLength>0){
	        		reverseWord(start+1, end, inStr);
	                wordLength = 0;
	                start = end;
	        	}
	            end++;
	            start++;    
	        }
	        
	    }
	    if(wordLength>0)
	    	reverseWord(start+1, end, inStr);

	}
	
	public static void reverseWord(int start, int end, char[] input){
		while(start<end){
            char temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            end--;
            start++;
        }
	}

	public static void main(String[] args) {
		String input = "this is a test";
		char[] inStr = input.toCharArray();
		System.out.println(input + " length " + inStr.length);
		reverseWordsInString(inStr);
		String output = new String(inStr);
		System.out.println(output);
	}

}
