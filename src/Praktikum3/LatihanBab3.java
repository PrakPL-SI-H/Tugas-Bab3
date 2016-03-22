package Praktikum3;

import java.util.Scanner;

public class LatihanBab3 {

    public static void main(String[] args) {
        Conversion number = new Conversion();
        Scanner in = new Scanner(System.in);
        String line = "========================================================";
        int pick;
        do {
            System.out.println(line);
            System.out.println("Conversion Program");
            System.out.println("Indonesian");
            System.out.println(line);
            System.out.println("1. Number to Words[0-100]");
            System.out.println("2. Words to Number[0-100]");
            System.out.println("0. Exit");
            System.out.print("Pick menu     : ");
            pick = in.nextInt();
            switch (pick){
                case 1:
                    System.out.println(line);
                    System.out.print("Enter number[0 - 100]         : ");
                    number.overloadingMeth(in.nextInt());
                    break;
                case 2:
                    System.out.println(line);
                    String use = in.nextLine();
                    System.out.print("Enter words[Nol s/d Seratus]  : ");
                    number.overloadingMeth(in.nextLine());
                    break;
                
                
            }
        } while (pick != 0);
    }
}
