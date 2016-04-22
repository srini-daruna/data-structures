package com.srini.dynamic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FibDynamic {
    public static int[] fib;
    public static int count = 1;

    public static void main(String... args) {
	try {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println(" Enter the number that you want Fibnocci value");
	    int number = Integer.parseInt(br.readLine());

	    fib = new int[number];

	    Long startTime = System.nanoTime();
	    //int fibValue = fibNormal(number);
	    Long endTime = System.nanoTime();
	    //System.out.println(" Fibnocci value is " + fibValue);
	    //System.out.println(" time taken for normal is " + (endTime - startTime));

	    startTime = System.nanoTime();
	    
	    int fibValue = fibNormal(number);
	    
	    System.out.println(" Value is " + fibValue);
	    
	    System.out.println(" Count is " + count);
	    fibValue = fibDynamic(number);
	    endTime = System.nanoTime();

	    System.out.println(" Fibnocci value by Dynamic is " + fibValue);
	    System.out.println(" time taken for Dynamic programming is " + (endTime - startTime));


	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    public static int fibNormal(int n) {
	count++;
	if(n == 1 || n ==2 )
	    return 1;
	else 
	    return fibNormal(n-1)+fibNormal(n-2);

    }

    public static int fibDynamic(int n) {
	fib[0] = 1;
	fib[1] = 1;
	int count = 1;

	for (int i = 2; i < n; i++){
	    fib[i] = fib[i - 1] + fib[i - 2];
	    count++;
	}
	
	System.out.println(" Dynamic count " + count);
	return fib[n - 1];
	
    }
}