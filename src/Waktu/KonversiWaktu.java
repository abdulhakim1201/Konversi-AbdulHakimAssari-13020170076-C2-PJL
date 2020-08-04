/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Waktu;
import java.util.Scanner;

public class KonversiWaktu {
    
 public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int detik, menit;
       double jam,s1,s2;
       
        System.out.print("Masukkan Detik : ");
        detik = input.nextInt();
        
        jam = detik/3600;
        s1 = detik%3600;
        
        menit = (int) s1/60;
        s2 = s1%60;
        
        System.out.println(detik+" Detik = "+jam+" Jam");
        System.out.println(menit+" Menit = "+s2+" Detik");
        
    }
    
}
