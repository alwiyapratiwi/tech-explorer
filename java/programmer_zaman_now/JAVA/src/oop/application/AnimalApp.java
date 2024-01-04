package oop.application;

import oop.data.Animal;
import oop.data.Cat;
import oop.data.Sapi;

public class AnimalApp {

	public static void main(String[] args) {
		
		Animal animal = new Cat();
		animal.name = "Pusss";
		animal.run();
		
		Animal animal1 = new Sapi();
		animal1.name = "Mooo";
		animal1.run();

	}

}
