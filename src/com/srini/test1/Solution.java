package com.srini.test1;

import java.util.HashMap;
import java.util.Scanner;

public class Solution
{
    public static void main(String... args)
    {
	Scanner scanner = new Scanner(System.in);
	Node head = null;
	int count = scanner.nextInt();
	for(int i = 0; i < count;i++)
	{
	    if(head == null)
	    {
		head = Node.addHeadNode(scanner.nextInt());
	    }else
		head.addNode(scanner.nextInt());
	}
	
	System.out.println(" -------------------  ");
	head.traverse();
	head.removeDuplicates();
	System.out.println(" -------------------  ");
	head.traverse();
	
	scanner.close();
    }
    
    static class Node
    {
	int data;
	Node next;
	
	Node(int data)
	{
	    this.data = data;
	    this.next = null;
	}
	
	public static Node addHeadNode(int val)
	{
	    Node headNode = new Node(val);
	    return headNode;
	}
	public void addNode(int val)
	{
	    Node root = this;
	    while(root.next != null)
	    {
		root = root.next;
	    }
	    
	    Node newNode = new Node(val);
	    root.next = newNode;
	}
	
	public void traverse()
	{
	    Node root = this;
	    
	    while(root != null)
	    {
		System.out.println(" -- > " + root.data);
		root = root.next;
	    }
	}
	
	public void removeDuplicates()
	{
	    HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
	    Node root = this;
	    Node prevNode = this;
	    
	    while(root != null)
	    {
		if(map.containsKey(root.data))
		{
		    prevNode.next = root.next;
		}else
		    map.put(root.data, 1);
		
		prevNode = root;
		root = root.next;
	    }
	}
    }
}


