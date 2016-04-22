package com.srini.stack;

import java.util.Stack;

public class StackRev {
    
    
    public static void main(String... args)
    {
	Stack<Integer> stk = new Stack<Integer>();
	stk.push(1);
	stk.push(2);
	stk.push(3);
	stk.push(4);
	stk.push(5);
	
	System.out.println("" + stk.peek());
	System.out.println(stk.elements());
	
	StackRev stackRev = new StackRev();
	stackRev.StackReverse(stk);
	
	while(!stk.isEmpty())
	{
	    System.out.println("--- " + stk.pop());
	}
	
    }
    
    public void StackReverse(Stack<Integer> input)
    {
	if(input.isEmpty())
	    return;
	
	Integer data = null;
	data = input.pop();
	StackReverse(input);
	insertAtBottom(input, data);
    }
    
    public void insertAtBottom(Stack<Integer> stk, Integer data)
    {
	if(stk.isEmpty())
	{
	    stk.push(data);
	    return;
	}
	
	int val = (Integer)stk.pop();
	insertAtBottom(stk,data);
	stk.push(val);
    }

}

