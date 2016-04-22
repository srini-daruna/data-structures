package com.srini.java;

import java.util.LinkedList;

public class PassTest {
    
    String d = "hello ";
    public static void main(String... args)
    {
	PassTest pass = new PassTest();
	LinkedList l1;
	System.out.println(" String before " + pass.d);
	pass.changeValue4(pass.d);
	System.out.println(" String After " + pass.d);
    }
    
    
    
    public void changeValue4(String d) {  
	d = d.toUpperCase();
	System.out.println(" String After " + d);
    }  

}
