package com.srini.test;

public class DoubleNode {
    int data;
    DoubleNode prev;
    DoubleNode next;
    
    DoubleNode()
    {
	data = 0;
	prev = null;
	next = null;
    }
    
    DoubleNode(int value)
    {
	data = value;
	prev = null;
	next = null;
    }
    
    public void addNode(DoubleNode node)
    {
	this.next = node;
	return;
    }

}
