package com.srini.dynamic;

import java.util.Scanner;

public class CoinsChange {

    public static int[] Table = new int[10001];

    public static int[] denominations = {1,5,10,15,20,25};

    public static void main(String... args)
    {
	System.out.println(" Enter the value that you want to check min change ");
	Scanner scanner = new Scanner(System.in);
	int input = scanner.nextInt();

	for(int i = 0 ; i < Table.length ; i ++)
	{
	    Table[i] = - 1;
	}
	int minChange = MaxChange(input);
	System.out.println(" Minimum change for given value is " + minChange);
	
	scanner.close();
    }

    public static int MaxChange(int n)
    {
	if(n<0) return -1;
	else if (n==0) return 0;
	else if(Table[n] != -1)
	    return Table[n];
	else{
	    System.out.println(" n is " + n);
	    Table[n] = n;
	    System.out.println(" n is " + n + " table of n is " + Table[n]);
	    for(int i = 0; i < denominations.length;i++){
		System.out.println( " Denomination " + denominations[i]);
		if(denominations[i]<=n)
		    Table[n] = Math.min(Table[n], 1+MaxChange(n-denominations[i]));
		System.out.println(" Table[n] " + Table[n]);
	    }
	    return Table[n];
	}
    }
}
