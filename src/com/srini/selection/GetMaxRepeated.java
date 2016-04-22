package com.srini.selection;

import java.util.HashMap;

public class GetMaxRepeated {
    
    public static void main(String... args)
    {
	int[] input = {2,3,6,7,8,4,1,5,4,3,4};
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	// Case 1 - Straight forward using Hash Table
	for(int i = 0; i < input.length;i++)
	{
	    if(map.get(input[i]) == null)
		map.put(input[i], 1);
	    else
		map.put(input[i], map.get(input[i])+1); 
	} 
	
	int maxCounter  = 0;
	int maxValue = 0;
	for(Integer val: map.keySet())
	{
	    if(map.get(val) > maxCounter)
	    {
		maxCounter = map.get(val);
		maxValue = val;  
	    }
	}
	
	System.out.println(" Max times repeated value is " + maxValue);
	
	// Case 2 If the elements are less than n
	int n = 9;
	for(int i = 0 ; i < input.length; i++)
	{
	    input[input[i]%n] = n + input[input[i]%n];
	    System.out.println(input[i]%n);
	    System.out.println(input[input[i]%n]);
	}
	int max = 0;
	
	for(int i = 0 ; i < input.length; i++)
	{
	    if(max < input[i]/n)
	    {
		max = input[i]/n;
		maxValue = i;
	    }
	}
	
	System.out.println(" Max index is " + maxValue);
    }

    
    
}
