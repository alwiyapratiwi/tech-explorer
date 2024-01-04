package oop.application;
import oop.error.DatabaseError;

public class DatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		connectDatabase("a", null);
		System.out.println("sukses");

	}
	
	public static void connectDatabase(String username, String password) {
		if(username == null || password == null) {
			throw new DatabaseError("Tidak bisa konek ke database");
		}
	}

}
