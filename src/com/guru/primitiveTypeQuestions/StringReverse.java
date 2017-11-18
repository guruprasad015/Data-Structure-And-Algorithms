package com.guru.primitiveTypeQuestions;

public class StringReverse {
	 public String reverseString(String s)
	  {
	    int slength = s.length();
	    StringBuffer rev = new StringBuffer();
	    for (int i = slength - 1; i >= 0; i--) {
	      rev = rev.append(s.charAt(i));
	    }
	    return rev.toString();
	  }
	  
	  public static void main(String[] args)
	  {
	    String original = "Guruprasad Partha Sarathy";
	    StringReverse strv = new StringReverse();
	    String reverse = strv.reverseString(original);
	    System.out.println(reverse);
	  }

}
