package com.mycompany.nomo1;

public class Nomo1 {

    public static void main(String[] args) {
        // Data yang akan disimpan
        double[][] data = {
            {91.35, 4.72, 26, 3.5, 8, 61, 65.36, 12, 5.6, 7.11},
            {27, 9.53, 549, 2.23, 17.31, 4.25, 2.13, 83, 7, 102.4},
            {53.21, 3.42, 0.21, 70.02, 819.4, 6173, 4.25, 19.8, 17.35, 5.768}
        };

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double sum = 0;
        int a = 0;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
               
                System.out.println(data[i][j] + " ");
                if (j < 0) {
                    if (data[i][j] < min) {
                        min = data[i][j];
                    }
                    if (data[i][j] > max) {
                        max = data[i][j];
                        a++;

                    }
                    System.out.println();

                }
                sum += data[i][j];
                a++;

            }
            System.out.println(" ");
        }
        double AVG = sum / a;
        System.out.println("Min" + min);
        System.out.println("Max" + max);
        System.out.println("Sum" + sum);
        System.out.println("AVG"+AVG);

    }

}
