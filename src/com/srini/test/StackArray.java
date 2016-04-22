package com.srini.test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class StackArray
{
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
		System.out.println(" How many numbers you want to have in the stack at maximum :");
		int count = Integer.parseInt(br.readLine());
		int[] stack = new int[count];
		StackArr st = new StackArr();
		
		// push operations
		st.push(stack, 10);
		st.push(stack, 20);
		
		System.out.println(" Value at the pop is " + st.pop(stack));
			
		}catch(IOException e)
		{	
			// IO Exception occurred
			System.out.println(" IO Exception Occurred ");
		}
		finally
		{
			try {
				br.close();
			} catch (IOException e) {
				// IO Exception Occurred
				System.out.println(" IO Exception occurrred ");
				e.printStackTrace();
			}
		}
	}
}

class StackArr
{
	public void push(int[] stack, int Data)
	{	
		// Push function 
		int i;
		for(i =0; i < stack.length; i++)
		{	
			if(stack[i] == 0)
				break;
		}
		
		if(i >= stack.length)
		{
			System.err.println(" Stack over flow ");
			return;
		}
		stack[i] = Data;
 		System.out.println(" came to push ");
	}
	
	public int pop(int[] stack)
	{
		// POP Function
		int i = 0;
		for(i = 0; i < stack.length; i++)
		{
			if(stack[i] == 0)
				break;
		}
		if( i == 0)
		{
			// If Stack is empty return error message
			System.err.println(" Stack is Empty ");
			return 0;
		}else{
		int data = stack[i-1];
		stack[i-1] = 0;
		return data;
		}	
			
	}
}