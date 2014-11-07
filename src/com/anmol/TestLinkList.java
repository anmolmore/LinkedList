package com.anmol;

public class TestLinkList {

	public static void main(String[] args) {
		SinglyLinkedList single = new SinglyLinkedList();
		single.addAtEnd(5);
		single.addAtFront(25);
		single.addAtEnd(100);
		single.addAtIndex(1000, 0);
		System.out.println(single);

	}

}
