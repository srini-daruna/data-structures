package com.srini.test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class GoogleQuestion {
	
	public static void main(String[] args) throws IOException
	{
		System.out.println(" Enter the list of Integers ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		int a[] = new int[input.length()];
		int i = 0;
		for(i =0; i < input.length();i++ )
		{
			a[i] = Integer.parseInt(input.substring(i, i+1));
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(i = 0 ; i < input.length() ; i ++)
			al.add(a[i]);
		
		int sub1[];
		int sub2[];
		
		if((input.length())  % 2 == 0)
		{
			sub1 = new int[input.length()/2];
			sub2 = new int[input.length()/2];
		}else
		{
			sub1 = new int[(input.length()/2)+1];
			sub2 = new int[input.length()/2];
		}
		
		Collections.sort(al);;
		i = 0;
		for(Integer k:al)
		{
			a[i++] = k;
		}
		
		int j;
		
		for(i = 0,j = 0 ; i < input.length();i++,j++)
		{
			sub1[j] = a[i];
			i++;
			
			if( i < input.length())
				sub2[j] = a[i];
			
		}
		
		int x=0,y = 0;
		
		for(i=0;i<sub1.length;i++)
		{
			x = x*10 + sub1[i];
		}
		
		for(i=0;i<sub2.length;i++)
		{
			y = y*10 + sub2[i];
		}
		
		System.out.println(" Sub1 is " + x);
		System.out.println(" Sub2 is " + y);
		
		System.out.println( " Minimum total of the Sub Arrays is " + (x+y));
		
	}

}
