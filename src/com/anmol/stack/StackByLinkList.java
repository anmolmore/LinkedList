package com.anmol.stack;

/***
 * @see http://codereview.stackexchange.com/questions/62710/stack-implementation-using-a-linked-list
 * @see http://www.sanfoundry.com/java-program-implement-stack-using-linked-list/
 * @author Anmol More
 *
 */
public class StackByLinkList {
	public static int size = 0;
	Node head;
	
	public StackByLinkList() {
		head = null;
		size = 0;
	}
	
	public void push(int data) {
//		if(head == null) {
//			Node newNode = new Node(data);
//			head = newNode;
//		}
//		else {
			Node newNode = new Node(data);
			newNode.setNext(head);
			head = newNode;
		//}
		size++;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		Node current = head;
		if(current == null) {
			builder.append("Stack is empty");
		}
		else {
			while(current != null) {
				builder.append(current.getData()).append(" --> ");
				current = current.getNext();
			}
		}
		return builder.toString();
	}
	
	public void pop() {
		//We don't need this check, stacks don't throw exception on being empty
		if(head == null) {
			throw new NullPointerException();
		}
		else {
			head = head.getNext();
		}
		size--;
	}
}

class Node {
	private int data;
	private Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	public Node() {
		this.next = null;
	}

	public int getData() {
		return this.data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getNext() {
		return this.next;
	}
}
