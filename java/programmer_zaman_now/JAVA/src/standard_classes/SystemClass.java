package standard_classes;

public class SystemClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(System.currentTimeMillis());
		System.out.println(System.nanoTime());
		
		System.out.println(System.getenv("PUBLIC"));
		
//		garbage collection
		System.gc();
		
//		menghentikan program
		System.exit(0);
		
		System.out.println("Tes exit");
	}

}
