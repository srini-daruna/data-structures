package com.srini.dynamic;

import java.math.BigDecimal;
import java.util.Scanner;

public class ChekFib {
    
    public static void main(String... args)
    {
	Scanner scanner = new Scanner(System.in);
	int limit = scanner.nextInt();
	StringBuilder builder = new StringBuilder();
	for(int i = 0 ; i < limit; i++)
	{
	    BigDecimal input = scanner.nextBigDecimal();
	    if(isPerfectSquare(input.multiply(input).multiply(new BigDecimal(5)).add(new BigDecimal(4))) || isPerfectSquare(input.multiply(input).multiply(new BigDecimal(5)).subtract(new BigDecimal(4))))
	    {
		builder.append("IsFibo" + "\n");
	    }else
		builder.append("IsNotFibo"+ "\n");
	}
	
	System.out.println(builder);
    }
    
    public static boolean isPerfectSquare(BigDecimal input)
    { 
	BigDecimal x = new BigDecimal(Math.round(Math.sqrt(input.doubleValue())));
	return (input.equals(x.multiply(x)));
    }
}
