package com.srini.anagrams;

import java.util.Scanner;

public class CheckAnagrams2 {
    
    public static void main(String... args)
    {
	Scanner scanner  = new Scanner(System.in);
	
	String str1 = scanner.next();
	String str2 = scanner.next();
	
	char[] charArray1 = str1.toCharArray();
	
	char[] charArray2 = str2.toCharArray();
	
	int sum = 0;
	if(str1.length() != str2.length())
	{
	    System.out.println(" They are not equal ");
	}else{
        	for(int i = 0 ; i< charArray1.length;i++)
        	{
        	     if(charArray1[i] > 97 && charArray1[i] < 122)
        	     {
        		 sum = sum + (int) charArray1[i];
        	     }
        	}
        	
	}
    }

}
