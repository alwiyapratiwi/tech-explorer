package oop.data;

public interface Car extends HasBrand, IsMaintenance {
	
//	public abstract void drive();
	void drive();
	
	int getTire();
	
//	method default -> menambahkan konkrit method di interface agar tidak perlu override di sebelumnya
	default boolean isBig() {
		return false;
	}

}
