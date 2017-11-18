package com.guru.hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MaximumPerimeterTriangle {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        // Read the number of Sticks
        int noOfSticks = Integer.valueOf(in.nextLine().trim());
        if(noOfSticks <3){
            System.out.println(-1);
        }
        //Read the values for Sticks
        String sticksIn = in.nextLine().trim();
        String[] sticksInArr = sticksIn.split(" ");
		
		int[] sticksArr = new int[noOfSticks];
		for(int i=0; i<noOfSticks;i++){
			sticksArr[i] = Integer.valueOf(sticksInArr[i]);
		}
        //Sort the array so that it becomes easy to identify the Non Denerating triangle
        Arrays.sort(sticksArr);
        calculateNonDegenertingTri(sticksArr,noOfSticks);
    }
    public static void calculateNonDegenertingTri(int[] sticks, int noOfSticks){
        //Put each matching triangle in an HashMap
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Integer> triangleSides;
        ArrayList<Integer> temp;
        int perimeter = 0;
        for(int i=2; i<noOfSticks; i++){
            if(sticks[i]< sticks[i-1] + sticks[i-2]){
                perimeter = sticks[i] + sticks[i-1] + sticks[i-2];
                triangleSides = new ArrayList<>();
                triangleSides.add(sticks[i-2]);
                triangleSides.add(sticks[i-1]);
                triangleSides.add(sticks[i]);
                if(!map.containsKey(perimeter)){
                    map.put(perimeter,triangleSides);
                }
                else{
                    /*If triangle with the derived perimeter already exists, check for the longest maximum side and longest minimum side
                    condition*/
                    temp = map.get(perimeter);
                    if( sticks[i] > temp.get(2) || sticks[i-2] > temp.get(0))
                        map.put(perimeter,triangleSides);
                }
            }
        }
        int maxPerimeter = 0;
        /*Now the map contains permiters that are unique, identify the maximum*/
        for(Integer p : map.keySet()){
            if(p>maxPerimeter)
                maxPerimeter = p;    
        }
        if(maxPerimeter !=0){
            triangleSides = map.get(maxPerimeter);
            System.out.println(triangleSides.get(0) + " " + triangleSides.get(1) + " " + triangleSides.get(2));
        }
        else{
            System.out.println(-1);
        }    
      
    }
}