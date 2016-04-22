package com.srini.anagrams;

import java.util.HashMap;
import java.util.Scanner;

public class CheckAnagram {

    public static void main(String... args)
    {
	Scanner scanner = new Scanner(System.in);
	System.out.println(" Enter two strings");

	String input1 = scanner.nextLine();
	HashMap<Character, Integer> map = new HashMap<Character, Integer>(); 
	for(int i = 0; i < input1.length(); i++)
	{
	    if(map.containsKey(input1.charAt(i)))
	    	map.put(input1.charAt(i), map.get(input1.charAt(i))+1);
	    else
		map.put(input1.charAt(i), 1);
	}

	String input2 = scanner.nextLine();
	int count = 0;
	for(int i = 0 ; i <input2.length(); i++)
	{
	    if(map.containsKey(input2.charAt(i)))
	    {
		if(map.get(input2.charAt(i)) > 1)
		    map.put(input2.charAt(i), map.get(input2.charAt(i))-1);
		else
		    map.remove(input2.charAt(i));
	    }else if(((int)input2.charAt(i)) >= 97 && map.containsKey((char)((int)input2.charAt(i)-32)))
	    {
		char x = (char)((int)input2.charAt(i)-32);
		if(map.get(x) == 1)
		    map.remove(x);
		 else
		     map.put(x, map.get(x)-1);		
	    }else if(((int)input2.charAt(i)) < 97 && map.containsKey((char)((int)input2.charAt(i)+32)))
	    {
		char x = (char)((int)input2.charAt(i)+32);
		if(map.get(x) == 1)
		    map.remove(x);
		 else
		     map.put(x, map.get(x)-1);
	    }else 
		count++;
	}

	if(count > 0 || map.size() > 0)
	    System.out.println(" They are not anagrams");
	else
	    System.out.println(" They are anagrams");
	scanner.close();
    }

}
