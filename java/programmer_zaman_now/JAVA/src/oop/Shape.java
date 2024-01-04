package oop;

class Shape {

	int getCorner() {
		return 0;
	}
	
}

class Rectangle extends Shape {
	
	int getCorner() {
		return 4;
	}
	
	int getParentCorner() {
//		keyword super untuk mengakses class parent
		return super.getCorner();
	}
}
