package com.srini.test;

public class QueueLL
{
	Node front;
	Node rear;
	
	public QueueLL()
	{
		front = null;
		rear = null;
	}
	
	// Enque operation of Queue. 
	public void enque(int data)
	{
		Node node = new Node(data);;
		if(front == null)
			front = rear = node;
		else
		{
			rear.next = node;
			rear = node;
		}
	}
	
	public int deque()
	{
		Node node;
		int data;
		if(front == null)
		{
			System.out.println(" Queue is empty");
			return 0;
		}
		
		if(front == rear)
		{	
			System.out.println(" Element dequed is " + front.data);
			data = front.data;
			front = rear = null;
			return data;
		}	
		
		System.out.println(" Element dequed is " + front.data);
		data = front.data;
		node = front;
		front = front.next;
		node = null;
		
		return data;
		
	}
	
	public void traverse()
	{
		Node node = front;
		System.out.println(" Traversing from Front to rear ");
		while(node != null)
		{
			System.out.println(node.data);
			node = node.next;
		}
	}
	
	public boolean isEmpty()
	{
	    if(front == null)
		return true;
	    else 
		return false;
	}
	
}