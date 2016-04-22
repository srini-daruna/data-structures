package com.srini.selection;

import java.util.HashMap;

public class FirstRepeated {
    
    public static void main(String... args)
    {
	int[] input = {2,3,6,7,8,4,1,5,4,3,4};
	
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	for(int i = 0 ; i < input.length; i++)
	{
	    if(map.get(input[i]) != null)
	    {
		if(map.get(input[i]) > 0)
		    map.put(input[i],-map.get(input[i]));
	    }else
		map.put(input[i],i);
	}
	
	int minIndex = -999;
	int minValue = 0;
	for(Integer key: map.keySet())
	{
	    System.out.println(" key is " + key + "value is "  + map.get(key));
	    if(map.get(key) < 0 && minIndex < map.get(key)){
		minValue = key;
		minIndex = map.get(key);
	    }
	}
	
	System.out.println(" first repeated element is " + minValue);
    }

}
