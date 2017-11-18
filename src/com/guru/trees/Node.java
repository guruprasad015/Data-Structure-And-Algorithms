package com.guru.trees;

public class Node {
	
	int data;
	double fData;
	public Node leftNode;
	public Node rightNode;
	
	public Node(int data, double fdata){
		this.data = data;
		this.fData = fdata;
	}
	
	public int getData(){
		return data;
	}
	
	public void setFdata(double data){
		this.fData = data;
	}
	
	public double getFdata(){
		return fData;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public Node getLeftNode(){
		return leftNode;
	}
	
	public void setLeftNode(Node left){
		this.leftNode = left;
	}
	
	public Node getRightNode(){
		return rightNode;
	}
	
	public void setRightNode(Node right){
		this.rightNode = right;
	}

}
