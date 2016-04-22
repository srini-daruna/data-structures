package com.srini.test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BubbleSort {

	public static void main(String[] args) throws IOException
	{
		System.out.println(" Enter the list of Intergers to sort ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String list = br.readLine();
		System.out.println( " The list of Integers " + list);
		
		int[] a = new int[list.length()];
		int i;
		for(i = 0; i<list.length();i++)
			a[i] = Integer.parseInt(list.substring(i, i+1));
		
		System.out.println();;
		for(i = 0; i<list.length();i++)
			System.out.print(a[i]);
		
		BubSort(a);
		System.out.println();;
		for(i = 0; i<list.length();i++)
			System.out.print(a[i]);
		
	}
	
	public static void BubSort(int[] arr)
	{
		int tmp;
		for(int i =0; i<arr.length;i++)
		{
			for(int j = i+1 ; j<arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
}
