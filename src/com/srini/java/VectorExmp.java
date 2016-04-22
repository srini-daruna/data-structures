package com.srini.java;

import java.util.ArrayList;
import java.util.Vector;

public class VectorExmp {
    
    public static void main(String... args)
    {
	Vector<Integer> v = new Vector<Integer>();
	
	ArrayList<Integer> arr = new ArrayList<Integer>();
	arr.ensureCapacity(5);
	v.add(1);
	v.add(2);
	
	arr.add(1);
	arr.add(2);
	System.out.println(" Size of Vectore Before clear is " + v.size());
	System.out.println(" Size of Array is " + arr.size());
	System.out.println(" Capacity of Vector is " +  v.capacity());
	for(int i = 1 ; i <= 9 ; i++)
	{
	    v.add(i+2);
	    arr.add(i+2);
	}
	
	System.out.println(" Capacity of Vector is " +  v.capacity());
	System.out.println(" Size of Array is " + arr.size());
	
	for(int i = 1 ; i <= 12 ; i++)
	{
	    v.add(i+2);
	    arr.add(i+2);
	}
	System.out.println(" Capacity of Vector is " +  v.capacity());
		
	
	
	
	
	
	
	v.clear();
	arr.clear();
	System.out.println(" Size after clear is " + v.size());
	System.out.println(" Size of Array After clear is " + arr.size());
    }

}
