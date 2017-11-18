package com.guru.stack;

public class StackX {
	private int[] data;
	private int top;
	private int maxSize;
	
	public StackX(int s){
		maxSize = s;
		data = new int[maxSize];
		top = -1;
	}
	
	public void push(int item){
		data[++top] = item;
	}
	
	public int pop(){
		return data[top--];
	}
	
	public int peek(){
		return data[top];
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public boolean isFull(){
		return (top == maxSize -1);
	}
}
