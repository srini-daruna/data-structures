package com.srini.threads;

import java.util.HashMap;
import java.util.Map;

public class ConcurrencyTest {
    public static void main(String... args) throws InterruptedException
    {
	for(int i = 0 ; i < 10 ; i++)
	{
	    Data.data.put(i, i);
	}
	
	method1();
    }
    
    public static void method1()
    {
	System.out.println("Came to method1");
	System.out.println(Thread.getAllStackTraces());
    }
    

}

class Data
{
    public static Map<Integer, Integer> data = new HashMap<Integer, Integer>();
}

class Thread1 implements Runnable
{
    
    @Override
    public void run()
    {
	for(int i = 1 ; i < 10; i++)
	{
	    System.out.println(" putting value in thread1 ");
	    Data.data.put(i,Data.data.get(i)+2);
	    System.out.println(" value  of " + i + " is " +Data.data.get(i)  );
	}
    }
    
}

class Thread2 implements Runnable
{
    @Override
    public void run()
    {
	for(int i = 1; i < 10; i++)
	{
	    System.out.println(" putting value in thread2 ");
	    Data.data.put(i,Data.data.get(i)+1); 
	    System.out.println(" value  of " + i + " is " +Data.data.get(i)  );
	}
    }
}