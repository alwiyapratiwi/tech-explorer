package lambda.app;

import java.util.function.Supplier;

public class SupplierApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		INTERFACE SUPPLIER -> butuh lambda dimana ketika dipanggil lambdanya dia ngebalikin rseult tanpa harus kirim parameter
		
		Supplier<String> supplier = () -> "Alwiya Pratiwi";
		
		System.out.println(supplier.get());

	}

}
