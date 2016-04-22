package com.srini.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestCollection {
	
	public static void main(String args[])
	{
		ArrayList<Mountain> al = new ArrayList<Mountain>();
		Mountain everest = new Mountain("Everest",1140,1200,"Asia");
		Mountain Rocky = new Mountain("Rocky",800,1100,"Africa");
		Mountain Vindya  = new Mountain("Vindya",910,1200,"India");
		Mountain Vindya2 = new Mountain("Vindya",920,1100,"Pakistan");
		
		al.add(everest);
		al.add(Rocky);
		al.add(Vindya);
		al.add(Vindya2);
		
		Collections.sort(al);
		
		TreeSet<Mountain> ts = new TreeSet<Mountain>();
		ts.addAll(al);
		
		Iterator<Mountain> itr2 = ts.iterator();
		
		while(itr2.hasNext())
		{
			System.out.println("Name from tresset is " + itr2.next().toString());
			
		}

		System.out.println("--------------------");
		HashSet<Mountain> hs = new HashSet<Mountain>();
		hs.addAll(al);
		Iterator<Mountain> itr3 = hs.iterator();
		
		while(itr3.hasNext())
		{
			System.out.println("Name from Hashset is " + itr3.next().toString());
			
		}
		System.out.println("--------------------");
		
		Iterator<Mountain> itr4 = al.iterator();
		
		while(itr4.hasNext())
		{
			System.out.println("Name from Array List is " + itr4.next().toString());
			
		}
		
	}
	
}
