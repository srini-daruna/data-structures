package com.srini.selection;

import java.util.HashMap;

//Problem 1 - Finding Duplicates Efficiently

public class CheckDups
{
    public static void main(String... args)
    {
	int[] input = {2,3,6,7,8,4,6,1,5};
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	// Case 1 - Straight forward using Hash Table
	for(int i = 0; i < input.length;i++)
	{
	    if(map.get(input[i]) == null)
		map.put(input[i], 1);
	    else
		System.out.println(" repeated " + input[i]); 
	}
	
	// Case 2 if the elements are between 1 to n and time complexity will be O[n] and space complexity will be 
	
	int[] out =new int[9];
	for(int i = 0; i<input.length ; i++)
	{
	    if(out[input[i]] < 0 )
	    {
		System.out.println(" repeated value " + input[i]);
	    }else
		out[input[i]] = -input[input[i]];
	    
	}
	    


    }
}