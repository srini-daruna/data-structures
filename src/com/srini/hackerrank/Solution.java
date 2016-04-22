package com.srini.hackerrank;

import java.math.BigDecimal;
import java.util.Scanner;

public class Solution {
    
    public static void main(String... args)
    {
	Scanner in = new Scanner(System.in);
        int t = in.nextInt();
	
        for(int i = 0; i < t; i++){
            System.out.println(getMaxChocs(in.nextBigDecimal()));
        }
    }
    
    public static BigDecimal getMaxChocs(BigDecimal input)
    {
	BigDecimal oneHalf = (input.divideToIntegralValue(new BigDecimal(2)));
	System.out.println(oneHalf);
	BigDecimal secondHalf = oneHalf.add(input.remainder(new BigDecimal(2)));
	return oneHalf.multiply(secondHalf);
    }
}
