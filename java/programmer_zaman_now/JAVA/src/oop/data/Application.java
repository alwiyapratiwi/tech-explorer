package oop.data;

public class Application {
	
	public static int PROCESSORS;
	
//	static blok akan dieksekusi sekali sebelum kelas ini diload
//	hanya bisa method static
	static {
		System.out.println("Mengakses Class Application");
		PROCESSORS = Runtime.getRuntime().availableProcessors();
	}

}
