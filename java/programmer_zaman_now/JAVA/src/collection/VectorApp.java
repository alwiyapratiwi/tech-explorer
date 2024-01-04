package collection;

import java.util.List;
import java.util.Vector;

public class VectorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		mirip dengan ArrayList, perbedaan menggunakan synchronized artinya thread safe
//		performa menjadi lambat
		
		List<String> list = new Vector<>();
		
		list.add("Alwiya");
		list.add("Pratiwi");
		list.add("Programmer");
		
		for(var value : list) {
			System.out.println(value);
		}
		

	}

}
