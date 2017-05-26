package com.guru;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {

	public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        if(nums.length ==0)
            return false;
        for(int i : nums){
            if(map.get(i) != null)
                return true;
            else
                map.put(i,1);
        }
        return false;
    }
	
	public static void main(String[] args) {
		int[] input = {1,2,3,4,5,6,4};
		FindDuplicates findDup = new FindDuplicates();
		System.out.println("Input Array has duplicates : " + findDup.containsDuplicate(input));

	}

}
