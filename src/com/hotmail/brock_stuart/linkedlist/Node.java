package com.hotmail.brock_stuart.linkedlist;

import java.util.Scanner;

public class Node {
	
	private static int sz;
	
	protected int data;
	protected Node prev;
	protected Node next;
	
	public Node() {
		data = 0;
		prev = null;
		next = null;
		sz = 0;
	}
	
	public Node(int data, Node prev, Node next) {
		this.prev = prev;
		this.next = next;
		this.data = data;
		sz++;
	}
	
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public Node getPrev() {
		return this.prev;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public int getInt() {
		return data;
	}

}
