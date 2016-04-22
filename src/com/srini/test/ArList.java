package com.srini.test;

import java.util.ArrayList;
import java.util.Collections;

public class ArList {
	public static void main(String args[])
	{
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("srinivas");
		myList.add("Kiran");
		
		System.out.println("Total Array Size :" + myList.size());
		myList.remove(1);
		System.out.println("Total Array Size :" + myList.size());
		myList.ensureCapacity(10);
		myList.add("Allada");
		System.out.println("Total Array Size :" + myList.size());
		myList.clear();
		System.out.println("Total Array Size :" + myList.size());
		myList.add("One");
		myList.set(0, "Arjung");
		System.out.println("Total Array Size :" + myList.size());
		myList.add("Ravi");
		myList.add("Suresh");
		myList.add("Ramesh");
		
		Collections.sort(myList);
		
		//myList.remove(1);
		
		for(String str : myList)
		{
			System.out.println("Object value is :"+str);
		}
		
		ArrayList a2 = new ArrayList();
		
		a2.add(200);
		a2.add(300);
		a2.add(100);
		a2.add(250);
		
		Collections.sort(a2);;
		
		
		
	}

}
