package com.srini.test2;
public class ForNameTest {
    
    public static void main(String... args) throws ClassNotFoundException
    {
	System.out.println(Class.forName("com.srini.test2.ClassA"));
    }

}


class ClassA
{
    static
    {
	System.out.println(" entered n static block;");
    }
    
    public static void test()
    {
	System.out.println(" static method");
    }
    
    public void test2()
    {
	System.out.println("normal method");
    }
    
    public ClassA()
    {
	System.out.println("Entered Constructor");
    }
}