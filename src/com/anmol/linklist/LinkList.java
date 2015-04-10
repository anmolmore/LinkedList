package com.anmol.linklist;

public class LinkList<T> {
	
	public Node<T> head;
	
	public LinkList() {
		head = null;
	}
	
	public void AddAtFront(T item) {
		Node<T> node = new Node<T>(item);
		if(head == null) {
			head = node;
		}
		else {
			node.next = head;
			head = node;
		}
	}
	
	public void AddAtEnd(T item) {
		Node<T> node = new Node<T>(item);
		if(head == null) {
			head = node;
		}
		else {
			Node<T> currentNode = head;
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = node;
		}
	}
	
	@Override
	public String toString() {
		Node currentNode = head;
		if(currentNode == null) {
			return "list is empty";
		}
		else {
			StringBuilder mylist = new StringBuilder();
			while(currentNode != null) {
				mylist.append("[").append(currentNode.item).append("]");
				currentNode = currentNode.next;
			}
			return mylist.toString();
		}
	}
	
	public class Node<T> {
		
		public Node(T item) {
			this.item = item;
			this.next = null;
		}
		
		public T item;
		public Node<T> next;
	}
}
