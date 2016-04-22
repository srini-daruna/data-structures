package com.srini.test;

public class ThreadTest {
	
	public static void main(String[] args)
	{
	MyThread t = new MyThread();
	t.start();
	int x = method(0);
	System.out.println(x);
	}
	
	static int method(int a)
	{
		try
		{
		return 20/a;
		}catch(ArithmeticException e)
		{
			System.out.println(" Caught  ");
			return 100;
		}finally
		{
			return 200;
		}
	}
}


class MyThread extends Thread
{
	/*public void start()
	{
		System.out.println(" HI ");
	}*/
	
	public void run()
	{
		System.out.println(" Hello ");
		
		
	}
}