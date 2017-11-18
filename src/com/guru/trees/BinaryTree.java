package com.guru.trees;

public class BinaryTree {
	
	private Node root;
	
	public void insert(int id, double dd){
		
		Node newNode = new Node(id, dd);
		
		if(root == null){
			root = newNode;
		}
		else{
			Node current = root;
			Node parent;
			while(true){
				parent = current;
				if(id < current.data){
					current = current.leftNode;
					if(current == null){
						parent.leftNode = newNode;
						return;
					}
					else{
						current = current.rightNode;
						if(current == null){
							parent.rightNode = newNode;
							return;
						}
					}
				}
			}
		}
		
	}
	
	public Node find(int key){
		Node current = root;
		
		while(current.data != key){
			if(key<current.data)
				current = current.leftNode;
			else
				current = current.rightNode;
			if(current == null){
				return null;
			}	
		}
		return current;	
	}
	
	public void delete(int id){
		
	}
}
