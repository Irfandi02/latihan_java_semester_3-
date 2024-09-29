
package com.mycompany.berek;
public class Berek {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i == 5){
                break;
            }
            System.out.println(i);  
        }
         for (int i = 0; i < 10; i++) {
             if(i==7){
                 continue;
        }
             System.out.println(i);
            
        }
    }
}
