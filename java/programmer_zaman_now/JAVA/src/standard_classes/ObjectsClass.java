package standard_classes;

import java.util.Objects;

public class ObjectsClass {
	
	public static class Data {
		
		private String data;

		public Data(String data) {
			super();
			this.data = data;
		}



		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		@Override
		public int hashCode() {
			return Objects.hash(data);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Data other = (Data) obj;
			return Objects.equals(data, other.data);
		}

		@Override
		public String toString() {
			return "Data [data=" + data + "]";
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		melakukan pengecekan sebelum operasi dilakukan
		execute(new Data("Alwiya"));
		

	}
	
	public static void execute(Data data) {
//		if(data != null) {
//			System.out.println(data.toString());
//			System.out.println(data.hashCode());
//		}
		
		System.out.println(Objects.toString(data));
		System.out.println(Objects.hashCode(data));
		
	}

}
