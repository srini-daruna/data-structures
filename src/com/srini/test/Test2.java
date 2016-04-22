package com.srini.test;

public class Test2 {
	public static void main(String[] args)
	{
		try
		{
			check();
			
			System.out.println( " after the excpetion");
		}finally
		{
			System.out.println(" Huff  ");
		}
	}
	
	static void check() 	{
		System.out.println(1/0);
	}
}

