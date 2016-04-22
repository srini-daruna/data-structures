package com.srini.random;

import java.util.Scanner;

public class PrimeNumbers {
    
    public static void main(String... args)
    {
	Scanner scanner = new Scanner(System.in);
	System.out.println(" Enter the number below which you want to check prime numbers");
	
	int input = scanner.nextInt();
	int array[] = new int[input];
	
	for(int i = 2; i < Math.sqrt(input);i++)
	{
	    int k = i*i;
	    while(k < input)
	    {
		array[k] = -1;
		k = k +i;
	    }
	}
	
	for(int i =2; i <input;i++)
	{
	    if(array[i] != -1)
		System.out.println(" -- " + i);
	}
    }

}
