package com.guru.algorithms;

public class InsertionSortApp {

	public static void main(String[] args) {
		int maxSize = 10;
		InsertionSort ins;
		ins = new InsertionSort(maxSize);
		
		ins.insert(90);
		ins.insert(80);
		ins.insert(70);
		ins.insert(60);
		ins.insert(50);
		ins.insert(40);
		ins.insert(30);
		ins.insert(20);
		ins.insert(10);
		ins.insert(1);
		
		ins.display();
		
		ins.sort();
		
		ins.display();
	}

}
