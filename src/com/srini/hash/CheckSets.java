package com.srini.hash;

import java.util.HashMap;
import java.util.Map;

public class CheckSets
{
	public static void main(String[] args)
	{
		int[] set1 = { 4, 7, 8, 1, 3, 5, 14};
		int[] set2 = { 4, 7, 8, 1, 3, 6, 14};
		
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		
		for(int i=0;i< set1.length;i++)
		    map1.put(set1[i],1);
		int count = 0;
		
		for(int i=0;i< set2.length;i++)
		{
		    if(!map1.containsKey(set2[i]))
			count++;
		}
		
		if(count == 0)
		    System.out.println(" Sets are same ");
		else
		    System.out.println(" Sets are not same ");
	}
	
	
}
