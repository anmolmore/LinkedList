package com.anmol;

public class FindMiddleElement {
	public static void main(String[] args) {
		SinglyLinkedList single = new SinglyLinkedList();
		single.addAtEnd(5);
		single.addAtFront(25);
		single.addAtEnd(100);
		single.addAtIndex(1000, 0);
		single.addAtFront(34);
		single.addAtEnd(986);
		System.out.println(single);
		
		SinglyLinkedList.Node current = single.head;
		SinglyLinkedList.Node middle = single.head;
		int length =0;
		while(current.next != null) {
			current = current.next;
			length++;
			
			if(length%2 == 0) {
				middle = middle.next;
			}
		}
		
		if(length%2 == 1) {
			middle = middle.next;
		}
		System.out.println(middle.item);
	}
}
