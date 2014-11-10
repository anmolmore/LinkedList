package com.anmol;

public class FindNElementFromLast {
	public static void main(String[] args) {
		SinglyLinkedList single = new SinglyLinkedList();
		single.addAtEnd(5);
		single.addAtFront(25);
		single.addAtEnd(100);
		single.addAtIndex(1000, 0);
		single.addAtFront(34);
		single.addAtEnd(986);
		System.out.println(single);
		
		int n = 70;
		
		SinglyLinkedList.Node current = single.head;
		SinglyLinkedList.Node nodeToFind = single.head;
		int length =0;
		while(length<n && current.next != null) {
			current = current.next;
			length++;
		}
		
		while(current.next != null) {
			current = current.next;
			nodeToFind = nodeToFind.next;
		}
		
		System.out.println(nodeToFind.next.item);
	}
}
