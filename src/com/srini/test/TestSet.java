package com.srini.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class TestSet {
	
	public static void main(String args[])
	{
		ArrayList<Mountain> al = new ArrayList<Mountain>();
		Mountain everest = new Mountain("Everest",1140,1200,"Asia");
		Mountain Rocky = new Mountain("Rocky",800,1100,"Africa");
		Mountain Vindya = new Mountain("Vinday",900,1000,"India");
		
		al.add(everest);
		al.add(Rocky);
		al.add(Vindya);
		
		Collections.sort(al);
		
		Iterator<Mountain> itr2 = al.iterator();
		
		while(itr2.hasNext())
		{
			System.out.println("Name is " + itr2.next().toString());
			
		}

		Iterator<Mountain> itr3 = al.iterator();
		
		while(itr3.hasNext())
		{
			System.out.println("Name is " + itr3.next().toString());
			
		}
		
	}
	
}
