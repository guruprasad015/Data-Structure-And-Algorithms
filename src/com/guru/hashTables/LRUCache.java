/*Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and put.

get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.

Follow up:
Could you do both operations in O(1) time complexity?
*/
package com.guru.hashTables;

import java.util.Hashtable;

public class LRUCache {
	
	class DLinkNode{
		int key;
		int value;
		DLinkNode prev;
		DLinkNode post;	
	}
	
	private void addNode(DLinkNode node){
		node.prev = head;
		node.post = head.post;
		head.post.prev = node;
		head.post = node;
	}
	
	private void removeNode(DLinkNode node){
		DLinkNode prev = node.prev;
		DLinkNode post = node.post;
		prev.post = post;
		post.prev = prev;
	}
	
	private int removeFromTail(){
		DLinkNode tailNode = tail.prev;
		removeNode(tailNode);
		return tailNode.key;
	}
	
	private void moveToHead(DLinkNode node){
		removeNode(node);
		addNode(node);
	}
	
	private Hashtable<Integer,DLinkNode> cache = new Hashtable<Integer,DLinkNode>();
	private int count;
	private int capacity;
	private DLinkNode head;
	private DLinkNode tail;
	
	public LRUCache(int capacity) {
		this.capacity = capacity;
		this.count = 0;
		head = new DLinkNode();
		tail = new DLinkNode();
		head.prev = null;
		head.post = tail;
		tail.prev = head;
		tail.post = null;
    }
 
	public int get(int key) {
		DLinkNode node = this.cache.get(key);
		if(node == null)
			return -1;
		this.moveToHead(node);
		return node.value;
        
    }
    
    public void put(int key, int value) {
    	DLinkNode node = this.cache.get(key);
    	if(node == null){
    		DLinkNode newNode = new DLinkNode();
    		newNode.key = key;
    		newNode.value = value;
    		this.cache.put(key, newNode);
    		this.addNode(newNode);
    		count++;
    		
    		if(count>capacity){
    			int removekey = this.removeFromTail();
    			this.cache.remove(removekey);
    			count--;
    		}
    	}
    	else{
    		node.value = value;
    		moveToHead(node);
    	}
    }
    
	public static void main(String[] args) {
		LRUCache cache = new LRUCache(5);
		cache.put(1, 1);
		cache.put(2, 2);
		cache.put(3, 3);
		cache.put(4, 4);
		cache.put(5, 5);
		System.out.println(cache.get(1));
		System.out.println(cache.get(2));
		cache.put(6, 6);
		System.out.println(cache.get(1));
		System.out.println(cache.get(2));
	}

}
