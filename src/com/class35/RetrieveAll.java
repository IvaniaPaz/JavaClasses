package com.class35;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class RetrieveAll {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> personmap = new LinkedHashMap<>();
		personmap.put("Name", "Ahmet");
		personmap.put("LastName", "Yildiz");
		personmap.put("Adress", "123 test");
		personmap.put("city", "dallas");
		personmap.put("state", "texas");
		personmap.get("state");
	Set<String>	keys=personmap.keySet();
	System.out.println("----------printing using enhanced loop keys------");
	for(String key:keys) {        //printing out all keys one by one after using .keyset and then calling values using .get(key)
		System.out.println(key+":"+personmap.get(key));
	}
	System.out.println("------------using iterator to print keys --------");
	Iterator<String>keysIT=keys.iterator();
	while(keysIT.hasNext()) {
		String mapKey=keysIT.next();
		String mapValue=personmap.get(mapKey);
		System.out.println(mapKey+":"+mapValue);
	}
	System.out.println("-------printing out all values using enhanced loop-----");
	Collection<String>values=personmap.values();
	for(String val:values) {
		System.out.println(val);
	}
	System.out.println("------printing all values using iterator--------");
     Iterator<String> valuesIt=values.iterator();
	while(valuesIt.hasNext()) {
		System.out.println(valuesIt.next());
	}
	//Set<Map.Entry<String,String>> entry=personmap.entrySet();    //to retrieve key and value =entry
 }
}

