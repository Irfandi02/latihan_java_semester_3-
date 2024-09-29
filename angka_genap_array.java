
package com.mycompany.mavenproject10;

import java.util.Scanner;

public class Mavenproject10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Msukkkan index : ");
        int index = input.nextInt();
        int[] bilangan = new int [index];
        int jumlah = 0;
        System.out.print("Masukkan angka : ");
        for (int i = 0; i < bilangan.length; i++) {
            System.out.print("Angka -"+(i + 1)+ ": ");
            bilangan[i] = input.nextInt();
            
                    
            
        }
        System.out.print(" jumlah angka genap dari array adalah : ");
        for(int i : bilangan){
            if(i % 2==0){
                jumlah += i;
            }
        }
        System.out.println(jumlah);
        
    }
}
