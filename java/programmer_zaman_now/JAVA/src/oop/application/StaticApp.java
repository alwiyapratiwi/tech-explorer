package oop.application;

import static oop.data.Application.PROCESSORS;
import static oop.data.Constant.*;

import oop.data.Country;
import oop.util.MathUtil;

public class StaticApp {

	public static void main(String[] args) {
		
		System.out.println(APPLICATION);
		System.out.println(VERSION);
		
		System.out.println(
			MathUtil.sum(1, 1, 5, 1, 1)
		);
		
		Country.City city = new Country.City();
		city.setName("Medan");
		
		System.out.println(city.getName());
		
		System.out.println(PROCESSORS);
		
	}

}
