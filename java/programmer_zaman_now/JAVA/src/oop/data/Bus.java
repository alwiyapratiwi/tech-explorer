package oop.data;

public class Bus implements Car{

	public int getTire() {
		return 8;
	}
	
	public void drive() {
		System.out.println("Bus drive");
	}
	
	public String getBrand() {
		return "Hino";
	}
	
	public boolean isMaintenance() {
		return false;
	}
	
	public boolean isBig() {
		return true;
	}
	
}
