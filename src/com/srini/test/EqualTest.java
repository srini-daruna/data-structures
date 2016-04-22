package com.srini.test;

public class EqualTest {
	static int a;
	public EqualTest(int x)
	{
		a = x;
	}
	public static void main(String args[])
	{
		EqualTest a = new EqualTest(10);
		EqualTest b = a;
		//EqualTest b = new EqualTest();
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		if( a.equals(b))
			System.out.println("They are equal");
		
	}

}