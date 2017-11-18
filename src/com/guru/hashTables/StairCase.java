package com.guru.hashTables;

public class StairCase {
	
	static void stairCase(int n) {
		for(int i=1; i<=n; i++){
			for(int j=n;j>=1;j--){
				if(j>i)
					System.out.print(' ');
				else
					System.out.print('#');
			}
			System.out.println();
		}

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StairCase.stairCase(10);

	}

}
