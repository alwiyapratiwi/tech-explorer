package logic;

public class Hello {
    public static void main(String []args){
        // total harga  >70rb and <= 200rb  =>5% topi
        //              >200rb and <=400rb  =>7% payung 
        //              >400                =>10% ransel
        
        
        int[] hargaProduk = {2000, 50000, 100000};
        solution(hargaProduk);
    }

	
	public static void solution(int[] hargaProduk) {
        int totalHarga = 0;

        // total harga
        for (int harga : hargaProduk) {
            totalHarga += harga;
        }

        // diskon dan bonus
        double diskon = 0;
        String bonus = "";

        if (totalHarga > 70000 && totalHarga <= 200000) {
            diskon = 0.05 * totalHarga;
            bonus = "topi";
        } else if (totalHarga > 200000 && totalHarga <= 400000) {
            diskon = 0.07 * totalHarga;
            bonus = "payung";
        } else if (totalHarga > 400000) {
            diskon = 0.10 * totalHarga;
            bonus = "ransel";
        }

        // harga akhir
        double hargaAkhir = totalHarga - diskon;

        // hasil
        System.out.println("Total harga = " + totalHarga);
        System.out.println("Diskon = " + diskon);
        System.out.println("Bonus = " + bonus);
        System.out.println("Harga akhir = " + hargaAkhir);
    }


}
