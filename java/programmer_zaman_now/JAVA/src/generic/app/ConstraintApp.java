package generic.app;

public class ConstraintApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberData<Integer> integerNumberData = new NumberData<>(1);
		NumberData<Long> longNumberData = new NumberData<>(100L);
		
//		NumberData<String> stringNumberData = new NumberData<>("Eko");	// ERROR

	}
	
//	membatasi dengan tipe data yang merupakan atau termasuk Number saja
	public static class NumberData<T extends Number> {
		private T data;

		public NumberData(T data) {
			this.data = data;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}
		
		
		
		
	}

}
