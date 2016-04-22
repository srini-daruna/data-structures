package com.srini.stack;

import java.util.Stack;

public class SortStack {

    public Stack<Integer> sortStack(Stack<Integer> stack)
    {
	Stack<Integer> out = new Stack<Integer>();
	Integer temp = null;
	while(!stack.isEmpty())
	{
	    temp = stack.pop();
	    {
		if(!out.isEmpty() && temp > out.peek())
		{
		    stack.push(out.pop());
		}
	    }

	    out.push(temp);
	}
	return out;
    }
    
    public static void main(String... args)
    {
	Stack<Integer> stack = new Stack<Integer>();
	stack.push(3);
	stack.push(2);
	stack.push(1);
	stack.push(4);
	
	SortStack srt = new SortStack();
	Stack<Integer> out = srt.sortStack(stack);
	while(!out.isEmpty())
	{
	    System.out.println(" -- " + out.pop());
	}
    }
}
