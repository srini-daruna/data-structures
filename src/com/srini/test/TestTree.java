package com.srini.test;

import java.util.TreeSet;

public class TestTree {
	public static void main(String[] args)
	{
		new TestTree().go();
	}
	
	public void go()
	{
		Book b1 = new Book("First Book");
		Book b2 = new Book("Third Book");
		Book b3 = new Book("Second Book");
		
		TreeSet<Book> ts = new TreeSet<Book>();
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		
		for(Book b:ts)
			System.out.println(b.title);
		
	}
	
	class Book implements Comparable<Book>{
		String title;
		Book(String t)
		{
			title = t;
		}
		@Override
		public int compareTo(Book arg0) {
			// TODO Auto-generated method stub
			return title.compareTo(arg0.title);
		}
	}

}
