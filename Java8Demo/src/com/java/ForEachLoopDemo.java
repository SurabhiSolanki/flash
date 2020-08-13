package com.java;

import java.util.*;

public class ForEachLoopDemo {
	public static void main(String []ar) {
		List<String> l = new ArrayList<String>();
		l.add("Surabhi");
		l.add("antra");
		l.add("Shhubham");
		/*
		 * for(String s : l) { System.out.println("name "+s); }
		 */
		
		l.forEach(  
	            (n)->System.out.println("name "+n)  
	        );  
		
	}

}
