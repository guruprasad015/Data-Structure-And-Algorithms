package com.guru.trees;

public class BinaryTreeApp {
	
	public static void main(String[] args) {
		BinaryTree theTree = new BinaryTree();
		
		theTree.insert(50, 1.5); // insert 3 nodes
		theTree.insert(25, 1.7);
		theTree.insert(75, 1.9);
		
		Node found = theTree.find(25);
		
		if(found!=null){
			System.out.println("Found the node with Key 25");
		}
		else{
			System.out.println("Couldn't find the node with Key 25");
		}
	}

}
