package gajibersih_karyawan;

import java.util.Scanner;

public class GajiBersih_karyawan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan penghasilan perbulan :Rp = ");
        double penghasilan_perbulan = sc.nextDouble();
        sc.nextLine();
        System.out.println("masukkan jenis pekerjaan (pns / non-pns)");
        String jenis_pekerjaan = sc.nextLine();

        double pajak = 0.0;

        if (penghasilan_perbulan >= 5000.000) {
            System.out.println("dikenakan pajak 10%");
            pajak = 0.1;

        } else if (penghasilan_perbulan >= 3000.000) {
            System.out.println("dikanakan pajak 5%");
            pajak = 0.05;

        }
        if (jenis_pekerjaan.equalsIgnoreCase("pns")) {
            System.out.println("dikenakan pajak 5% ");
            pajak += 0.05;

        }

        double gajiBersih_perbulan = penghasilan_perbulan - (penghasilan_perbulan * pajak);

        System.out.println("penghasilan bersih tiap bulan adalah =" + penghasilan_perbulan);

    }

}
