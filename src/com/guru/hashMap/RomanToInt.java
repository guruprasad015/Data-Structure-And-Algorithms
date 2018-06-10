package com.guru.hashMap;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

	public static int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int i = 0;
        int intValue = 0;
        
        while(i<s.length()-1){
            if(map.get(s.charAt(i))>=map.get(s.charAt(i+1))){
                intValue += map.get(s.charAt(i));
                i++;
            }
            else{
                intValue += map.get(s.charAt(i+1))-map.get(s.charAt(i));
                i +=2;
            } 
        }
        if(i != s.length())
           intValue += map.get(s.charAt(i));
        
        return intValue;       
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "III";
		int output = romanToInt(input);
		System.out.println(output);

	}

}
