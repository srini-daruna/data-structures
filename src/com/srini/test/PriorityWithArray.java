package com.srini.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PriorityQueue {
    int[] PriorityQueueArray;;
    int top = 0;

    public PriorityQueue(int size)
    {
	PriorityQueueArray = new int[size];
    }
    public void insertElement(int data)
    {
	if(top == PriorityQueueArray.length)
	{
	    System.out.println(" Size overflow ");
	    return;
	}
	
	PriorityQueueArray[top++] = data;
    }
    
    public void deleteElement()
    {
	int max = 0;
	int maxPos = 0;
	for(int i =0;i<PriorityQueueArray.length;i++)
	{
	    if(PriorityQueueArray[i] > max)
	    {
		max = PriorityQueueArray[i];
		maxPos = i;
	    }
	}
	
	PriorityQueueArray[maxPos] = 0;
	
	System.out.println(" Deleted element is " + max);
    }

}

public class PriorityWithArray
{
    public static void main(String[]  args)
    {
	System.out.println(" Enter the number of elements that you want ");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	try {
	    int size = Integer.parseInt(br.readLine());
	    
	    PriorityQueue pq = new PriorityQueue(size);
	    pq.insertElement(10);
	    pq.insertElement(20);
	    pq.insertElement(15);
	    pq.insertElement(12);
	    pq.insertElement(16);
	    pq.insertElement(17);
	    pq.insertElement(22);
	    
	    pq.deleteElement();
	} catch (NumberFormatException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	
    }
    
}