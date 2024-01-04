package oop.data;

import java.util.Objects;

public class Product {
	
	public String name;
	protected int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
//	toString method -> override object
	public String toString() {
		return "product name: " + name + ", price " + price;
	}


//	selalu override method equals ketika membuat class
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}

	
	
	
}
