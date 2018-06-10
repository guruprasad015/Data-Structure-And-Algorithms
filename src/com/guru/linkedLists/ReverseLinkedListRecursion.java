package com.guru.linkedLists;

public class ReverseLinkedListRecursion {
	
	public static ListNode reverse(ListNode curr){
		ListNode head = null;
		if(curr.next == null){
			head = curr;
			return head;
		}
		else{
			head = reverse(curr.next);
			curr.next.next = curr;
			curr.next = null;
			return head;
		}
			
		
	}
	
	public static void display(ListNode head){
		ListNode curr = head;
		while(curr!=null){
			System.out.print("->" + curr.val);
			curr = curr.next;
		}
	}

	public static void main(String[] args) {
		ListNode head = null, curr = head;
		for(int i=1; i<=5; i++){
			ListNode newNode = new ListNode(i*10);
			if(curr==null){
				curr = newNode;
				head = curr;
			}
			else{
				curr.next = newNode;
				curr = curr.next;
			}				
		}
		display(head);
		System.out.println();
		ListNode reverseHead = reverse(head);
		
		display(reverseHead);
	}

}
