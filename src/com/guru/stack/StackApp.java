package com.guru.stack;

public class StackApp {

	public static void main(String[] args) {
		StackX st = new StackX(10);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		
		while(!st.isEmpty()){
			int value = st.pop();
			System.out.print(value);
			System.out.print(" ");
		}
		System.out.println();
	}

}
