package com.class36;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class EntryHashmap {

	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap<>();
	    map.put("Street","Patrick ST");
	    map.put("Suite","265");
	    map.put("City","Vienna");
	    map.put("Zip","22180");
	    map.put("Country","United State");
	    
	    Set<Entry<String,String>> entry=map.entrySet();
			for (Entry<String, String> all: entry) {
				System.out.println(all.getValue().toUpperCase());
			}

	}

}
