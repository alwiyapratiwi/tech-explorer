package oop.application;

import oop.data.Avanza;
import oop.data.Car;

public class CarApp {

	public static void main(String[] args) {
		
		Car car = new Avanza();
		car.drive();
		System.out.println(car.getTire());

	}

}
