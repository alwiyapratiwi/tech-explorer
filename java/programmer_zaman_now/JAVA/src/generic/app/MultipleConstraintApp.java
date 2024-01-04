package generic.app;

public class MultipleConstraintApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Data<Manager> managerData = new Data<>(new Manager());	// ERROR jika manager tidak implements CanSayHello
		Data<VicePresident> vicePresidentData = new Data<>(new VicePresident());
		

	}
	
	public static interface CanSayHello {
		void sayHello(String name);
	}
	
	public static abstract class Employee {
		
	}
	
	public static class Manager extends Employee {
		
	}
	
	public static class VicePresident extends Employee implements CanSayHello {

		@Override
		public void sayHello(String name) {
			// TODO Auto-generated method stub
			System.out.println("Hello " + name);
		}
	}
	
	public static class Data<T extends Employee & CanSayHello> {
		private T data;
		
		public Data(T data) {
			this.data = data;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
			this.data.sayHello(null);
		}
		
		
	}

}
