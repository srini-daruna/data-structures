package com.srini.test;

public class fibnacci {
	public static void main(String args[])
	{
		int value = fib(5);
		System.out.println(" Fib at given value " + value);
	}
	
	public static int fib(int x)
	{
		if(x <= 1 )
			return 1;
		else 
			return fib(x-1) + fib(x-2);
	}

}
