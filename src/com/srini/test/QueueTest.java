package com.srini.test;

public class QueueTest {
	public static void main(String args[])
	{
		QueueLL q1 = new QueueLL();
		
		q1.enque(10);
		q1.enque(20);
		q1.enque(30);
		q1.enque(10);
		
		
		q1.traverse();
		
		q1.deque();
		q1.deque();
		q1.deque();
		q1.deque();
		
	}

}
