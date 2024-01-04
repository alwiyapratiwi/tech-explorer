package logic;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan string : ");
		String str = input.next();
		
		String hasil = reverseString(str);
		System.out.println(hasil);
		
		input.close();
	}
	
	public static String reverseString(String str) {
		String reverseString = "";
		for(int i = str.length()-1; i>=0; i--) {
			reverseString += str.charAt(i);
		}
		return reverseString;
	}

}
