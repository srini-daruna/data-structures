package com.srini.test;

public class Stack
{
	// Stack class for the implementing stack operations
	Node head;

	public void push(int data)
	{
		// Push the data from Stack
		System.out.println(" Came to push the data " + data);
		Node node = new Node(data);
		node.next = head;
		head = node;
	}

	public int pop()
	{
		// Pop the data from Stack
		int data;
		data = head.data;

		head = head.next;
		return data;
	}

	public boolean isEmpty()
	{
		if(head == null)
			return true;
		else
			return false;

	}
	
	public void reverseStack(Stack s, Stack s2)
	{
		// Reversal of stack using extra stack
		if(s.isEmpty())
			return;
		
		int data = s.pop();
		System.out.println(" data popped is " + data);
		s2.push(data);
		reverseStack(s, s2);

	}
	
	public void reverse(Stack s)
	{
		// Reversal of stack using extra stack
		if(s.isEmpty())
			return;
		
		int data = s.pop();
		System.out.println(" data popped is " + data);
		reverse(s);
		insertAtBottom(s, data);

	}

	public void insertAtBottom(Stack s, int data)
	{
		if(s.isEmpty())
		{
			s.push(data);
			return;
		}
		
		int temp = s.pop();
		insertAtBottom(s,data);
		s.push(temp);
		
	}
	public void traverse()
	{
		Node node = head;
		while(node != null)
		{
			System.out.println(" Value of pop is " + node.data);
			node = node.next;
		}
	}
}
