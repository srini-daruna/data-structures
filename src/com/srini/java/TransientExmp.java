package com.srini.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientExmp {
    
    public static void main(String...args)
    {
	try {
	TransientTest test = new TransientTest(10,"srini");
	File outFile = new File("D:/progs/serialtest.txt");
	FileOutputStream fos = new FileOutputStream(outFile);
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(test);
	
	FileInputStream fis = new FileInputStream(outFile);
	ObjectInputStream ois = new ObjectInputStream(fis);
	Object obj = ois.readObject();
	if(obj instanceof TransientTest)
	{
	    System.out.println(" It is the transient test class");
	    TransientTest test2 = (TransientTest)obj;
	    System.out.println(test2.getName());
	    System.out.println(test2.getValue());
	    System.out.println(test2.getSerialId());
	}
	
	
	
	ois.close();
	oos.close();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (ClassNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	
	
    }

}


class TransientTest implements Serializable
{
    private static final long serialVersionUID = 42L;
    int value;
    String name;
    
    public TransientTest(int value, String name)
    {
	this.value = value;
	this.name = name;
    }
    
    public int getValue()
    {
	return this.value;
    }
    
    public String getName()
    {
	return this.name;
    }
    
    public static Long getSerialId()
    {
	return serialVersionUID;
    }
}