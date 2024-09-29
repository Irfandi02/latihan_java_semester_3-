_
package com.mycompany.nomor2;
import java.util.Arrays;

public class Nomor2 {

    public static void main(String[] args) {
        // Data yang akan disimpan
        double[] data = new double[]{
            91.35, 4.72, 26, 3.5, 8, 61, 65.36, 12, 5.6, 7.11,
            27, 9.53, 549, 2.23, 17.31, 4.25, 2.13, 83, 7, 102.4,
            53.21, 3.42, 0.21, 70.02, 819.4, 6173, 4.25, 19.8, 17.35, 5.768
        };

       double min = Double.MAX_VALUE;
       double max = Double.MIN_VALUE;
       double sum = 0.0;
       int n = 0;
        
        for (int i = 0; i < data.length; i++) {
          if(data[i]<min){
              min = data[i];
            }
          if(data[i]>max){
              max = data[i];
          } 
            System.out.println(data[i]+" ");
            sum += data[i];
            n++;
        }
        System.out.println(" ] ");
        double AVG = sum /data.length;
        System.out.println("MIN"+min);
        System.out.println("MAX"+max);
        System.out.println("SUM"+sum);
        System.out.println("AVG"+AVG);
        }
    

       
     


    
    }

