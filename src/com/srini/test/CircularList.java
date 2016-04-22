package com.srini.test;
public class CircularList
{
	public static void main(String[] args)
	{
		CList l1 = new CList(10);
		CList l2 = new CList(20);
		CList l3 = new CList(30);
		CList l4 = new CList(40);
		
		l1.addNode(l2);
		l1.addNode(l3);
		l1.addNode(l4);
		l1.addNode(l4);
		
		
		
	}
	
}

class CList
{
	private int data;
	private CList next;
	
	public CList(int value)
	{
		data = value;
		next = null;
	}
	
	public void addNode(CList newNode)
	{
		CList head = this;
		CList node = this;
		
		while(node.next != head)
			node = node.next;
		
		node.next = newNode;
		newNode.next = head;
		
	}
}
