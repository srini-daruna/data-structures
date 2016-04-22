package com.srini.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueReverse {
    
    public void reverseQueue(Queue<Integer> queue, Integer value)
    {
	if(!queue.isEmpty())
	{
	    reverseQueue(queue, queue.poll());
	    
	}
	
	if(value != null)
	{
	    queue.add(value);
	}
	
	if(queue.isEmpty())
	   return;
	
    }
    
    public static void main(String... args)
    {
	Queue<Integer> queue = new LinkedList<Integer>();
	
	queue.add(1);
	queue.add(2);
	queue.add(3);
	queue.add(4);
	
	QueueReverse qr = new QueueReverse();
	
	qr.reverseQueue(queue, null);
	
	while(!queue.isEmpty())
	{
	    System.out.println("-- " + queue.poll());
	}
    }

}
