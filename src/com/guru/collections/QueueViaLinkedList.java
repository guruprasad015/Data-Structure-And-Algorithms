package com.guru.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueViaLinkedList<T> implements Queue<T>{
	
	public static class ListNode<T>{
		T data;
		ListNode<T> next;
		
		ListNode(){
		}
		
	}
	
	ListNode<T> head = null;
	ListNode<T> tail = null;
	int size = 0;

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean contains(Object o) {
		if(head == null)
			return false;
		else{
			ListNode<T> curr = head;
			while(curr != null){
				if(o.equals(curr))
					return true;
			}
		}
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		return new ListIterator<T>(head);
	}
	
	private class ListIterator<T> implements Iterator<T>{
		ListNode<T> current;
		
		ListIterator(ListNode<T> head){
			current = head;
		}

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public T next() {
			if(!hasNext()){
				throw new NoSuchElementException();
			}
			T value = current.data;
			current = current.next;
			return value;
		}
		
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		boolean modified = false;
		if(isEmpty())
			return modified;
		else{
			ListNode<T> curr = head;
			ListNode<T> prev = null;
			while(curr != null){
				if(c.contains(curr)){
					if(curr == head)
						head = head.next;
					else if(curr == tail)
						tail = prev;
					else{
						prev.next = curr.next;
					}
					if(!modified)
						modified = true;
					size--;
				}
				else{
					prev = curr;
				}
				curr = curr.next;
			}			
		}
		return modified;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		boolean modified = false;
		if(isEmpty())
			return modified;
		else{
			ListNode<T> curr = head;
			ListNode<T> prev = null;
			while(curr != null){
				if(c.contains(curr))
					prev = curr;
				else{
					if(curr == head)
						head = head.next;
					else if(curr == tail)
						tail = prev;
					else{
						prev.next = curr.next;
					}
					if(!modified)
						modified = true;
					size--;
				}
				curr = curr.next;
			}			
		}
		return modified;
	}

	@Override
	public void clear() {
		head = null;
		tail = null;
		size = 0;
	}

	@Override
	public boolean add(T e) {
		ListNode<T> oldTail = tail;
		tail = new ListNode<T>();
		tail.data = e;
		tail.next = null;
		if(isEmpty())
			head = tail;
		else
			oldTail.next = tail;
		size++;
		return true;
	}

	@Override
	public boolean offer(T e) {
		ListNode<T> oldTail = tail;
		tail = new ListNode<T>();
		tail.data = e;
		tail.next = null;
		if(isEmpty())
			head = tail;
		else
			oldTail.next = tail;
		size++;
		return false;
	}

	@Override
	public T remove() {
		if(isEmpty())
			throw new NoSuchElementException();
		else{
			T value = head.data;
			head = head.next;
			if(head == null)
				tail = null;
			size--;
			return value;
				
		}
	}

	@Override
	public T poll() {
		if(isEmpty())
			return null;
		else{
			T value = head.data;
			head = head.next;
			if(head == null)
				tail = null;
			size --;
			return value;
		}
	}

	@Override
	public T element() {
		if(isEmpty())
			throw new NoSuchElementException();
		else
			return head.data;
	}

	@Override
	public T peek() {
		if(!isEmpty())
			return head.data;
		return null;
	}

}
