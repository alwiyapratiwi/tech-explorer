package oop.application;

import oop.data.City;
import oop.data.Location;

public class LocationApp {
	
	public static void main(String[] args) {
		
//		var location = new Location(); //ERROR karena abstract
		
		var city = new City();
		city.name = "Medan";
		System.out.println(city.name);
		
	}

}
