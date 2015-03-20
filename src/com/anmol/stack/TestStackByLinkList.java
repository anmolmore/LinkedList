package com.anmol.stack;

import junit.framework.Assert;

import org.junit.Test;

/**
 * @see http://howtodoinjava.com/2013/04/06/junit-testcases-which-expects-exception-on-runtime/
 * @author Anmol More
 *
 */
public class TestStackByLinkList {
//	public static void main(String[] args) {
//		StackByLinkList myStack = new StackByLinkList();
//		
//		myStack.pop();
//		myStack.push(5);
//		myStack.push(4);
//		myStack.push(3);
//		myStack.push(2);
//		myStack.push(1);
//		System.out.println(myStack);
//		myStack.push(34);
//		
//		System.out.println(myStack);
//		
//		myStack.pop();
//		myStack.pop();
//		
//		System.out.println(myStack);
//		
//		myStack.push(23);
//		System.out.println(myStack);
//	}

	@Test (expected = NullPointerException.class)
	public void testEmptyStackPop() {
		StackByLinkList myStack = new StackByLinkList();
		myStack.pop();
	}
}
