package com.srini.random;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
    
    public static void main(String[] args)
    {
	Map<String, Object> imap = null;
	List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
	imap = new IdentityHashMap<String, Object>();
	for(int i = 0; i < 5; i++){
	    
	    imap.put(new String("test"), "Srini "+ i);
	    
	}
	
	System.out.println(imap);
	
	System.out.println(" Final String " + list);
	
    }

}
