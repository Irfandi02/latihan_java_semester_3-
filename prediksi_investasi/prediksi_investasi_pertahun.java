package prediksi_investasi;

import java.util.Scanner;

public class Prediksi_investasi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan modal awal :");
        double modal_awal = sc.nextDouble();

        System.out.print("masukkan lama lama investasi (tahun) :");
        int tahun = sc.nextInt();
        System.out.println("================================================");

        for (int i = 1; i <= tahun; i++) {
            double keuntungan = modal_awal * 0.05;
            modal_awal += keuntungan;
            System.out.println("tahun :" + i + " modal awal : Rp =" + modal_awal + " keuntungan :Rp =" + keuntungan);

        }

    }
}
