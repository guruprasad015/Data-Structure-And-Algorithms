package com.guru.threads;

public class Counter {

	private int c;
	
	public void increment(){
		c++;
	}
	
	public void decrement(){
		c--;
	}
	
	public int value(){
		return c;
	}
}
