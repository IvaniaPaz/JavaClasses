package com.class36;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CarTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Car> mapCar = new LinkedHashMap<>();
		mapCar.put(1, new Car("BMW", "X5"));
		mapCar.put(2, new Car("Tesla", "s"));
		mapCar.put(3, new Car("Mercedes", "S5"));
		mapCar.put(4, new Car("Toyota", "Rav4"));
		mapCar.put(5, new Car("Honda", "Civic"));
		mapCar.put(2, new Car("Lincoln", "S"));
		System.out.println(mapCar.size());
		// display only values obj
		// retrive all keys and values
		Collection<Car> coll = mapCar.values();
		for (Car c : coll) {
			c.display();
		}
		Set<Entry<Integer, Car>> set = mapCar.entrySet();
		Iterator<Entry<Integer, Car>> carIT = set.iterator();
		for (Entry<Integer, Car> ent : set) {
			Integer i = ent.getKey();
			Car c = ent.getValue();
			System.out.println(i + ":" + c.make);
		}
		System.out.println("-------------------------");
		while (carIT.hasNext()) {
			Entry<Integer, Car> carE = carIT.next();
			Integer carKey = carE.getKey();
			Car carVals = carE.getValue();
			System.out.println(carKey + " " + carVals.make);
		}
		// using keyset to map keys to value
		Set<Integer> keySet = mapCar.keySet();
		for (int key : keySet) {
			System.out.println(key + mapCar.get(key).make);

			Car car = mapCar.get(key);
			String carDetails = car.make + "-" + car.model;
			System.out.println(key + "=" + carDetails);
		}
		
		Iterator<Entry<Integer, Car>> entryIt=set.iterator();
		while(entryIt.hasNext()) {
		Entry<Integer, Car> ent=entryIt.next();
		String entry=ent.getKey()+"-"+ent.getValue();
		System.out.println(entry);
		}

	}
}