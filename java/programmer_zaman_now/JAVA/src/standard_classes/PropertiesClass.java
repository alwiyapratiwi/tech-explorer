package standard_classes;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class PropertiesClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		class yang bisa kita gunakan untuk mengambil atau menyimpan informasi ke file properties
		
		try {
			
			Properties properties = new Properties();
			properties.load(new FileInputStream("application.properties"));
			
			String host = properties.getProperty("database.host");
			String port = properties.getProperty("database.port");
			String username = properties.getProperty("database.username");
			String password = properties.getProperty("database.password");
			
			System.out.println(host);
			System.out.println(port);
			System.out.println(username);
			System.out.println(password);
			
		} catch (FileNotFoundException e) {
			System.out.println("File tidak ketemu");
		} catch (IOException e) {
			System.out.println("Gagal load data");
		}
		
		
		try {
			
			Properties properties = new Properties();
			properties.put("name.first", "Alwiya");
			properties.put("name.last", "Pratiwi");
			
			properties.store(new FileOutputStream("name.properties"), "Konfigurasi nama");
			
		} catch (FileNotFoundException e) {
			System.out.println("Error membuat file properties");
		} catch (IOException e) {
			System.out.println("Error menyimpan file properties");
		}

	}

}
