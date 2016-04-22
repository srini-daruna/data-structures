package com.srini.stack;

import java.util.Stack;

public class ReverseStack {
    
    public static void main(String... args)
    {
	ReverseStack rev = new ReverseStack();
	Stack<Integer> stk = new Stack<Integer>();
	stk.push(1);
	stk.push(2);
	stk.push(3);
	stk.push(4);
	stk.push(5);
	
	rev.revStack(stk);
	while(!stk.isEmpty()){
	    System.out.println(" -- " + stk.pop());
	}
	
    }
    
    public void revStack(Stack<Integer> input)
    {
	if(input.isEmpty())
	    return;
	int data = input.pop();
	revStack(input);
	insertAtBottom(input, data);
    }

    public void insertAtBottom(Stack<Integer> inp, int data)
    {
	if(inp.isEmpty())
	{
	    inp.push(data);
	    return;
	}
	
	int temp = inp.pop();
	insertAtBottom(inp, data);
	inp.push(temp);
    }
    
}
