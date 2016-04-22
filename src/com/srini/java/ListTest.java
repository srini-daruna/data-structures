package com.srini.java;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    
    public static void main(String...args)
    {
	List<Integer> list = new ArrayList<Integer>(5);
	
	System.out.println(" Size of list " + list.size());
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	list.add(60);
	list.add(70);
	
	for(Integer number : list)
	{
	    System.out.println(" -- " + number);
	}
	System.out.println(" Size of list " + list.size());
    }

}
