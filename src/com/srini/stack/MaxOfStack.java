package com.srini.stack;

import java.util.Stack;

public class MaxOfStack {
    Integer max = 0;
    public static void main(String... args)
    {
	Stack<Integer> stack = new Stack<Integer>();
	stack.push(3);
	stack.push(2);
	stack.push(1);
	stack.push(4);
	stack.push(6);
	stack.push(3);
	stack.push(2);

	MaxOfStack maxStack = new MaxOfStack();
	
	maxStack.getMaxOfStack(stack, null);
		
	System.out.println(" Maximum value is " + maxStack.max);

	while(!stack.isEmpty())
	{
	    System.out.println(" Stack values are " + stack.pop());

	}

    }


    public void getMaxOfStack(Stack<Integer> stack, Integer value)
    {
	if(!stack.isEmpty())
	{
	    if(stack.peek() > max)
		max = stack.peek();
	    
	    getMaxOfStack(stack, stack.pop());
	}

	if(value != null)
	{
	    stack.push(value);
	}
	
	return;
    }
}
