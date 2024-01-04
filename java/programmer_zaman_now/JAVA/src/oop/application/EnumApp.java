package oop.application;

import oop.data.Customer;
import oop.data.Level;

public class EnumApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setName("Alwiya");
		customer.setLevel(Level.VIP);
		
		System.out.println(customer.getName());
		System.out.println(customer.getLevel().getDescription());
		
		String levelName = Level.VIP.name();
		System.out.println(levelName);
		
//		konversi 
		Level level = Level.valueOf("PREMIUM");
		System.out.println(level);
		
		Level[] levels = level.values();
		System.out.println(levels);
		
		for(var value : level.values()) {
			System.out.println(value);
		}
		
	}

}
