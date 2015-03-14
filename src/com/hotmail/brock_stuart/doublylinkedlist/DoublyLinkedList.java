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
	
	public int getSize() {
	    return sz;
	}
	
	public void prepend(int value) {
        insertAtPos(value, 1);
    }
	
	public void append(int value) {
	    insertAtPos(value, sz + 1);
	}
	
	public void insertAtPos(int value, int pos) {

	    if (pos < 1) {
	        System.out.println("Supplied position must be positive.");
	        return;
	    }

	    Node newNode = new Node(value);
	    
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else if (pos == 1) {
	        newNode.setNext(head);
	        head.setPrev(newNode);
	        head = newNode;
	    } else if (pos > sz) {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
	    } else {
	        Node curNode = head;
	        int i = 1;
	        
	        while (i < pos) {
	            curNode = curNode.getNext();
	            i++;
	        }

	        newNode.setPrev(curNode.getPrev());
            newNode.setNext(curNode);
            curNode.getPrev().setNext(newNode);
            curNode.setPrev(newNode);
	    }
        sz++;
	}
	
	public void deleteAtPos(int pos) {
	    if (isEmpty()) {
	        System.out.println("List empty, nothing to delete");
	        return;
	    }
	    
	    if (pos < 1 || pos > sz) {
	        System.out.println("Position out of bounds, must be 1 <= pos <= " + sz);
	        return;
	    }
	    
	    if (pos == 1) {
	        head = head.getNext();
	        head.setPrev(null);
	    } else if (pos == sz) {
	        tail = tail.getPrev();
	        tail.setNext(null);
	    } else {
	        Node curNode = head;
	        int i = 1;
	        
	        while (i < pos) {
	            curNode = curNode.getNext();
	            i++;
	        }
	        
	        curNode.getPrev().setNext(curNode.getNext());
	        curNode.getNext().setPrev(curNode.getPrev());
	    }
	    sz--;
	}
	
	public void display() {
	    if (isEmpty()) {
	        System.out.println("List is empty, nothing to see here.");
	        return;
	    }
	    
	    Node curNode = head;
	    
	    System.out.print("\nhead -> ");
	    do {
	        System.out.print(curNode.getData() + " -> ");
	        curNode = curNode.getNext();
	    } while (curNode != null);
	    System.out.println("tail");
	}

}
