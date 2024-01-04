package oop.application;

public class EqualsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String first = "Alwiya";
		first = first + " Pratiwi";
		System.out.println(first);
		
		String second = "Alwiya Pratiwi";
		System.out.println(second);
		
//		== jika objek makanya membandingkan posisi
		System.out.println(first == second);
		
//		gunakan method equals untuk membandingkan konten/isi objek
		System.out.println(first.equals(second));
		
		String third = "Alwiya Pratiwi";
		
//		true, karena jika 2 objek dengan isi yang sama maka dia akan menggunakan objek yang sebelumnya
		System.out.println(second == third);
		System.out.println(second.equals(third));

	}

}
