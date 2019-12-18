package com.class35;

import java.util.HashMap;

public class Task {

	public static void main(String[] args) {

		HashMap<Integer, String> building=new HashMap<>();
		building.put(1, "Synatax");
		building.put(2, "Smiles at FFX");
		building.put(3, "Let's Smile");
		building.put(4, "Koons");
		building.put(1, "Synatax");
		building.put(2, "Smiles at FFX");
		building.put(7, "Red Door Spa");
		
		//find how many entires
		boolean bu=building.isEmpty();
		if(!bu) {
			int size=building.size();
			System.out.println(size);
		}
		
		//update company on 4th floor
		building.replace(4, "Silent Circle");
		System.out.println(building);
		
		//remove company on 7th floor
		building.remove(7);
		
		System.out.println(building);
		
		
	}

}
