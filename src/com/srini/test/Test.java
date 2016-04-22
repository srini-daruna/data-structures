package com.srini.test;

public class Test {

	public static void throwit()
	{
		System.out.println(" Throw it");
		throw new RuntimeException();
	}
	
	public static void main(String args[])
	{
		try
		{
			System.out.println(" Helloo ");
			throwit();
		}catch(Exception e)
		{
			System.out.println(" Caught ");
		}finally{
			System.out.println(" Finally ");
		}
		
		System.out.println(" After... ");
	}
	
}
