package com.srini.bitoperations;

import java.math.BigInteger;
import java.util.Scanner;

public class BitOps {
    
    public static void main(String... args)
    {
	 Scanner scanner = new Scanner(System.in);
	 BigInteger[] inputs = new BigInteger[scanner.nextInt()];
	 
	 for(int i =0;i<inputs.length;i++)
	 {
	     inputs[i] = scanner.nextBigInteger();
	 }
	 
	
	 for(int i =0;i<inputs.length;i++)
	 {
	     System.out.println(getInverse(inputs[i]));
	 }
	 scanner.close();
    }
    
    public static BigInteger getInverse(BigInteger input)
    {
	System.out.println("input is " + input.toString());
	 byte[] byteArray = new byte[32];
	 BigInteger zero = new BigInteger("0");
	 BigInteger two = new BigInteger("2");
	
	 for(int i =0;i < byteArray.length;i++)
	 {
	     byteArray[i] = 1;
	 }
	 BigInteger[] results = new BigInteger[2];
	 int i = byteArray.length-1;
	 while(true)
	{
	     if(input.equals(zero))
	     {
		 break;
	     }else
	     {
		 results = input.divideAndRemainder(two);
		 input = results[0];
		 if(!results[1].equals(zero))
		 {
		     byteArray[i] = 0;
		 }
		 i--;
	     }
	}
	 
	 BigInteger sum = zero;
	 
	 for(i = 0; i <byteArray.length;i++)
	 {
	     if(byteArray[i] ==1)
	     {
		 sum = sum.add(two.pow((byteArray.length-1)-i));
	     }
	 }
	 
	 return sum;
    }

}
