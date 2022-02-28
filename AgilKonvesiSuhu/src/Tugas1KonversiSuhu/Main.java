/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1KonversiSuhu;

import java.util.Scanner;
/**
 *
 * @author ACER
 */
        
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pil;
        double sebelum;
        System.out.println("KONVERSI SUHU AIR");
        System.out.println("_________________");
        System.out.println(" ");
        System.out.print("Masukan suhu dalam Celcius : ");sebelum = input.nextInt();
        
        
        do{
            Konversi setelah = new Konversi(sebelum);
            System.out.println("1. Lihat Data ");
            System.out.println("2. Input Ulang");
            System.out.println("3. Exit");
            System.out.print("Pilih   : ");pil=input.nextInt();
            
            if(pil==1){
                System.out.println("");
                System.out.println("Celcius     : " + sebelum + "°C");
                System.out.println("Farenheit   : " + setelah.farenheit() + "°F");
                System.out.println("Reamur      : " + setelah.reamur() + "°R");
                System.out.println("Kelvin      : " + setelah.kelvin() + "K");
                System.out.println("Kondisi Air " + setelah.kondisiair());
                
            }else if (pil==2){
                 System.out.println("KONVERSI SUHU AIR");
                 System.out.println("_________________");
                 System.out.println(" ");
                 System.out.print("Masukan suhu dalam Celcius : ");sebelum = input.nextInt();
                
            }else if (pil > 3 || pil < 1){
                System.out.println("Masukan pilihan yang tersedia");
            }
        } while (pil !=3);
    }  
}