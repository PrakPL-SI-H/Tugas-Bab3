/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainkonversi;

import java.util.Scanner;

/**
 *
 * @author ASUS-A455L
 */
public class MainKonversi {
    String Bilangan;
    int Angka;
    String [] x;
    static String [] angkabilangan = {"nol","satu","dua","tiga","empat","lima","enam","tujh","delapan","sembilan","sepuluh","sebelas"};
    
    public static void main(String[] args) {
        MainKonversi me = new MainKonversi();
        Scanner in = new Scanner (System.in);
        System.out.println("Konversi Bilangan");
        System.out.println("1 . angka ke huruf");
        System.out.println("2 . huruf ke angka");
        System.out.print("Masukkan pilahn : ");
        int pil = in.nextInt();
        switch (pil){
            case 1 : System.out.println("Masukkan angka yang dikonversikan : ");
                     System.out.println();
                     break;
            case 2 : System.out.println("Masukkan bilangan dari 0-100 dalam bentuk kata : " );
                     in.nextLine();
                     String kata = in.nextLine();
                     
                     break;
            default: System.out.println("Masukkan angka yang benar");
        }            
    }
    
    
}
