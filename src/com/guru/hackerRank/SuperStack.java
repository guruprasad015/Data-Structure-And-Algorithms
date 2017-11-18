package com.guru.hackerRank;

import java.util.Scanner;
import java.util.Stack;

public class SuperStack {

	static void superStack(String[] operations) {
        int numberOfOperations = operations.length;
        System.out.println("numberOfOperations : " + numberOfOperations );
        Stack st = new Stack();
        String operation;
        int value;
        for(int i=0;i<numberOfOperations;i++){
        	String[] line = operations[i].split(" ");
        	operation = line[0];
        	System.out.print("operation : " + operation );
        	value = Integer.parseInt(line[1]);
        	System.out.println("value : " + value );
        	
        	if(operation.equalsIgnoreCase("push")){
        		st.push(value);
        	}
        	else if(operation.equalsIgnoreCase("pop")){
        		if(!st.isEmpty())
        			st.pop();        		
        	}
        }
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
        int _operations_size = 0;
        _operations_size = Integer.parseInt(in.nextLine().trim());
        String[] _operations = new String[_operations_size];
        String _operations_item;
        for(int _operations_i = 0; _operations_i < _operations_size; _operations_i++) {
            try {
                _operations_item = in.nextLine();
            } catch (Exception e) {
                _operations_item = null;
            }
            _operations[_operations_i] = _operations_item;
        }
        
        superStack(_operations);
        
    }

}
