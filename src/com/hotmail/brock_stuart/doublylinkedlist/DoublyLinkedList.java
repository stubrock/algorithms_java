package com.hotmail.brock_stuart.doublylinkedlist;

public class DoublyLinkedList {
	
	protected Node head;
	protected Node tail;
	
	private int sz;
	
	public DoublyLinkedList() {
		head = null;
		tail = null;
		sz = 0;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void prepend(int value) {
		Node nptr = new Node(value);
		
		nptr.setNext(head);
		head = nptr;
		sz++;
	}
	
	public void append(int value) {
		Node nptr = new Node(value);
		
		tail.setNext(nptr);
		tail = nptr;
		sz++;
	}

}
