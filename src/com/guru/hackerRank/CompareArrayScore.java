package com.guru.hackerRank;
import java.util.*;

public class CompareArrayScore {

    private static int[] compare(int[] input1, int[] input2){
    	int aScore = 0;
        int bScore = 0;
 
        for(int i=0; i<3; i++){
            if(input1[i] > input2[i])
                aScore++;
            else if(input1[i] < input2[i])
                bScore++;
        }
        int[] result = {aScore,bScore};
        return result;
    }
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        in.close();
        
        int[] aArray = {a0,a1,a2};
        int[] bArray = {b0,b1,b2};
        int[] result = new int[2];
        
        result = compare(aArray,bArray);
        System.out.print(result[0] + " " + result[1]);
    }
}