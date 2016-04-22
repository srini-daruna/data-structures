package com.srini.test;

public class Mountain implements Comparable<Mountain>{
	
	String name;
	Integer height = new Integer(0);
	Integer length = new Integer(0);
	String Country;
	
	public Mountain(String name,int h, int l, String place)
	{
		this.name = name;
		this.height = h;
		this.length = l;
		this.Country = place;
	}
	
	public int getHeight(Mountain n)
	{
		return this.height;
	}
	public int getLength()
	{
		return this.length;
	}
	
	public String getCountry()
	{
		return this.Country;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String toString()
	{
		return this.name;
	}

	@Override
	public int compareTo(Mountain m) {
		
		return name.compareTo(m.name);
	}
	
	@Override
	public int hashCode()
	{
		return name.hashCode();
		
	}
	
	@Override
	public boolean equals(Object m)
	{
		Mountain mount = (Mountain) m;
		return getName().equals(mount.getName());
		
	}
	
}