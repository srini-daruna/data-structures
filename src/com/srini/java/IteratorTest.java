package com.srini.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorTest {
    
    public static void main(String... args)
    {
	ArrayList<Integer> arr = new ArrayList<Integer>();
	List<Integer> carr = new CopyOnWriteArrayList<Integer>();
	
	/*arr.add(1);
	arr.add(2);
	arr.add(4);
	arr.add(5);
	arr.add(6);
	*/
	carr.add(1);
	carr.add(2);
	
	carr.add(4);
	
	carr.add(5);
	
	carr.add(6);
	
	/*Iterator<Integer> itr = arr.iterator();
	Integer out = null;
	while(itr.hasNext())
	{
	   out = itr.next();
	  
	   if(out >= 4)
	   {
	       System.out.println(" -- " + arr.get(1));
	       arr.remove(1);
	   }
	   System.out.println(" Out is " + out);
	}
	*/
	System.out.println("array size is " + carr.size());
	
	Iterator<Integer> itr = carr.iterator();
	
	Integer out = null;
	while(itr.hasNext())
	{
	   out = itr.next();
	   
	   if(carr.size() >= 4)
	   {
	       System.out.println(" Came into condition");
	       System.out.println(" element is " + carr.get(3));
	       carr.remove(1);
	   }
	   System.out.println(" Out is " + out);
	}
	
    }

}

