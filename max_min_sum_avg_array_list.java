
package com.mycompany.nomor4;

import java.util.ArrayList;

public class Nomor4 {

    public static void main(String[] args) {
     ArrayList<Double> data = new ArrayList<>();
        data.add(91.35);
        data.add(4.72);
        data.add(26.0);
        data.add(3.5);
        data.add(8.0);
        data.add(61.0);
        data.add(65.36);
        data.add(12.0);
        data.add(5.6);
        data.add(7.11);
        data.add(27.0);
        data.add(9.35);
        data.add(549.0);
        data.add(2.23);
        data.add(17.31);
        data.add(4.25);
        data.add(2.13);
        data.add(83.0);
        data.add(7.0);
        data.add(102.0);
        data.add(53.21);
        data.add(3.42);
        data.add(0.21);
        data.add(70.02);
        data.add(819.4);
        data.add(6173.0);
        data.add(4.25);
        data.add(19.8);
        data.add(17.35);
        data.add(5.768);
        
         double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0;
        double n = 0;

        System.out.println("Data:");
        for (int i = 0; i < data.size(); i++) {
            System.out.println(" " + data.get(i));
            if(data.get(i)<min){
                min = data.get(i);
            }
            if (data.get(i)>max){
                max = data.get(i);
            }
           sum += data.get(i);
        n++; 
            
        }
        double AVG = sum/ (double)n;
        System.out.println("MIN"+min);
        System.out.println("MAX"+max);
        System.out.println("SUM"+sum);
        System.out.println("AVG"+AVG);
        

        }
      }
