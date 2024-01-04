package standard_classes;

public class RuntimeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runtime runtime = Runtime.getRuntime();
		
		System.out.println(runtime.availableProcessors());
		System.out.println(runtime.freeMemory());
		System.out.println(runtime.totalMemory());
		System.out.println(runtime.maxMemory());

	}

}
