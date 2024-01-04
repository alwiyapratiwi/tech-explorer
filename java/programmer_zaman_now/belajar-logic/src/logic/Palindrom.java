package logic;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan string : ");
		String str = input.next();
		
		String hasil = Palindrom(str);
		System.out.println(hasil);
		
		input.close();
	}
	
	
	public static String Palindrom(String str) {
		int panjang = str.length();
		
		for(int i=0; i < panjang/2; i++) {
			if(str.charAt(i) != str.charAt(panjang - 1 - i)) {
				return "bukan palindrom";
			}
		}
		return "palindrom";
	}
	
}
