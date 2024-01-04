package standard_classes;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan nama anda: ");
		String name = input.nextLine();
		System.out.println("Halo " + name);
		
	}

}
