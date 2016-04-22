package com.srini.linkedlist;

public class SingleLinkedList {
    int data;
    SingleLinkedList next;

    public SingleLinkedList(int value)
    {
	this.data = value;
	this.next = null;
    }

    public SingleLinkedList()
    {
	this.data = 0;
	this.next = null;
    }

    public static SingleLinkedList addNode(int value)
    {
	SingleLinkedList node = new SingleLinkedList(value);
	return node;
    }

    public void addNode(SingleLinkedList newNode)
    {
	SingleLinkedList node = this;
	while(node.next != null)
	    node = node.next;

	newNode.next = null;
	node.next = newNode;
    }

    public void traverse()
    {
	SingleLinkedList head = this;
	while(head != null)
	{
	    System.out.print(" " + head.data + " --> ") ;
	    head = head.next;
	}
    }

    public void removeDuplicates()
    {
	SingleLinkedList head = this;
	SingleLinkedList node = head;
	SingleLinkedList innerNode1;		

	for(;node !=null;node = node.next)
	{
	    innerNode1 = node.next;
	    while(innerNode1 != null)
	    {
		if(node.data == innerNode1.data)
		{
		    System.out.println(" Duplicat found for the data " + node.data);
		    if(innerNode1.next == null)
			innerNode1 = null;
		    else{
			innerNode1.data = innerNode1.next.data;
			innerNode1.next = innerNode1.next.next;
		    }

		}

		if(innerNode1 != null)
		    innerNode1 = innerNode1.next;
		//head.traverse();
		System.out.println();
	    }
	}
    }

    public void deleteRandom()
    {
	SingleLinkedList node = this;


	if(node.next == null){
	    node = null;
	    System.gc();
	}
	else{
	    node.data = node.next.data;
	    node.next = node.next.next;
	}
    }

}
