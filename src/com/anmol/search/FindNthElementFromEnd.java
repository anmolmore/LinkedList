package com.anmol.search;

import com.anmol.linklist.LinkList;
import com.anmol.linklist.LinkList.Node;

public class FindNthElementFromEnd {
	public static void main(String[] args) {
		LinkList list = init();
		
		int size = 0;
		Node currentNode = list.head;
		while(currentNode != null) {
			size++;
			currentNode = currentNode.next;
		}
		
		int index = 6;
		int item = findElementAtIndex(list.head, size-index);
		System.out.println("Element at " + index + " from end is " + item);
	}
	
	public static int findElementAtIndex(Node currentNode, int index) {
		for(int i=0; i<index; i++) {
			currentNode = currentNode.next;
		}
		return (Integer) currentNode.item;
	}
	
	public static LinkList init() {
		LinkList list = new LinkList();
		for(int i=0;i<10;i++) {
			if(i%2 == 0) {
				list.AddAtEnd(i*i);
			}
			else {
				list.AddAtFront(i*i);
			}
		}
		System.out.println(list);
		return list;
	}
}
