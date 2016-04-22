package com.srini.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HashDirectChain {

    public static void main(String args[])
    {
	LinkedList hashArray[] = new LinkedList[100];
	try {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println(" Enter the index that you want to add value");
	    Integer val;
	    int data;
	    while(true)
	    {

		System.out.println(" Enter the index that you want to add value");
		val = Integer.parseInt(br.readLine());

		System.out.println(" Enter data for the index " + val);
		data = Integer.parseInt(br.readLine());
		LinkedList node = new LinkedList(data);
		if(hashArray[val] == null)
		    hashArray[val] =  node;
		else
		{
		    LinkedList parent = hashArray[val];
		    parent.addNode(node);
		}

		System.out.println(" Do you want to add more ");
		String response = br.readLine();
		if(response.equalsIgnoreCase("N"))
		    break;

	    }
	    
	    System.out.println(" Enter the index that you want to retrieve");
	    val = Integer.parseInt(br.readLine());
	    
	    if(val < hashArray.length)
	    {
		LinkedList node = hashArray[val];
		node.traverse();
	    }

	} catch (NumberFormatException | IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

}


class LinkedList
{
    int data;
    LinkedList next;

    public LinkedList(int val)
    {
	data = val;
	next = null;
    }

    public LinkedList()
    {
	data = 0;
	next = null;
    }

    public void addNode(LinkedList node)
    {
	LinkedList parent = this;
	while(parent.next != null)
	{
	    parent = parent.next;
	}

	parent.next = node;
    }
    
    public void traverse()
    {
	LinkedList node = this;
	while(node != null)
	{
	    System.out.println(node.data + " ");
	    node = node.next;
	}
    }



}