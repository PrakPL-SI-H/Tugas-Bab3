/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainangka.java;

public class Ubah {

    public void overloadingMeth(int bil) {
        String[] nama = {"", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas",};
        if (bil == 0) {
            System.out.println("nol");
        } else if (bil > 0 && bil < 12) {
            System.out.println(nama[bil]);
        } else if (bil > 11 && bil < 20) {
            System.out.println(nama[bil % 10] + " belas");
        } else if (bil >= 20 && bil < 100) {
            System.out.printf("%s puluh %s\n", nama[bil / 10], nama[bil % 10]);
        } else {
            System.out.println("seratus");
        }
    }

    public void overloadingMeth(String angka) {
        String[] a = angka.split(" ");
        for (int i = 0; i < a.length; i++) {
            if (a.length == 2 && a[i].equalsIgnoreCase("nol")) {
                System.out.print(0);
            } else if (a.length == 2 && a[i].equalsIgnoreCase("satu")) {
                System.out.print(1);
            } else if (a[i].equalsIgnoreCase("dua")) {
                if (a.length == 2 && a[1].equalsIgnoreCase("belas")) {
                    System.out.print(12);
                } else if (a.length == 2 && a[1].equalsIgnoreCase("puluh")) {
                    System.out.print(20);
                } else {
                    System.out.print(2);
                }
            } else if (a[i].equalsIgnoreCase("tiga")) {
                if (a.length == 2 && a[1].equalsIgnoreCase("belas")) {
                    System.out.print(13);
                } else if (a.length == 2 && a[1].equalsIgnoreCase("puluh")) {
                    System.out.print(30);
                } else {
                    System.out.print(3);
                }
            } else if (a[i].equalsIgnoreCase("empat")) {
                if (a.length == 2 && a[1].equalsIgnoreCase("belas")) {
                    System.out.print(14);
                } else if (a.length == 2 && a[1].equalsIgnoreCase("puluh")) {
                    System.out.print(40);
                } else {
                    System.out.print(4);
                }
            } else if (a[i].equalsIgnoreCase("lima")) {
                if (a.length == 2 && a[1].equalsIgnoreCase("belas")) {
                    System.out.print(15);
                } else if (a.length == 2 && a[1].equalsIgnoreCase("puluh")) {
                    System.out.print(50);
                } else {
                    System.out.print(5);
                }
            } else if (a[i].equalsIgnoreCase("enam")) {
                if (a.length == 2 && a[1].equalsIgnoreCase("belas")) {
                    System.out.print(16);
                } else if (a.length == 2 && a[1].equalsIgnoreCase("puluh")) {
                    System.out.print(60);
                } else {
                    System.out.print(6);
                }
            } else if (a[i].equalsIgnoreCase("tujuh")) {
                if (a.length == 2 && a[1].equalsIgnoreCase("belas")) {
                    System.out.print(17);
                } else if (a.length == 2 && a[1].equalsIgnoreCase("puluh")) {
                    System.out.print(70);
                } else {
                    System.out.print(7);
                }
            } else if (a[i].equalsIgnoreCase("delapan")) {
                if (a.length == 2 && a[1].equalsIgnoreCase("belas")) {
                    System.out.print(18);
                } else if (a.length == 2 && a[1].equalsIgnoreCase("puluh")) {
                    System.out.print(80);
                } else {
                    System.out.print(8);
                }
            } else if (a[i].equalsIgnoreCase("sembilan")) {
                if (a.length == 2 && a[1].equalsIgnoreCase("belas")) {
                    System.out.print(19);
                } else if (a.length == 2 && a[1].equalsIgnoreCase("puluh")) {
                    System.out.print(90);
                } else {
                    System.out.print(9);
                }
            } else if (a[i].equalsIgnoreCase("sepuluh")) {
                System.out.print(10);
            } else if (a[i].equalsIgnoreCase("sebelas")) {
                System.out.print(11);
            } else if (a[i].equalsIgnoreCase("puluh")) {
                System.out.print("");
            } else {
                System.out.print(100);
            }
            if (a.length == 2) {
                break;
            }
        }
        System.out.println("");

    }
}

void overloadingMeth(int nomor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void overloadingMeth(String bil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
