package com.anmol;

public class SinglyLinkedList {
	
	Node head;
	private int size;
	
	public SinglyLinkedList () {
		head = new Node(null);
		size = 0;
	}
	
	public void addAtFront(Object item) {
		Node newNode = new Node(item);
		newNode.next = head.next;
		head.next = newNode;
		size++;
	}
	
	/**
	 * Add item at given index
	 * @param item
	 * @param index
	 */
	public void addAtIndex(Object item, int index) {
		Node newNode = new Node(item);
		Node currentNode = head;
		for(int i=0;i<index;i++) {
			currentNode = currentNode.next;
		}
		newNode.setNext(currentNode.next);
		currentNode.setNext(newNode);
		size++;
	}
	
	public void addAtEnd(Object item) {
		Node newNode = new Node(item);
		Node currentNode = head;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.setNext(newNode);
		size++;
	}
	
	public String toString() {
		String linkList = "";
		Node node = head;
		while(node.next!=null) {
			linkList += "[" + node.next.item + "]";
			node = node.next;
		}
		return linkList;
	}
	
	public boolean isEmpty() {
		if(size>0) {
			return false;
		}
		return true;
	}
	
	public class Node {
		Object item;
		Node next;
		
		public Node(Object item) {
			this.item = item;
			next = null;
		}
		
		public void setNext(Node next) {
			this.next = next;
		}
	}
}
