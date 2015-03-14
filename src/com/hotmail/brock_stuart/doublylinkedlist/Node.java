package com.hotmail.brock_stuart.doublylinkedlist;

public class Node {
	
	protected int data;
	protected Node prev;
	protected Node next;
	
	public Node() {
		data = 0;
		prev = null;
		next = null;
	}
	
	public Node(int data) {
		this.data = data;
		prev = null;
		next = null;
	}
	
	public Node(int data, Node prev, Node next) {
		this.prev = prev;
		this.next = next;
		this.data = data;
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
	
	public int getData() {
		return data;
	}

}
