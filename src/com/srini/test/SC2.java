package com.srini.test;

class A
{
	A()
	{
		System.out.println(" in A");
	}
}

class B extends A
{
	B()
	{
		System.out.println(" in B ");
		
	}
	
}

public class SC2 
{
	public static void main(String[] args)
	{
		B b = new B();
		
	}
}