package com.srini.test;
import static com.srini.test.StaticCheck.methodStatic;;;

public class VarArgsTest {
    public static void main(String[] args)
    {
	method1("hi","hello");
	method3(1,3);
	//method2({"hi","hello"});
	methodStatic();
    }
    
    public static void method1(String...arg)
    {
	for(String s:arg)
	    System.out.println(" -- " + s);
    }
    
    public static void method2(String[] arg2)
    {
	for(String s:arg2)
	    System.out.println(" -- " + s);
    }
    
    public static void method3(int... args)
    {
	for(int a:args)
	    System.out.println( " -- " + a);
    }
    
    
}
