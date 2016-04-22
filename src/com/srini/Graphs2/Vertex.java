package com.srini.Graphs2;	

class Vertex 
{
	String label;
	int value;
	boolean isVisited;

	public Vertex(String name)
	{
		this.label = name;
		this.value = 0;
		isVisited = false;
	}

	public void setValue(int val)
	{
		this.value = val;
	}

	public int getValue()
	{
		return this.value;
	}

	public String getLabel()
	{
		return this.label;
	}

}
