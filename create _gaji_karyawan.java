package com.mycompany.gajikaryawan;

import java.util.Scanner;

public class Gajikaryawan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float persenPajak = 0.15f, persenTunjangan = 0.2f;

        String nama;

        float gajiPokok, gajiBersih, tunjangan, pajak;

        System.out.println("\n\t Menghitung Gaji Kryawan \n\n");

        System.out.print("\n Nama Karyawan : ");
        nama = input.nextLine();

        System.out.print("\n Gaji Pokoknya : Rp. ");
        gajiPokok = input.nextFloat();

        tunjangan = persenTunjangan * gajiPokok;
        System.out.println("\n Tunjangannya sebesar : Rp. " + tunjangan);

        pajak = persenPajak * (gajiPokok + tunjangan);
        System.out.println("\n Pajaknya sebesar : Rp. " + pajak);

        gajiBersih = gajiPokok + tunjangan - pajak;
        System.out.print("\n Gaji Bersih Karyawan : Rp. " + gajiBersih);

        System.out.println(" ");
    }
}
