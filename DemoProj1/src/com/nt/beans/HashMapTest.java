package com.nt.beans;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
	 HashMap hm=new HashMap();
	
	 System.out.println(hm.size());
	 System.out.println(hm);
	 System.out.println();
	hm.put("a",1);
	hm.put("b", 2);
	hm.put(97,7);
	hm.put("a", 6);
	hm.put(new Example(5,6),8);
	hm.put(new Example(5,6),89);
    hm.put("d", 9);
    hm.put(new Example(3,4),0);
	 System.out.println(hm.size());
	 System.out.println(hm);
	}

}
