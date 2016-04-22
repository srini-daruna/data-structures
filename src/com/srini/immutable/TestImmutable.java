package com.srini.immutable;

import java.util.HashMap;

public class TestImmutable {
    
    public static void main(String...args)
    {
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	for(int i = 0 ;i < 20;i++)
	{
	    map.put(new Integer(i), new Integer(i));
	}
	
	for(int i = -20 ;i < 0;i++)
	{
	    map.put(new Integer(i), new Integer(i));
	}
	
	System.out.println(map.keySet());
    }
    
}


