package mainkonversi;

import java.util.Scanner;

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
                     System.out.println(new MainKonversi().angkaKonversi(in.nextLong()));
                     break;
            case 2 : System.out.println("Masukkan bilangan dari 0-100 dalam bentuk kata : " );
                     in.nextLine();
                     String kata = in.nextLine();
                     me.overloading(kata);
                     me.display();
                     break;
            default: System.out.println("Masukkan angka yang benar");
        }            
    }
    
    public static String angkaKonversi(Long angka){
    if (angka<12){
        return angkabilangan[angka.intValue()];}
    if (angka>=12 && angka <= 19){
        return angkabilangan[angka.intValue()%10]+" belas ";}
    if (angka>=20 && angka <= 99){
        return angkaKonversi(angka/10)+" puluh "+ angkabilangan[angka.intValue()%10];}
    if (angka==100){
        return "seratus";}
    return "";
    }
    
    public void overloading (String y){
    Bilangan=y;
    x=y.split(" ");
    }
    
    public int translate (String[] y){
    int translate=0;
        for (int i = 0; i <x.length; i++) {
            if (y[i].equalsIgnoreCase("nol"))
                translate+=0;
            else if (y[i].equalsIgnoreCase("satu"))
                translate+=1;
            else if (y[i].equalsIgnoreCase("dua"))
                translate+=2;
            else if (y[i].equalsIgnoreCase("tiga"))
                translate+=3;
            else if (y[i].equalsIgnoreCase("empat"))
                translate+=4;
            else if (y[i].equalsIgnoreCase("lima"))
                translate+=5;
            else if (y[i].equalsIgnoreCase("enam"))
                translate+=6;
            else if (y[i].equalsIgnoreCase("tujuh"))
                translate+=7;
            else if (y[i].equalsIgnoreCase("delapan"))
                translate+=8;
            else if (y[i].equalsIgnoreCase("sembilan"))
                translate+=9;
            else if (y[i].equalsIgnoreCase("puluh"))
                translate*=10;
            else if (y[i].equalsIgnoreCase("belas"))
                translate+=10;
            else if (y[i].equalsIgnoreCase("sepuluh"))
                translate+=10;
            else if (y[i].equalsIgnoreCase("sebelas"))
                translate+=11;
            else if (y[i].equalsIgnoreCase("seratus"))
                translate+=100;
            else translate+=1000;
        }
        return translate;
    }
    
    public int getHasil(){
        Angka=translate(x);
        return Angka;
    }
    public void display(){
        if (getHasil()>100)
            System.out.println(Bilangan+" = Maaf masukan anda melebihi batas");
        else System.out.println(Bilangan+" = "+getHasil());
    }   
}
