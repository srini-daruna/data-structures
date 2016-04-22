package com.srini.test;

public class DoubleLinkedList {
	public static void main(String[] args)
	{
		DoubleList l1 = new DoubleList(10);
		DoubleList l2 = new DoubleList(20);
		DoubleList l3 = new DoubleList(30);
		DoubleList l4 = new DoubleList(40);
		
		l1.addNextNode(l2);
		l2.addNextNode(l3);
		l3.addNextNode(l4);
		
		//l1.traverse();
		
		l2.delete();
		l1.delete();
		l4.delete();
		l3.traverse();
	}

}

class DoubleList
{
	int data;
	DoubleList prev;
	DoubleList next;
	
	public DoubleList(int value)
	{
		data = value;
		prev = null;
		next = null;
	}
	
	public void addNextNode(DoubleList node)
	{
		if(this.next != null)
		{
			System.err.println(" There is already a  node present in this place ");
		}else
		{
			this.next = node;
			node.prev = this;
		}
	}
	
	public void traverse()
	{
		DoubleList node = this;
		while(node != null)
		{
			System.out.println(" value is " + node.data);
			node = node.next;
		}
		
	}
	
	public void delete()
	{
		DoubleList node = this;
		if(this.prev == null)
		{
			// This is head node
			node.next.prev = this.prev;
		}
		else{
		DoubleList prev = this.prev;
		prev.next = node.next;
		}
	}
	
}