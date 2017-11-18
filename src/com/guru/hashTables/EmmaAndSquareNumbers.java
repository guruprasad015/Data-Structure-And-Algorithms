package com.guru.hashTables;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EmmaAndSquareNumbers {
	
	static int[] getMinimumUniqueSum(String[] arr) {
        int returnArrSize = arr.length;
        System.out.println("returnArrSize : " + returnArrSize );
        int[] returnArr = new int[returnArrSize];
        int startNumber;
        int endNumber;
        for(int i=0; i<returnArrSize; i++){
            String[] line = arr[i].split(" ");
        	startNumber = Integer.parseInt(line[0]);
        	System.out.print("startNumber : " + startNumber );
        	endNumber = Integer.parseInt(line[1]);
        	System.out.println("endNumber : " + endNumber );
        	int cnt = 0;
            for (int j=startNumber; j<=endNumber; j++){
            	for (int k=1; k*k<=j; k++)
                    if (k*k==j)
                        cnt++;
            }
            returnArr[i] = cnt;
        }
        
        return returnArr;

    }

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
        //final String fileName = System.getenv("OUTPUT_PATH");
        //BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int[] res;
        
        int _arr_size = 0;
        _arr_size = Integer.parseInt(in.nextLine().trim());
        String[] _arr = new String[_arr_size];
        String _arr_item;
        for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
            try {
                _arr_item = in.nextLine();
            } catch (Exception e) {
                _arr_item = null;
            }
            _arr[_arr_i] = _arr_item;
        }
        
        res = getMinimumUniqueSum(_arr);
        for(int res_i=0; res_i < res.length; res_i++) {
            System.out.print(String.valueOf(res[res_i]));
            System.out.println();
        	//bw.write(String.valueOf(res[res_i]));
            //bw.newLine();
        }
        
        //bw.close();
    }

}
