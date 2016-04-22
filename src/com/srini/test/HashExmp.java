package com.srini.test;
import java.util.HashMap;


public class HashExmp {
	
	public static void main(String args[])
	{
		HashMap<String,String> hs = new HashMap<String,String>();
		
		hs.put("Srini", "first");
		hs.put("srini", "second");
		System.out.println(hs.get("Srini"));
		System.out.println(hs.get("srini"));
	}

}