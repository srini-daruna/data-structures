package com.srini.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;	 

// Stack Program implementation with Java
public class StackLL
{
	// Main method
	public static void main(String[] args)
	{
		Stack st = new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		int i = 1;
		//st.traverse();
		//st.push(30);
		//System.out.println(st.pop());

		if(st.isEmpty())
			System.out.println(" Stack is Empty ");
		
		st.traverse();
		
		Stack st2 = new Stack();
		st.reverseStack(st, st2);
		
		
		//st2.traverse();
		
		//st.reverseStack(st);
		//st.reverseStack(st);
		
		
		st2.reverse(st2);
		st2.traverse();
		
		
		// Evaluation of Postfix notation
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Do you want to evaluate any postfix notation");
		if(br.readLine().equalsIgnoreCase("Y") ){
		
		System.out.println(" Enter the post fix expression that you wanted to resolve");
		String expression;
		
			expression = br.readLine();

			char[] arr =  expression.toCharArray();

			for(i = 0; i < expression.length(); i++)
			{
				System.out.println(" char at " + i + " is : " + arr[i]);

				switch(arr[i])
				{
				case '*': System.out.println(" Came for multiplication ");
						st.push(st.pop()*st.pop());
						break;
				case '+': System.out.println(" came for addition ");
						st.push(st.pop()+st.pop());	
						break;

				case '/': System.out.println(" came for addition ");
						st.push(st.pop()+st.pop());	
						break;

				default: st.push(Character.getNumericValue(arr[i]));
						break;
				}
			}

			System.out.println(" Result is " + st.pop());
		}
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

