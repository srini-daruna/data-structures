package com.srini.bitoperations;

public class BitOperations {
    public static void main(String... args)
    {
	Integer x = 23;
	Integer y = 24;
	
	// Multiplication with any 2 power using Bit operations
	System.out.println(" multiplied by 2 is " + (x << 1));
	System.out.println(" multiplied by 4 is " + (x << 2));

	// Division with any 2 power using Bit operations
	System.out.println(" multiplied by 2 is " + (x >>> 1));
	System.out.println(" multiplied by 4 is " + (x >> 1));

	// Addition using Bit Wise Operators
	int andResult = 0;

	while( y != 0 )
	{
	    andResult = x & y;
	    x = x ^ y;
	    y = andResult << 1;
	}
	System.out.println(" addition is " + x);
    }
}
