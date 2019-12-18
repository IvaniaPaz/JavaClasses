package com.class36;

import java.util.HashSet;

public class New {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		  set.add("null");
		  set.add("shiva");
		  set.add("sandish");
		  set.add("asel");
		  set.add("sumair");
		  
		  System.out.println(set);
		  
		  boolean contains= true;
		  if(set.contains("null")){
			  System.out.println(contains);
		  }
		}

	}

