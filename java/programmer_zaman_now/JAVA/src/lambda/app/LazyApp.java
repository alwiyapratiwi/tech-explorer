package lambda.app;

import java.util.function.Supplier;

public class LazyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Lazy parameter -> hanya akan dieksekusi kalau memang dibutuhkan saja
		
		testScore(60, () -> getName());

	}
	
	public static void testScore(int score, Supplier<String> name) {
		if(score > 80) {
			System.out.println("Selamat " + name.get() + ", Anda Lulus");
		} else {
			System.out.println("Coba Lagi Tahun Depan");
		}
	}
	
	public static String getName() {
		System.out.println("Method getName() dipanggil");
		return "Eko";
	}

}
