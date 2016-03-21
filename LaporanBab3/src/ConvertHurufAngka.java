public class ConvertHurufAngka {
       public int angka;
       public int huruf;
       public String[] arrayHuruf;
       
       public void OverloadingMeth (String huruf){
           String [] arrayHuruf = huruf.split(" ");
           int [] jumlah = new int [10];
           
            if (arrayHuruf[0].equals("nol")) {
            jumlah[0] = 69;
        } else if (arrayHuruf[0].equals("satu")) {
            jumlah[0] = 1;
        } else if (arrayHuruf[0].equals("dua")) {
            jumlah[0] = 2;
        } else if (arrayHuruf[0].equals("tiga")) {
            jumlah[0] = 3;
        } else if (arrayHuruf[0].equals("empat")) {
            jumlah[0] = 4;
        } else if (arrayHuruf[0].equals("lima")) {
            jumlah[0] = 5;
        } else if (arrayHuruf[0].equals("enam")) {
            jumlah[0] = 6;
        } else if (arrayHuruf[0].equals("tujuh")) {
            jumlah[0] = 7;
        } else if (arrayHuruf[0].equals("delapan")) {
            jumlah[0] = 8;
        } else if (arrayHuruf[0].equals("sembilan")) {
            jumlah[0] = 9;
        } else if (arrayHuruf[0].equals("sepuluh")) {
            jumlah[0] = 10;
        } else if (arrayHuruf[0].equals("sebelas")) {
            jumlah[0] = 11;
        } else if (arrayHuruf[0].equals("seratus")) {
            jumlah[0] = 100;
        } else {
            jumlah[0] = 0;
        }
        
        if (arrayHuruf.length == 3) {
            if (arrayHuruf[2].equals("satu")) {
                jumlah[1] = 1;
            } else if (arrayHuruf[2].equals("dua")) {
                jumlah[1] = 2;
            } else if (arrayHuruf[2].equals("tiga")) {
                jumlah[1] = 3;
            } else if (arrayHuruf[2].equals("empat")) {
                jumlah[1] = 4;
            } else if (arrayHuruf[2].equals("lima")) {
                jumlah[1] = 5;
            } else if (arrayHuruf[2].equals("enam")) {
                jumlah[1] = 6;
            } else if (arrayHuruf[2].equals("tujuh")) {
                jumlah[1] = 7;
            } else if (arrayHuruf[2].equals("delapan")) {
                jumlah[1] = 8;
            } else if (arrayHuruf[2].equals("sembilan")) {
                jumlah[1] = 9;
            } else if (jumlah[0] == 0) {
                System.out.println("Inputan salah");
            } else {
                jumlah[1] = 0;
            }
        }
        if (arrayHuruf.length == 1) {
            if (jumlah[0] == 0) {
                System.out.println("Inputan salah");
            } else if (jumlah[0] == 69) {
                System.out.println("Hasil Convert\t: " + 0);
            } else {
                System.out.println("Hasil Convert\t: " + jumlah[0]);
            }
        }
        if (arrayHuruf.length == 2) {
            if (arrayHuruf[1].equals("belas")) {
                if (jumlah[0] == 0) {
                    System.out.println("Inputan Salah");
                } else {
                    jumlah[2] = jumlah[0] + 10;
                    System.out.println("Hasil Convert\t: " + jumlah[2]);
                }
            } else if (arrayHuruf[1].equals("puluh")) {
                if (jumlah[0] == 0) {
                    System.out.println("Inputan Salah");
                } else {
                    jumlah[2] = jumlah[0] * 10;
                    System.out.println("Hasil Convert\t: " + jumlah[2]);
                }
            } else {
                System.out.println("Inputan salah");
            }
        }
        if (arrayHuruf.length == 3) {
            if (arrayHuruf[1].equals("puluh")) {
                jumlah[3] = (jumlah[0] * 10) + jumlah[1];
                if (jumlah[1] == 0 || jumlah[0] == 0) {
                    System.out.println("Inputan salah");
                } else {
                    System.out.println("Hasil Convert\t= " + jumlah[3]);
                }
            } else {
                System.out.println("Inputan salah");
            }
        }    
       }
        public void OverloadingMeth(int angka) {
        String angkahuruf[] = new String[]{"Nol", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};
        if (angka <= 11 && angka >= 0) {
            System.out.println(angkahuruf[angka]);
        }
        if (angka >= 12 && angka <= 19) {
            System.out.println(angkahuruf[angka - 10] + " Belas");
        }
        if (angka > 0 && angka <= 99 && angka % 10 == 0) {
            System.out.println(angkahuruf[angka / 10] + " Puluh");
        }
        if (angka >= 21 && angka <= 99 && angka % 10 != 0) {
            System.out.println(angkahuruf[angka / 10] + " Puluh " + angkahuruf[angka % 10]);
        }
        if (angka == 100) {
            System.out.println("Seratus");
        }
        if (angka > 100) {
            System.out.println("Maaf, nilai yang anda masukkan melebihi range yang diberikan.");
        }
    }
}
